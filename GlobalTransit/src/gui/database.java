package gui;
import java.sql.*;

public class database {
    
    Connection con;
    Statement st;
    database()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String path = "jdbc:mysql://localhost:3306/globaltransitdb";
            String username = "root";
            String pass = "12345";
            con = DriverManager.getConnection(path,username,pass);
            st = con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {
        new database();
    }
    
}
