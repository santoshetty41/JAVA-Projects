package phoneBook;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class EditData extends JFrame implements ActionListener
{

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tfGet;
    JButton b1, b2;
    JPanel p1, p2;
    Font f1, f2;

    EditData() 
    {
    }

    EditData(int idNo) 
    {
        super("Edit Data");
        setSize(500, 500);
        setLocation(400, 100);

        init();
        try {
            connectionClass con = new connectionClass();
            String q = "select * from add_contact where Id = '" + idNo + "'";

            ResultSet rest1 = con.stm.executeQuery(q);

            while (rest1.next()) {
                tfGet.setText(rest1.getString("Id"));
                tf1.setText(rest1.getString("name"));
                tf2.setText(rest1.getString("nickname"));
                tf3.setText(rest1.getString("phoneno"));
                tf4.setText(rest1.getString("mobileno"));
                tf5.setText(rest1.getString("email"));
                tf6.setText(rest1.getString("address"));
                tf7.setText(rest1.getString("company"));
                tf8.setText(rest1.getString("position"));
                tf9.setText(rest1.getString("group_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    private void init() {
        l1 = new JLabel("Update Contact");
        l2 = new JLabel("ID");
        l3 = new JLabel("Name");
        l4 = new JLabel("Nick Name");
        l5 = new JLabel("Phone No");
        l6 = new JLabel("Mobile no");
        l7 = new JLabel("Gmail Address");
        l8 = new JLabel("Home Address");
        l9 = new JLabel("Company");
        l10 = new JLabel("Position");
        l11 = new JLabel("Group Name");

        tfGet = new JTextField();
        tfGet.setEditable(false);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();

        b1 = new JButton("Edit Contact");
        b2 = new JButton("Back");

        f1 = new Font("Arial", Font.BOLD, 25);
        f2 = new Font("Arial", Font.BOLD, 18);

        p1 = new JPanel(new GridLayout(1, 1, 10, 10));
        p2 = new JPanel(new GridLayout(11, 2, 10, 10));

        p1.add(l1);
        l1.setFont(f1);
        l1.setHorizontalAlignment(JLabel.CENTER);

        p2.add(l2);
        p2.add(tfGet);
        p2.add(l3);
        p2.add(tf1);
        p2.add(l4);
        p2.add(tf2);
        p2.add(l5);
        p2.add(tf3);
        p2.add(l6);
        p2.add(tf4);
        p2.add(l7);
        p2.add(tf5);
        p2.add(l8);
        p2.add(tf6);
        p2.add(l9);
        p2.add(tf7);
        p2.add(l10);
        p2.add(tf8);
        p2.add(l11);
        p2.add(tf9);
        p2.add(b1);
        p2.add(b2);

        setLayout(new BorderLayout());
        add(p1, "North");
        add(p2, "Center");
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            int Id = Integer.parseInt(tfGet.getText());
            String name = tf1.getText();
            String nickname = tf2.getText();
            String phoneno = tf3.getText();
            String mobileno = tf4.getText();
            String email = tf5.getText();
            String address = tf6.getText();
            String company = tf7.getText();
            String position = tf8.getText();
            String group_name = tf9.getText();
            
            try
            {
                connectionClass con1 = new connectionClass();
                String q1 = "update add_contact SET name = '" + name + "', nickname = '" + nickname + "', phoneno = '" + phoneno + "', mobileno = '" + mobileno + "', email = '" + email + "', address = '" + address + "', company = '" + company + "', position = '" + position + "', group_name = '" + group_name + "' where Id = '" + Id + "'";

                int res = con1.stm.executeUpdate(q1);
                
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Your data successfully Update");
                    this.setVisible(false);
                    new searchForEdit().setVisible(true);

                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please fill all data carefully! ");
                }
         
        }
        catch(Exception ex)
            {
               ex.printStackTrace();
            }
        }
        if (e.getSource() == b2) {
            this.setVisible(false);
            new searchForEdit().setVisible(true);
        }
    }

    public static void main(String[] args) 
    {
       EditData ed =  new EditData();
    }
}
