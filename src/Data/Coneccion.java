package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Pat
 */
public class Coneccion {
    
    private static String url = "jdbc:mysql://localhost/tp_universidad";
    private static String user = "root";
    private static String pass = "";
    private static Coneccion conect = null;
    
    private Coneccion(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Coneccion: Error al cargar el Driver\n"+ex);
        }            
    }
    
    public static Connection getConeccion(){
        Connection conn = null;
        if (conect == null) {
            conect = new Coneccion();
        }
        try {
            conn = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + user + "&password=" + pass);            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Coneccion: Error de coneccion\n"+e);
        }       
        return conn;
    }
    
}
