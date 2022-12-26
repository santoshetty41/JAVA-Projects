// Adding image is remaining

package phoneBook;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener
{
    
    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6;
    JPanel p1, p2, p3;
    Font f1, f2;
    
    Home()
    {
        super("Home Section");
        setSize(450,450);
        setLocation(450,200);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        
        f1 =new Font("Arial",Font.BOLD,20);
        f2 =new Font("Arial",Font.BOLD,15);
        
        l1 = new JLabel("Phone Book");
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image//contac.png"));
        Image img2 = img.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        l2 = new JLabel(img3);
        
        b1 = new JButton("Entry");
        b2 = new JButton("Search");
        b3 = new JButton("Edit");
        b4 = new JButton("Delete");
        b5 = new JButton("Exit");
        b6 = new JButton("All Contacts");
        
        addingAction();
        addingFont();
        
        // panel for label 1
        p1 = new JPanel(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        //panel for buttons 
        p2 = new JPanel(new GridLayout(6,1,10,10));
        p2.add(b1);
        p2.add(b2);
        p2.add(b6);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        
        // panel for label 2 Image 
        p3 = new JPanel(new GridLayout(1,1,10,10));
        p3.add(l2);
        
        
        setLayout(new BorderLayout(10,20));
        add(p1,"North");
        add(p3,"East");
        add(p2,"Center");
        setVisible(true);
    }
    
    private void addingAction() {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }
    
    private void addingFont()
    {
        l1.setFont(f1);
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            this.setVisible(false);
            new EntryData().setVisible(true);
           // System.out.println("Entry open");
                
        }
        if(e.getSource() == b2)
        {
            this.setVisible(false);
            new SearchContact().setVisible(true);
            //System.out.println("Search open");
                
        }
        if(e.getSource() == b3)
        {
            this.setVisible(false);
            new searchForEdit().setVisible(true);
            //System.out.println("Edit open");
                
        }
        if(e.getSource() == b4)
        {
            this.setVisible(false);
            new DeleteDataTable().setVisible(true);                
        }
        if(e.getSource() == b5)
        {
            //this.setVisible(false);
            System.exit(0);
            
        }
        if(e.getSource() == b6)
        {
            this.setVisible(false);
            new allContact().setVisible(true);
            
        }
        
    }
    
    public static void main(String[] args)
    {
        Home home = new Home(); 
    }

}
