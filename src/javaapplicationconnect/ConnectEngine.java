package javaapplicationconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.NamingException;


public class ConnectEngine {
    
    
    public static Connection getConnection() throws SQLException, NamingException, ClassNotFoundException {
    /*
    javax.naming.InitialContext ctx = new javax.naming.InitialContext();
    javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup("jdbc/SBI");
    return ds.getConnection();
    */
    Class.forName("oracle.jdbc.driver.OracleDriver");
    return DriverManager.getConnection("jdbc:oracle:thin:@desktop-s4fhj40:1521/plugdb", "geo","geo2018");
  }

    
    
    
    
    
    
}
