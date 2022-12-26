package phoneBook;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class EditDataTable extends JFrame implements ActionListener {

    JLabel l;
    JTable t;
    JTextField tf;
    JButton b;
    JPanel p, p1;
    String x[] = {"Id", "Name", "Nick Name", "Phone", "Mobile", "Email", "Address", "Company", "Position", "Group Name"};
    String y[][] = new String[20][10];
    int i = 0, j = 0;

    EditDataTable() {
    }

    EditDataTable(String name1) {
        super("Edit Data");
        setSize(800, 400);
        setLocation(450, 50);
        try {
            connectionClass con = new connectionClass();
            String q = "select * from add_contact where name='" + name1 + "'";

            ResultSet rest = con.stm.executeQuery(q);

            while (rest.next()) {
                y[i][j++] = rest.getString("Id");
                y[i][j++] = rest.getString("name");
                y[i][j++] = rest.getString("nickname");
                y[i][j++] = rest.getString("phoneno");
                y[i][j++] = rest.getString("mobileno");
                y[i][j++] = rest.getString("email");
                y[i][j++] = rest.getString("address");
                y[i][j++] = rest.getString("company");
                y[i][j++] = rest.getString("position");
                y[i][j++] = rest.getString("group_name");
                i++;
                j = 0;
            }
            t = new JTable(y, x);
            //t.setFont(f);
        } catch (Exception ev) {
            ev.printStackTrace();
        }

        p = new JPanel(new GridLayout(1, 3, 10, 10));
        tf = new JTextField();
        l = new JLabel("Enter id for Search");
        b = new JButton("Search");
        p.add(l, "");
        p.add(tf);
        p.add(b);

        
        setLayout(new BorderLayout(10, 10));
        add(p, "South");

        JScrollPane sp = new JScrollPane(t);
        add(sp, "Center");
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            int idNo = Integer.parseInt(tf.getText());
            this.setVisible(false);
            new EditData(idNo).setVisible(true);
            
        }
    }
    
    public static void main(String[] args) {
        new EditDataTable().setVisible(true);
    }
}
