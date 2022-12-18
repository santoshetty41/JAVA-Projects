import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DigitalClock extends Frame
{
    Label clock, label;
    DigitalClock()
    {
        setSize(260,150);
        setLocation(400,100);
        setVisible(true);
        setTitle("Digital Clock");
        setBackground(Color.CYAN);
        setFont(new Font("",Font.BOLD,20));

        setLayout(new GridLayout(2,1));
        label = new Label("My Clock",1);
        add(label);

       clock = new Label("Clock");
        add(clock);


        clockSet();



    }

    private void clockSet() {
        Timer timer = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               // String dateTime = new Date().toString();
                String dateTime = new Date().toLocaleString();

                clock.setText(dateTime);

            }
        });

        timer.start();
    }

    public static void main(String[] args)
    {
        DigitalClock dc = new DigitalClock();
    }
}
