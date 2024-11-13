import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class WordChanger extends JFrame
{ 
    private JTextArea file1textarea;
    private JTextArea file2textarea;
    private JTextArea resultarea;
    private JButton savebutton1, savebutton2, resultbutton;

    public WordChanger()
    {
       JFrame jfrm = new JFrame("DUPLI");
       jfrm.setLayout(new BorderLayout());
       jfrm.setSize(300, 250);
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel1 = new JPanel();
       panel1.setLayout(new BorderLayout());
       panel1.add(new JLabel("Enter data file 1"), BorderLayout.NORTH);
       file1textarea = new JTextArea(5, 20);
       panel1.add(file1textarea, BorderLayout.CENTER);
       savebutton1 = new JButton("Save to file 1");
       panel1.add(savebutton1, BorderLayout.SOUTH);

       JPanel panel2 = new JPanel();
       panel2.setLayout(new BorderLayout());
       panel2.add(new JLabel("Enter data file 2"), BorderLayout.NORTH);
       file2textarea = new JTextArea(5, 20);
       panel2.add(file2textarea, BorderLayout.CENTER);
       savebutton2 = new JButton("Save to file 2");
       panel2.add(savebutton2, BorderLayout.SOUTH);
       
       JPanel panel3 = new JPanel();
       panel3.setLayout(new BorderLayout());
       panel3.add(new JLabel("RESULT AFTER CHANGE"), BorderLayout.NORTH);
       resultarea = new JTextArea(5, 20);
       panel3.add(resultarea, BorderLayout.CENTER);
       resultbutton = new JButton("RESULT");
       panel3.add(resultbutton, BorderLayout.SOUTH);

       jfrm.add(panel1, BorderLayout.WEST);
       jfrm.add(panel2, BorderLayout.EAST);
       jfrm.add(panel3, BorderLayout.CENTER);
       
       jfrm.setVisible(true);

       savebutton1.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent ae)
          {
            try
            {
                FileWriter fw1 = new FileWriter("file1.txt");
                String data = file1textarea.getText();
                fw1.write(data);
                fw1.close();
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
          }
       });

       savebutton2.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent ae)
          {
            try
            {
                FileWriter fw2 = new FileWriter("file2.txt");
                String data = file2textarea.getText();
                fw2.write(data);
                fw2.close();
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
          }
       });

       resultbutton.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent ae)
        {
            try {
                BufferedReader bf1 = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader bf2 = new BufferedReader(new FileReader("file2.txt"));
                FileWriter fw3 = new FileWriter("dupli.txt");
                String[] a1 = new String[10];
                String[] a2 = new String[10];
                int index1 = 0;
                int index2 = 0;
                String line;
                String newline = System.lineSeparator();

                // Read data from file1.txt
                while ((line = bf1.readLine()) != null) {
                    a1[index1] = line.trim();
                    index1++;
                }
                bf1.close();

                // Read data from file2.txt
                while ((line = bf2.readLine()) != null) {
                    a2[index2] = line.trim();
                    index2++;
                }
                bf2.close();

                // Find duplicates and write to dupli.txt
                for (int i = 0; i < index1; i++) {
                    for (int j = 0; j < index2; j++) {
                        if (a1[i].equals(a2[j])) {
                            fw3.write(a1[i] + newline);
                        }
                    }
                }
                fw3.close();

                // Read from dupli.txt and display in resultarea
                BufferedReader bf3 = new BufferedReader(new FileReader("dupli.txt"));
                String resultfinal = "";
                while ((line = bf3.readLine()) != null) {
                    resultfinal += line + newline;
                }
                bf3.close();
                resultarea.setText(resultfinal);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error processing files.");
                e.printStackTrace();
            }
        }
       });
    }

    public static void main(String args[])
    {
        new WordChanger();
    }
}
