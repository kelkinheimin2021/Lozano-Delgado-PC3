
package Config;

import java.sql.*;

public class Conexion {
        Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3307/registro?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    /*
    Connection con;
    public Conexion(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/registro","root","");                
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    */
}


/*
 Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3307/sistema_ventas_tp?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
*/