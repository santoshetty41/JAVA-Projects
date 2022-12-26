
package phoneBook;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EntryData extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9;
    JButton b1, b2;
    JPanel p1, p2;
    Font f1, f2;
    
    EntryData()
    {
      super("EntryData");
      setSize(450,650);
      setLocation(450,50);
      
      init();
      otherinit();
     
      
      setLayout(new BorderLayout());
      add(p1,"North");
      add(p2,"Center");
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      
      setVisible(true);
    }
    private void init()
    {
        // initilized Labels
        l1 = new JLabel("Add Contact");
        l1.setHorizontalAlignment(JLabel.CENTER);  // for heading in center
        l2 = new JLabel("Name");
        l3 = new JLabel("Nick Name");
        l4 = new JLabel("Phone no");
        l5 = new JLabel("Mobile no");
        l6 = new JLabel("Email Address");
        l7 = new JLabel("Home Address");
        l8 = new JLabel("Company");
        l9 = new JLabel("Position");
        l10 = new JLabel("Group Name");
        
        //initilized textField
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        
        // initilized Button
        b1 = new JButton("Add Contact");
        b2 = new JButton("Back");
        
    }
    
    private void otherinit() {

        // initilized Font
        f1 = new Font("Arial", Font.BOLD,25);
        f2 = new Font("Arial", Font.BOLD,18);
        
        setFont();

        // initized panel 1 and adding label 1
        p1 = new JPanel(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        // initized panel 2 and addding label and textfield
        p2 = new JPanel(new GridLayout(10,2,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(l5);
        p2.add(tf4);
        p2.add(l6);
        p2.add(tf5);
        p2.add(l7);
        p2.add(tf6);
        p2.add(l8);
        p2.add(tf7);
        p2.add(l9);
        p2.add(tf8);
        p2.add(l10);
        p2.add(tf9);
        p2.add(b1);
        p2.add(b2);
        
     
    }
    
    private void setFont()
    {
        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);
        l8.setFont(f2);
        l9.setFont(f2);
        l10.setFont(f2);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String name = tf1.getText();
        String nickname = tf2.getText();
        String phoneno = tf3.getText();
        String mobileno = tf4.getText();
        String email = tf5.getText();
        String address = tf6.getText();
        String company = tf7.getText();
        String position = tf8.getText();
        String group_name = tf9.getText();
        
        if(e.getSource() == b1)
        {
            try
            {
                 connectionClass obj = new connectionClass();
                String q = "insert into add_contact (name,nickname,phoneno,mobileno,email,address,company,position,group_name) values('"+name+"','"+nickname+"','"+phoneno+"','"+mobileno+"','"+email+"','"+address+"','"+company+"','"+position+"','"+group_name+"')";
                int aa = obj.stm.executeUpdate(q);
                
                if(aa == 1)
                {
                    JOptionPane.showMessageDialog(null,"Your Succesfully added");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
                else
                {
                    System.out.print("else....");
                    JOptionPane.showMessageDialog(null, "Please Fill the data carefully");
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
    
    
    public static void main(String[] args)
    {
        EntryData ed = new EntryData();
    }

}
