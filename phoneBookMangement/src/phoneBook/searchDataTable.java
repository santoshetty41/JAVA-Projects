package phoneBook;
import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class searchDataTable extends JFrame {
  
    JTable t;
    Font f;
    String x[] = {"Id", "Name", "Nick Name", "Phone", "Mobile", "Email", "Address", "Company", "Position", "Group Name"};
    String y[][] = new String[20][10];
    int i = 0, j = 0;
    
    searchDataTable()
    {
    }
    searchDataTable(String name1)
    {
        super("Contact Information");
        setSize(800,400);
        setLocation(450, 50);
        
        f = new Font("Arial", Font.BOLD, 20);
        
        try
        {
            connectionClass con = new connectionClass();
            String q = "select * from add_contact where name='"+name1+"'";
            
            ResultSet rest = con.stm.executeQuery(q);
            
            while(rest.next())
            {
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
            t = new JTable(y,x);
           //t.setFont(f);
        }
        
        catch(Exception ev)
        {
            ev.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t); // add Table t as parameter to view it
        add(sp);
     
        
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        searchDataTable sdt = new searchDataTable();
    }
}
