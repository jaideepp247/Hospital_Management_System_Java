
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class userslogin {

    
    public static Connection ConnecrDB(){

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myhospital","root","");
    System.out.println("CONNECTED!");
    return conn;
}catch(Exception e){
JOptionPane.showMessageDialog(null, e);  
return null;
}    
   
}
}
    
