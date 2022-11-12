package Data;

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
public class MateriaData {

    private Connection conx = null;

    public MateriaData() {
        this.conx = Coneccion.getConeccion();
    }

    public void guardarMateria(Materia mate) {  
        //INSERT INTO `materia`(`idMateria`, `nombre`, `anio`, `activo`)
        String query = "INSERT INTO materia(nombre, anio, activo) VALUES(?,?,?)"; //"?" Comodines para reutilizar query

        try {
            PreparedStatement ps = conx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mate.getNombre());
            ps.setInt(2, mate.getAnio());
            ps.setBoolean(3, mate.isActivo());
         
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "MateriaData Info:\nGUARDADO Exitoso");
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    mate.setIdMateria(rs.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(null, "MateriaData Error: No se pudo Recuperar el ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "MateriaData Info:\nNo se pudo Guardar");
            }         
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "MateriaData Guardar ERROR:\n"+e);
        }
    }

    public Materia buscarMateria(int id) {   //SELECT 1 Materia por ID
        //Creo obj Materia e instancio el Query
        Materia mate = new Materia();
        String sql = "SELECT * FROM materia WHERE idMateria=? AND activo = 1";        
        //Try: Ps/ ps.set(id xparametro).. / rs.. /if(next) ../ Set alu / ps.Close...
        try { 
            PreparedStatement ps = conx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //idMateria, nombre, anio, activo
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnio(rs.getInt("anio"));
                mate.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "MateriaData Error:\n No se encuentra la materia/activa");
                return null;
            }
            ps.close();
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "MateriaData Buscar Error:\n" + e);
                return null;
        }
        return mate;
    }

    public ArrayList<Materia> listarMateria() {    //SELECT * Materia
        ArrayList<Materia> arrlMate = new ArrayList();
        String query = " SELECT *  FROM materia WHERE activo = 1";
        try {            
            PreparedStatement ps = conx.prepareStatement(query);
            ResultSet rs = ps.executeQuery();            

            while (rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnio(rs.getInt("anio"));
                mate.setActivo(rs.getBoolean("activo"));

                arrlMate.add(mate);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "MateriaData Listar Error:\n" + e);
        }
        return arrlMate;
    }

    public void actualizarMateria(Materia mate) { 
        //UPDATE SET
        String query = "UPDATE materia SET nombre=?, anio=?, activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = conx.prepareStatement(query);

            ps.setString(1, mate.getNombre());
            ps.setInt(2, mate.getAnio());
            ps.setBoolean(3, mate.isActivo());
            ps.setInt(4, mate.getIdMateria());
            ps.executeUpdate();
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "MateriaData Info: ACTUALIZADO");
            } else {
                JOptionPane.showMessageDialog(null, "MateriaData Info: No se pudo actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarMateria(int id) {   
        //UPDATE SET / DELETE
        String sql = "UPDATE materia SET activo = 0 WHERE idMateria = ?";
        try {
            PreparedStatement pt = conx.prepareStatement(sql);
            pt.setInt(1, id);
            if (pt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "MateriaData Info:\nMateria Borrada");              
            } else {
                JOptionPane.showMessageDialog(null, "MateriaData Info:\nNo se pudo Borrar");
            }
            pt.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "MateriaData Error:\n"+e);
        }
    }
}
