import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Traffic extends JFrame
{
    private JRadioButton radio1,radio2,radio3;
    private JPanel colorPanel;
    private ButtonGroup button;

    public Traffic()
    {
        JFrame jfrm = new JFrame("TRAFFIC LIGHT");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
        radio1= new JRadioButton("RED");
        radio2= new JRadioButton("YELLOW");
        radio3= new JRadioButton("GREEN");
        panel1.add(radio1);
        panel1.add(radio2);
        panel1.add(radio3);
        
        button = new ButtonGroup();
        button.add(radio1);
        button.add(radio2);
        button.add(radio3);
        
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        colorPanel.setBackground(Color.WHITE);

        jfrm.add(colorPanel);
        jfrm.add(panel1);
        jfrm.setVisible(true);
        

        radio1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                colorPanel.setBackground(Color.RED);
            }
        });

        radio2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                colorPanel.setBackground(Color.YELLOW);
            }
        });

        radio3.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ae)
           {
            colorPanel.setBackground(Color.GREEN);
           }
        });



    }

    public static void main(String args[])
    {
        new Traffic();
    }
}
