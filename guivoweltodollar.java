import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dollar extends JFrame
{
    private JTextField field1;
    private JTextField field2;
    private JButton convert;

    public Dollar()
    {
        JFrame jfrm=new JFrame("VOWEL TO DOLLAR");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("ENTER STRING"));
        field1=new JTextField(10);
        panel1.add(field1);
        convert=new JButton("CONVERT");
        panel1.add(convert);

        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        field2=new JTextField(10);
        panel2.add(field2);

        jfrm.add(panel1);
        jfrm.add(panel2);
        jfrm.setVisible(true);

        convert.addActionListener(new ActionListener()
        {
               public void actionPerformed(ActionEvent ae)
               {
                try{
                FileWriter fw1=new FileWriter("f1.txt");
                String data=field1.getText();
                fw1.write(data);
                fw1.close();

                BufferedReader bf=new BufferedReader(new FileReader("f1.txt"));
                String line;
                StringBuilder result = new StringBuilder();
                FileWriter fw2=new FileWriter("f2.txt");
                while((line=bf.readLine())!=null)
                {
                    String finals=line.replaceAll("[AEIOUaeiou]","\\$");
                    fw2.write(finals);
                    result.append(finals);
                }
                field2.setText(result.toString());
                fw2.close();
                bf.close();
               
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
               }
        });
    }
    public static void main(String args[])
    {
        new Dollar();
    }

}
