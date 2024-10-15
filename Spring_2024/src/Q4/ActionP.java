package Q4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionP implements ActionListener {
    JTextField textField;
    JLabel label;
   public ActionP(JTextField textField,JLabel label)
    {
        this.label=label;
        this.textField=textField;
    }


    //For answrer this question you have to writhe only this actionPerformed method

    @Override
    public void actionPerformed(ActionEvent e) {
        String input=textField.getText();
        double resutl=0;
        String []parts=input.split(" ");  //In parts zero index i store operator as String
        switch (parts[0]){
            case "+":
                resutl= Double.parseDouble(label.getText())+Double.parseDouble(parts[1]);
                break;
            case "-":
                resutl= Double.parseDouble(label.getText())-Double.parseDouble(parts[1]);
                break;
            case "*":
                resutl= Double.parseDouble(parts[1])*Double.parseDouble(label.getText());
                break;
            case "/":
                resutl= Double.parseDouble(label.getText())/Double.parseDouble(parts[1]);
                break;
        }
        label.setText(resutl+"");

    }
}


