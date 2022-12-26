package phoneBook;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class allContact extends JFrame implements ActionListener{

    JTable t;
    String x[] = {"Id", "Name", "Nick Name", "Phone", "Mobile", "Email", "Address", "Company", "Position", "Group Name"};
    String y[][] = new String[20][10];
    int i = 0, j = 0;
    JButton b;
    JPanel p;

    allContact() {
        setVisible(true);
        setSize(800, 400);
        setLocation(450, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p = new JPanel(new GridLayout(1,1,10,10));
        b = new JButton("Back");
        try {
            connectionClass con = new connectionClass();
            String q = "select * from add_contact";
            ResultSet res = con.stm.executeQuery(q);
            while (res.next()) {
                y[i][j++] = res.getString("Id");
                y[i][j++] = res.getString("name");
                y[i][j++] = res.getString("nickname");
                y[i][j++] = res.getString("phoneno");
                y[i][j++] = res.getString("mobileno");
                y[i][j++] = res.getString("email");
                y[i][j++] = res.getString("address");
                y[i][j++] = res.getString("company");
                y[i][j++] = res.getString("position");
                y[i][j++] = res.getString("group_name");
                i++;
                j = 0;
            }
            t = new JTable(y, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        setLayout(new BorderLayout(10, 10));
        JScrollPane sp = new JScrollPane(t);
        add(sp, "Center");
        add(p,"South");
        p.add(b);
        b.addActionListener(this);
       

    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            this.setVisible(false);
            new Home().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new allContact().setVisible(true);
    }
}
