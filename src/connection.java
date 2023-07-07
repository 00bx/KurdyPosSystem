

import java.sql.*;
import javax.swing.JOptionPane;


public class connection {
Connection conn;

public static Connection database(){
    
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ifraz_market" , "root", "0000");

return conn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
    return null;
}    
}
