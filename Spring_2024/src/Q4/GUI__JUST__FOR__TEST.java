package Q4;

import javax.swing.*;
import java.awt.*;

public class GUI__JUST__FOR__TEST {
   public   GUI__JUST__FOR__TEST()
     {
         JFrame frame=new JFrame();
         JLabel label=new JLabel("10");
         JTextField textField=new JTextField();
         JButton button=new JButton("Performed");

         frame.setTitle("Just for run actionPerformed method");
         frame.setLayout(null);
         frame.setSize(400,500);
         frame.getContentPane().setBackground(Color.CYAN);

         label.setBounds(50, 10, 300, 60);
         label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
         textField.setBounds(50, 150, 300, 60);

         button.setBounds(125, 300, 150, 70);
         button.addActionListener(new ActionP(textField,label));


         frame.add(button);
         frame.add(textField);
         frame.add(label);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);



     }

    public static void main(String[] args) {
        new GUI__JUST__FOR__TEST();
    }


}


