package phoneBook;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class SearchContact extends JFrame implements ActionListener{

    JLabel l1, l2;
    JTextField tf1;
    JButton b1, b2;
    Font f1, f2;
    JPanel p1, p2;
    int id = 0;

    SearchContact() {
        super("Search Contact");
        setSize(470, 180);
        setLocation(450, 50);

        init();
        addingPanel();
        addToFrame();
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }

    private void init() {
        f1 = new Font("Arial", Font.BOLD, 25);
        f2 = new Font("Arial", Font.BOLD, 18);

        l1 = new JLabel("Search Contact");
        l1.setFont(f1);
        l2 = new JLabel("Enter Name");
        l2.setFont(f2);

        tf1 = new JTextField();
        l2.setFont(f2);

        b1 = new JButton("Search Contact");
        l2.setFont(f2);
        b2 = new JButton("Back");
        l2.setFont(f2);
    }

    private void addingPanel() {
        p1 = new JPanel(new GridLayout(1, 1, 10, 10));
        p1.add(l1);
        l1.setHorizontalAlignment(JLabel.CENTER);

        p2 = new JPanel(new GridLayout(2, 2, 10, 10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(b1);
        p2.add(b2);
    }

    private void addToFrame() {
        setLayout(new BorderLayout());
        add(p1,"North");
        add(p2,"Center");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String name = tf1.getText();
        
        if(e.getSource() == b1)
        {
            try
            {
                connectionClass con = new connectionClass();
                String q = "select name from add_contact where name = '"+name+"'";
                ResultSet rest = con.stm.executeQuery(q);
                
                if(rest.next())
                {
                    String name1 = rest.getString("name"); // this name is add_contact name
                    new searchDataTable(name1).setVisible(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Your contact not Found !");
                    this.setVisible(false);
                    this.setVisible(true);
                }
            }
            catch(Exception ev)
            {
                ev.printStackTrace();
            }
        }
        if(e.getSource() == b2)
        {
            this.setVisible(false);
            new Home().setVisible(true);
        }
     
    }

    public static void main(String[] args) {
        SearchContact sc = new SearchContact();
    }

}
