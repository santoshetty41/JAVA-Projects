package phoneBook;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class DeleteDataTable extends JFrame implements ActionListener {

    JLabel l;
    JButton b1, b2;
    JTextField tf;
    JTable t;
    String x[] = {"Id", "Name", "Nick Name", "Phone", "Mobile", "Email", "Address", "Company", "Position", "Group Name"};
    String y[][] = new String[20][10];
    int i = 0, j = 0;
    JPanel p1;

    DeleteDataTable() {
        setVisible(true);
        setSize(800, 400);
        setLocation(450, 50);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        init();
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
        addComp();

        setLayout(new BorderLayout(10, 10));
        JScrollPane sp = new JScrollPane(t);
        add(sp, "Center");
        add(p1, "South");

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    private void init() {
        l = new JLabel("Enter id to delete");
        b1 = new JButton("Delete");
        b2 = new JButton("Back");
        tf = new JTextField();
        p1 = new JPanel(new GridLayout(1, 4, 10, 10));
    }

    private void addComp() {
        p1.add(l);
        p1.add(tf);
        p1.add(b1);
        p1.add(b2);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
//             if(tf.getText() == null)
//            {
//                JOptionPane.showMessageDialog(null,"Please enter Id no to delete");
//            }
//            if(tf.getText() != null)

            int idno = Integer.parseInt(tf.getText());

            try {
                connectionClass con = new connectionClass();
                String q = "delete from add_contact where Id = '" + idno + "'";
                int res = con.stm.executeUpdate(q);

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Your contact Successfully Deleted");
                    this.setVisible(false);
                    new DeleteDataTable().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Your contact did not deleted");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        if (ae.getSource() == b2) {
            this.setVisible(false);
            new Home().setVisible(true);

        }
    }

    public static void main(String[] args) {
        DeleteDataTable ddt = new DeleteDataTable();
    }
}
