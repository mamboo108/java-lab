import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Sta extends JFrame {
    private JTextField field1;
    private JTextArea field2;
    private JButton pushelement;
    private JButton popelement;

    public Sta() {
        JFrame jfrm = new JFrame("STACK");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("ENTER ELEMENT"));
        field1 = new JTextField(10);
        panel1.add(field1);
        pushelement = new JButton("PUSH");
        panel1.add(pushelement);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        field2 = new JTextArea(10,20);  
        panel2.add(field2);
        popelement = new JButton("POP");
        panel2.add(popelement);

        jfrm.add(panel1);
        jfrm.add(panel2);
        jfrm.setVisible(true);
        Stack<Integer> stack=new Stack<>();
        pushelement.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String input = field1.getText().trim();  
                String data[] = input.split("\\s+");
                int len=data.length;
                for(int i=0;i<len;i++)
                {
                    int ele=Integer.parseInt(data[i]);
                    stack.push(ele);
                }
                field2.append("ELEMENTS PUSHED"+Arrays.toString(data)+"\n");
                
            }

        });
        popelement.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(!stack.isEmpty())
                {
                    int popped=stack.pop();
                    field2.append("POPPED"+popped+"\n");


                }

            }

        });

    }
    public static void main(String args[])
    {
        new Sta();
    }
}        
