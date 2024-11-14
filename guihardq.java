import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Check extends JFrame {
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JButton find;
    private JButton check;

    public Check() {
        JFrame jfrm = new JFrame("FIND WORDS");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("ENTER WORD"));
        field1 = new JTextField(10);
        panel1.add(field1);
        field2 = new JTextField(10);
        panel1.add(field2);
        find = new JButton("FIND");
        panel1.add(find);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        field3 = new JTextField(20);  // Increased size for better visibility
        panel2.add(field3);
        check = new JButton("CHECK");
        panel2.add(check);

        jfrm.add(panel1);
        jfrm.add(panel2);
        jfrm.setVisible(true);

        // ActionListener for FIND button
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = field1.getText().trim();
                String filename = field2.getText().trim();

                // Ensure the file exists and the word is entered
                if (data.isEmpty() || filename.isEmpty()) {
                    field3.setText("Enter word and file!");
                    return;
                }

                if (data.equals("a")) {  // Check for 'a' in the word
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(filename));
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] words = line.split("\\s+");
                            for (String word : words) {
                                if (word.startsWith("a")) {
                                    field3.setText(word);  // Display first word starting with 'a'
                                    br.close();  // Close the BufferedReader
                                    return;  // Exit after finding the first match
                                }
                            }
                        }
                        field3.setText("No word found starting with 'a'");
                        br.close();  // Close the BufferedReader
                    } catch (Exception e) {
                        field3.setText("ERROR: " + e.getMessage());
                    }
                }
            }
        });

        // ActionListener for CHECK button
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = field1.getText().trim();
                String filename = field2.getText().trim();

                // Ensure the file exists and the word is entered
                if (data.isEmpty() || filename.isEmpty()) {
                    field3.setText("Enter word and file!");
                    return;
                }

                if (data.equals("a")) {  // Check for 'a' in the word
                    try {
                        BufferedReader bf2 = new BufferedReader(new FileReader(filename));
                        String line;
                        int count = 0;
                        while ((line = bf2.readLine()) != null) {
                            String[] words = line.split("\\s+");
                            for (String word : words) {
                                if (word.equals("a")) {  // Exact match for the word 'a'
                                    count++;
                                }
                            }
                        }
                        field3.setText("Occurrences of 'a': " + count);  // Use setText to replace old text
                        bf2.close();  // Close the BufferedReader
                    } catch (Exception e) {
                        field3.setText("ERROR: " + e.getMessage());
                    }
                }
            }
        });
    }

    public static void main(String args[]) {
        new Check();
    }
}
