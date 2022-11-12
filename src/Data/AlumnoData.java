package Data;

import Entidades.Alumno;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Grupo10
 */
public class AlumnoData {

    private Connection conx = null;

    public AlumnoData() {
        this.conx = Coneccion.getConeccion();
    }

    public void guardarAlumno(Alumno alu) {  //INSERT INTO
//INSERT INTO `alumno`(`idAlumno`, `nombre`, `apellido`, `fechaNac`, `dni`, `activo`) VALUES (?,?,?,?,?);
        String query = "INSERT INTO alumno(nombre, apellido, fechaNac, dni, activo) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alu.getNombre());
            ps.setString(2, alu.getApellido());
            ps.setDate(3, Date.valueOf(alu.getFechaNac()));
            ps.setInt(4, alu.getDni());
            ps.setBoolean(5, alu.isActivo());
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "AlumnoData Info : Carga Exitosa");
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    alu.setIdAlumno(rs.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(null, "AlumnoData Error: No se pudo Recuperar el ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "AlumnoData Error: No se pudo Agregar");
            }            
            ps.close();
        } catch (SQLException excep) {
            JOptionPane.showMessageDialog(null, "AlumnoData Error: " + excep);
        }
    }

    public Alumno buscarAlumno(int idAlu) {   //SELECT 1 ALUMNO Activo x ID
        //Creo un alumno, instancio un query..
        Alumno alu = new Alumno();
        String query =  "SELECT * FROM alumno WHERE activo = 1 AND idAlumno = ? ";
        //Try: Ps/ ps.set(id xparametro).. / rs.. /if(next) ../ Set alu / ps.Close...
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, idAlu);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //idAlumno, nombre, apellido, fechaNac, dni, activo
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                alu.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alu.setDni(rs.getInt("dni"));
                alu.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "AlumnoData Error:\n No se encuentra el alumno/activo");
                return null;
            }
            ps.close();    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AlumnoData Error:\n" + e);
            return null;
        }    
        return alu;
    }

    public ArrayList<Alumno> listarAlumnos() {    //SELECT * Alumno
        ArrayList<Alumno> arrAlu = new ArrayList();
        String query = "SELECT * FROM alumno WHERE activo = 1"; 
        //idAlumno, `nombre`, `apellido`, `fechaNac`, `dni`, `activo`
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                alu.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alu.setDni(rs.getInt("dni"));
                alu.setActivo(rs.getBoolean("activo"));
                
                arrAlu.add(alu);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AlumnoData Error: " + e);
        }
        return arrAlu;
    }

    public void actualizarAlumno(Alumno alu) { //UPDATE SET
        //UPDATE `alumno` SET nombre=?,apellido=?,fechaNac=?,dni=?,activo=? WHERE idAlum = ?;
        String query = "UPDATE alumno SET nombre=?,apellido=?,fechaNac=?,dni=?,activo=? WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setString(1, alu.getNombre());
            ps.setString(2, alu.getApellido());
            ps.setDate(3, Date.valueOf(alu.getFechaNac()));
            ps.setInt(4, alu.getDni());
            ps.setBoolean(5, alu.isActivo());
            ps.setInt(6, alu.getIdAlumno());
            if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "AlumnoData Info:\nDatos Actualizados" );                
            }else {
                JOptionPane.showMessageDialog(null, "AlumnoData Error:\nLos Datos no pudieron ser Actualizados");
            }
            ps.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AlumnoData Error: " + e);
        }        
    }

    public void borrarAlumno(int id) {   //UPDATE SET / DELETE
        //UPDATE `alumno` SET activo=0 WHERE idAlumno = 1; 
        String query = "UPDATE alumno SET activo=0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, id);
            if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "AlumnoData Info:\nBorrado de Alumno Exitoso" );                                
            }else {
                JOptionPane.showMessageDialog(null, "AlumnoData Error:\nNO pudo borrarse el alumno" ); 
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AlumnoData ERROR:\n" +e ); 
        }       
    }
}

