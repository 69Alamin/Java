package Q3.b;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class SimpleNumberOperationsGUI extends JFrame implements ActionListener {

    // Declare components outside the constructor
     JTextField num1Field, num2Field, num3Field, resultField;
     JButton maxButton, minButton, avgButton, clearButton;

    public SimpleNumberOperationsGUI() {
        // Set up the frame
        setTitle("Number Operations");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        num1Field = new JTextField(5);
        num2Field = new JTextField(5);
        num3Field = new JTextField(5);
        resultField = new JTextField(5);
        resultField.setEditable(false);  // Result field should be non-editable

        maxButton = new JButton("Maximum");
        minButton = new JButton("Minimum");
        avgButton = new JButton("Average");
        clearButton = new JButton("Clear");

        // Add components to the frame
        add(new JLabel("Num 1"));
        add(num1Field);
        add(new JLabel("Num 2"));
        add(num2Field);
        add(new JLabel("Num 3"));
        add(num3Field);
        add(new JLabel("Found"));
        add(resultField);


        ////
        //Add action listener
        num1Field.addActionListener(this);
        num2Field.addActionListener(this);
        num3Field.addActionListener(this);
        resultField.addActionListener(this);
        maxButton.addActionListener(this);
        minButton.addActionListener(this);
        avgButton.addActionListener(this);
        clearButton.addActionListener(this);



        // Add buttons to the frame
        add(maxButton);
        add(minButton);
        add(avgButton);
        add(clearButton);

        // Set the frame to be visible
        setVisible(true);
    }

   ////For answer only this method
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1=Double.parseDouble(num1Field.getText());
        double num2=Double.parseDouble(num2Field.getText());
        double num3=Double.parseDouble(num3Field.getText());


        if(e.getSource()==maxButton)
        {
            if(num1>=num2&&num1>=num3)
                resultField.setText(num1+"");
            else if(num2>=num1&&num2>=num3)
                resultField.setText(num2+"");
            else
                resultField.setText(num3+"");
        }
        else if(e.getSource()==minButton)
        {
            if(num1<=num2&&num1<=num3)
                resultField.setText(num1+"");
            else if(num2<=num1&&num2<=num3)
                resultField.setText(num2+"");
            else
                resultField.setText(num3+"");
        }
        else if(e.getSource()==avgButton)
        {   double avr=(num1+num2+num3)/3;
            resultField.setText(avr+"");
        }
        else if (e.getSource()==clearButton)
        {
            num1Field.setText("");
            num2Field.setText("");
            num3Field.setText("");
            resultField.setText("");

        }


    }




    public static void main(String[] args) {
        new SimpleNumberOperationsGUI();
    }


}


