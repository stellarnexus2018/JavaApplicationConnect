package javaapplicationconnect;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import javax.naming.NamingException;

public class JavaApplicationConnect {
    public static void main(String[] args)  throws SQLException, NamingException, ClassNotFoundException {
        JavaApplicationConnect jc = new JavaApplicationConnect();
        jc.RunExample();
    }
    
    public void RunExample() throws SQLException, NamingException, ClassNotFoundException {
        Connection conn = ConnectEngine.getConnection();
    
        PreparedStatement ps = conn.prepareStatement("select m.id, m.name, m.time_stamp from lalala m where m.id < ? order by id asc");
        ps.setInt(1, 100);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Timestamp dtm = rs.getTimestamp("time_stamp");


                out.println("id: " + id);
                out.println("name: " + name);
                out.println("dtm: " + dtm);
        }
        rs.close();
    }
}