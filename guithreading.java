import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Place extends JFrame
{
    private JTextField inputfield;
    private JTextArea outputarea;
    private JButton print;

    public Place()
    {
        JFrame jfrm=new JFrame("DISPLAY PLACE");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350,450);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("ENTER THE NUMBER OF TIMES TO DISPLAY N"));
        inputfield=new JTextField(10);
        panel1.add(inputfield);
        print=new JButton("PRINT THE PLACES");
        panel1.add(print);

        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        outputarea=new JTextArea(10,20);
        panel2.add(outputarea);
        
        jfrm.add(panel1);
        jfrm.add(panel2);
        jfrm.setVisible(true);

        print.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                int n=Integer.parseInt(inputfield.getText().trim());
                startthread(n);
                
            }
               
                
        });

        
    }
        public void startthread(int n)
                {
                    Thread t1= new Thread()
                    {
                        public void run()
                        {
                            for(int i=0;i<n;i++)
                            {
                                System.out.println("Thrikkakara");
                                outputarea.append("Thrikkakara\n");
                                
                            }
                        }
                    };
                    Thread t2= new Thread()
                    {
                        public void run()
                        {
                            for(int i=0;i<n;i++)
                            {
                                System.out.println("Kochi");
                                outputarea.append("Kochi\n");
                                
                            }
                        }
                    };
                    t1.start();
                    try
                    {
                        t1.join(); // Wait for t1 to finish before starting t2
                    }
                    catch (Exception e)
                    {
                      e.printStackTrace();
                    }
                    t2.start();   
                }
                        
    public static void main(String args[])
    {
        new Place();

    }
}
