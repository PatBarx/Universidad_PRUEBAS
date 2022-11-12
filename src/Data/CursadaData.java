package Data;

import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import java.sql.Connection;
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
public class CursadaData {

    private Connection conx = null;
    private AlumnoData aluD;
    private MateriaData matDa;

    public CursadaData() {
        this.conx = Coneccion.getConeccion();
        this.aluD = new AlumnoData();
        this.matDa = new MateriaData();
    }

    

    public void guardarCursada(Cursada cur) {
        //INSERT INTO `cursada`(`idAlumno`, `idMateria`, `nota`) VALUES (?,?,?)
        String query = "INSERT INTO cursada(idAlumno, IdMateria, nota) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cur.getAl().getIdAlumno());
            ps.setInt(2, cur.getMa().getIdMateria());
            ps.setDouble(3, cur.getNota());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "CursadaData Info : Carga Exitosa");
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    cur.setIdCursada(rs.getInt(1));  
                } else {
                    JOptionPane.showMessageDialog(null, "CursadaData Info: No se pudo obtener ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "CursadaData Error: No se pudo Agregar");
            }            
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CursadaData Info: no se pudo cargar\n" + e);
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        //UPDATE cursada SET idCursada=?,idAlumno=?,idMateria=?,nota=? WHERE 1
        String query = "update cursada SET nota=? WHERE idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
                        
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "CursadaData Info:\nActualizacion Exitosa");                
            } else {
                JOptionPane.showMessageDialog(null, "CursadaData Info: NO PUDO MODIFICARSE");                
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"CursadaData ERROR:" + e);
        }
    }
    
     public Cursada buscarCursada(int idAl,int idMat){
        String query ="SELECT * FROM `cursada` WHERE cursada.idAlumno =? AND cursada.idMateria= ?;";
        //creo el objeto q voy a devolver con datos encontrados
        Cursada cur = new Cursada();
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, idAl);
            ps.setInt(2, idMat);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {  
                cur.setAl(aluD.buscarAlumno(idAl)); //Busco el Alumno x id
                cur.setMa(matDa.buscarMateria(idMat)); //Busco la materia x id
                cur.setNota(rs.getDouble("nota"));
                cur.setIdCursada(rs.getInt("idCursada"));
            } else {
                JOptionPane.showMessageDialog(null, "CursadaData Error:\n No se encuentra la inscripción");
            } 
            ps.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR\n" + e);
        }           
        return cur; 
    } 

    public void borrarCursada(int idCursada) {
        String query = "DELETE FROM cursada WHERE idCursada=?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, idCursada);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "CursadaData Info:\nBorrado exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "CursadaData Info:\nNO PUDO BORRARSE");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"CursadaData ERROR:\n"+e);
        }
    }

    public ArrayList<Materia> inscMateriaXalu(Alumno al) {    //SELECT * Alumnos
        ArrayList<Materia> arrlMat = new ArrayList();
        String query = "SELECT materia.idMateria, materia.nombre, materia.anio FROM materia LEFT JOIN cursada "
                + "ON cursada.idMateria = materia.idMateria WHERE cursada.idAlumno = ?";

        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, al.getIdAlumno());
            ResultSet rs = ps.executeQuery();            

            while (rs.next()) { 
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnio(rs.getInt("anio"));
                arrlMat.add(mate);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"CursadaData ERROR:\n"+e);
        }
        return arrlMat;
    }

    public ArrayList<Materia> noInscMateriaXalu(Alumno al) {    //SELECT * Alumnos
        ArrayList<Materia> arrlMat = new ArrayList();
        String query = " SELECT materia.* FROM materia WHERE  materia.activo=1 "
                + "AND materia.idMateria NOT IN (SELECT idMateria FROM cursada WHERE idAlumno =? )";

        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, al.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnio(rs.getInt("anio"));
                arrlMat.add(mate);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CursadaData ERROR: no se pudo obtener materias\n"+e);
        }
        return arrlMat;
    }

    public ArrayList<Alumno> inscAlumnoXmat(Materia ma) {    //SELECT * Alumnos
        ArrayList<Alumno> alumnos = new ArrayList(); //SOlo devuelvo alumnos sin nota..
        String query = "SELECT alumno.idAlumno, alumno.nombre, alumno.apellido FROM alumno LEFT JOIN cursada "
                + "ON alumno.idAlumno=cursada.idAlumno WHERE cursada.idMateria=?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);
            ps.setInt(1, ma.getIdMateria());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Alumno al = new Alumno();
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));                
                alumnos.add(al);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CursadaData ERROR: no se pudo obtener alumnos\n"+e);
        }
        return alumnos;
    }    
}
