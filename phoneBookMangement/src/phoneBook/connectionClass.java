package phoneBook;

import java.sql.*;

public class connectionClass {

    Connection con;
    Statement stm;

    connectionClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoneBookManagement", "root", "12345");
            stm = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new connectionClass();
    }

}
