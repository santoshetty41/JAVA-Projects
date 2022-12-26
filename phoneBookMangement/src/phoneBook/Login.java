package phoneBook;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4;
    JTextField tf;
    JPasswordField pf;
    JPanel p1, p2, p3;
    Font f1, f2;
    JButton b1, b2;
    
    Login()
    {
        super("Login");
        setLocation(400,300);
        setSize(530,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        f1 = new Font("Arial", Font.BOLD,25);
        f2 = new Font("Arial", Font.BOLD, 18);
        
        l1 = new JLabel("Welcome to PhoneBook");
        l2 = new JLabel("User Name",10);
        l3 = new JLabel("Password");
       
        
       l1.setHorizontalAlignment(JLabel.CENTER);
       l1.setFont(f1);
       l2.setFont(f2);
       l3.setFont(f2);
       
       tf = new JTextField();
       pf = new JPasswordField();
       tf.setFont(f2);
       pf.setFont(f2);
       
       b1 = new JButton("Login");
       b2 = new JButton("Cancel");
  
       b1.addActionListener(this);
       b2.addActionListener(this);
       
        b1.setFont(f2);
        b2.setFont(f2);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image//man1.png"));
        Image img2 = img.getImage().getScaledInstance(165,190,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
         l4 = new JLabel(img3);
       
       p1 = new JPanel();
       p1.setLayout(new GridLayout(3,2,10,10));
       p1.add(l2);
       p1.add(tf);
       p1.add(l3);
       p1.add(pf);
       p1.add(b1);
       p1.add(b2);
       
       // For Label or gradding
       p2 = new JPanel();
       p2.setLayout(new GridLayout(1,1,10,10));
       p2.add(l1);
      
       // for image
       p3 = new JPanel();
       p3.setLayout(new GridLayout(1,1,10,10));
       p3.add(l4);

       setLayout(new BorderLayout());
       add(p2,"North");
       add(p3,"East");
       add(p1,"Center");
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String username = tf.getText();
        String password = pf.getText();
        
        if(e.getSource() == b1)
        {
            try
            {
                connectionClass obj = new connectionClass();
                String q = "select * from login where username='"+username+"' and password='"+password+"'";
                ResultSet rest = obj.stm.executeQuery(q);
                
                if(rest.next())
                {
                    //System.out.println("you have log in");
                    new Home().setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Your password does not match");
                }
                
            }
            catch(Exception ev)
            {
                ev.printStackTrace();
                
            }
        }
        if(e.getSource() == b2)
        {
            setVisible(false);
            System.exit(0);
        }
      
    }
    
    public static void main(String[] args)
    {
        Login login = new Login();
    }
}
