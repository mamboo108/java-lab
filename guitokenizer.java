import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum extends JFrame {

    private JTextField inputarea;
    private JTextField outputarea;  // Corrected the typo: JtextField -> JTextField
    private JButton total;

    public Sum() {
        JFrame jfrm = new JFrame("TOKENIZE");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("ENTER THE NUMBERS WITH SPACE"));
        inputarea = new JTextField(10);
        panel1.add(inputarea);
        total = new JButton("CONVERT");
        panel1.add(total);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        outputarea = new JTextField(10);
        panel2.add(outputarea);

        jfrm.add(panel1);
        jfrm.add(panel2);
        jfrm.setVisible(true);

        total.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = inputarea.getText();
                StringTokenizer st = new StringTokenizer(data);
                int sum = 0;

                while (st.hasMoreTokens()) {  // Removed the semicolon here
                    String token = st.nextToken();
                    try {
                        int number = Integer.parseInt(token);
                        sum += number;
                    } catch (NumberFormatException e) {
                        outputarea.setText("Invalid Input");
                        return; // Exit the method if input is not valid
                    }
                }
                outputarea.setText(String.valueOf(sum));  // Display the sum
            }
        });
    }

    public static void main(String args[]) {
        new Sum();
    }
}
