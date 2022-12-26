package gui;

import java.sql.*;
import javax.swing.JOptionPane;

public class database {

    Statement st;
    Connection con;

    database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String path = "jdbc:mysql://localhost:3306/todo";
            String username = "root";
            String pass = "12345";
            con = DriverManager.getConnection(path, username, pass);
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new database();
    }
}
