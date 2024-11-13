import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Reverse extends JFrame
{
      private JTextArea text1;
      private JTextArea text2;
      private JButton convert; 
      public Reverse()
      {
          JFrame jfrm=new JFrame("REVERSE STRING");
          jfrm.setLayout(new BorderLayout());
          jfrm.setSize(300,450);
          jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


          JPanel panel1=new JPanel();
          panel1.setLayout(new BorderLayout());
          panel1.add(new JLabel("ENTER THE STRING"),BorderLayout.NORTH);
          text1=new JTextArea(5,20);
          panel1.add(text1,BorderLayout.CENTER);
          convert=new JButton("REVERSE STRING");
          panel1.add(convert,BorderLayout.SOUTH);

          JPanel panel2=new JPanel();
          panel2.setLayout(new BorderLayout());
          panel2.add(new JLabel("REVERSED STRING"),BorderLayout.NORTH);
          text2=new JTextArea(5,20);
          panel2.add(text2,BorderLayout.CENTER);
          
          convert.addActionListener(new ActionListener()
          {
             public void actionPerformed(ActionEvent ae)
             {
                String data=text1.getText();
                int len=data.length();
                String str= "";
                for(int i=(len-1);i>=0;i--)
                {
                      str+=data.charAt(i);
                }
                text2.setText(str);

             }

          });




          jfrm.add(panel1,BorderLayout.WEST);
          jfrm.add(panel2,BorderLayout.EAST);
          jfrm.setVisible(true);
          


      }
      public static void main(String args[])
      {
          new Reverse();
      }

}
