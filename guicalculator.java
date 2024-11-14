import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public SimpleCalculator() {
        // Set up the main frame
        JFrame jfrm = new JFrame("Simple Calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 250);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input fields for numbers
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Number 1:"));
        num1Field = new JTextField(10);
        inputPanel.add(num1Field);

        inputPanel.add(new JLabel("Number 2:"));
        num2Field = new JTextField(10);
        inputPanel.add(num2Field);

        // Result display field
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout());
        resultPanel.add(new JLabel("Result:"));
        resultField = new JTextField(10);
        resultPanel.add(resultField);

        // Operation buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Add components to the main frame
        jfrm.add(inputPanel);
        jfrm.add(buttonPanel);
        jfrm.add(resultPanel);
        jfrm.setVisible(true);

        // Add action listeners for each operation button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('/');
            }
        });
    }

    // Method to perform calculation based on selected operation
    private void performOperation(char operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
