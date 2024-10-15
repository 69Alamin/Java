package Q3.a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
     JFrame frame;
     JButton ADD;
     int label=1;
    public GUI()
    {   frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(400,500);


        ADD=new JButton("ADD");
        ADD.addActionListener(this);


        frame.add(ADD);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new GUI();
    }



    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ADD)
        {
            JButton button=new JButton("b"+String.valueOf(label));
            frame.add(button);
            label++;
            frame.validate();

        }

    }
}
