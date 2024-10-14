import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JLabel ongoing;
    JButton[] numberbuttons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, Remainder;
    JPanel panel;

    Font myFont = new Font("Arial", Font.PLAIN, 20);

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    boolean decCount=false;
    boolean flagfornextInput=false;
    boolean operatrack=false;


    Calculator() {
        frame = new JFrame("CAlculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 600);
        frame.setResizable(false);
        frame.setLocation(700,200);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        ongoing=new JLabel();
        ongoing.setBounds(50, 10, 300, 30);
        ongoing.setFont(new Font("Arial", Font.PLAIN, 16));
        ongoing.setHorizontalAlignment(SwingConstants.RIGHT);
        ongoing.setBackground(Color.BLACK);
        ongoing.setText("Ongoing operation");
        ongoing.setForeground(Color.LIGHT_GRAY);


        textField = new JTextField();
        textField.setBounds(50, 50, 300, 100);
        textField.setFont(new Font("Arial", Font.PLAIN, 35));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);



        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("C");
        Remainder =new JButton("%");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = Remainder;


        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(Color.BLACK);
            functionButtons[i].setForeground(Color.WHITE);
        }

        for (int i = 0; i < 10; i++) {
            numberbuttons[i] = new JButton(String.valueOf(i));
            numberbuttons[i].addActionListener(this);
            numberbuttons[i].setFont(myFont);
            numberbuttons[i].setFocusable(false);
            numberbuttons[i].setBackground(Color.BLACK);
            numberbuttons[i].setForeground(Color.WHITE);
        }

        delButton.setBounds(50, 480, 100, 50);
        clrButton.setBounds(250, 480, 100, 50);
        Remainder.setBounds(150, 480, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 170, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.BLACK);

        panel.add(numberbuttons[1]);
        panel.add(numberbuttons[2]);
        panel.add(numberbuttons[3]);
        panel.add(addButton);
        panel.add(numberbuttons[4]);
        panel.add(numberbuttons[5]);
        panel.add(numberbuttons[6]);
        panel.add(subButton);
        panel.add(numberbuttons[7]);
        panel.add(numberbuttons[8]);
        panel.add(numberbuttons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberbuttons[0]);
        panel.add(equButton);
        panel.add(divButton);
        frame.add(panel);
        frame.add(delButton);
        frame.add(Remainder);
        frame.add(clrButton);
        frame.add(textField);
        frame.add(ongoing);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if(ongoing.getText().equals("Ongoing operation"))
            {
                ongoing.setText("");
            }


            for (int i = 0; i < 10; i++) {
                if (e.getSource() == numberbuttons[i]&& !flagfornextInput) {
                    textField.setText(textField.getText().concat(String.valueOf(i)));
                    ongoing.setText(ongoing.getText().concat(String.valueOf(i)));

                }
                else if(e.getSource()==numberbuttons[i]&& flagfornextInput)
                {   textField.setText("");
                    textField.setText(textField.getText().concat(String.valueOf(i)));
                    ongoing.setText("");
                    ongoing.setText(ongoing.getText().concat(String.valueOf(i)));
                    flagfornextInput=false;
                    decCount=false;
                }
            }

            if(operatrack)
            {
                if(e.getSource()==addButton)
                     operator='+';
                else if (e.getSource()==subButton) {
                operator='-';

                 } else if (e.getSource()==divButton) {
                    operator='/';


                 } else if (e.getSource()==mulButton) {
                    operator='*';

                 } else if (e.getSource()==Remainder) {
                       operator='%';

                 }

            }

            if (e.getSource() == decButton&&!decCount) {
                textField.setText(textField.getText().concat("."));
                ongoing.setText(ongoing.getText().concat("."));
                decCount=true;
                operatrack=true;
            }

            if (e.getSource() == addButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '+';
                textField.setText("");
                ongoing.setText(ongoing.getText().concat("+"));
                decCount=false;
                operatrack=true;
            }

            if (e.getSource() == subButton) {
                if (textField.getText().equals("")) {
                    textField.setText("-");
                    ongoing.setText(ongoing.getText().concat("-"));
                    decCount=false;
                }
                else
                {
                    num1 = Double.parseDouble(textField.getText());
                    operator = '-';
                    textField.setText("");
                    ongoing.setText(ongoing.getText().concat("-"));
                    decCount=false;
                }
                operatrack=true;
            }

            if (e.getSource() == mulButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '*';
                textField.setText("");
                ongoing.setText(ongoing.getText().concat("*"));
                decCount=false;
                operatrack=true;
            }

            if (e.getSource() == divButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = '/';
                textField.setText("");
                ongoing.setText(ongoing.getText().concat("/"));
                decCount=false;
                operatrack=true;
            }
            if (e.getSource() == Remainder) {
                num1 = Double.parseDouble(textField.getText());
                operator = '%';
                textField.setText("");
                ongoing.setText(ongoing.getText().concat("%"));
                decCount=false;
                operatrack=true;
            }


            if (e.getSource() == equButton) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
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
                            if (num2==0)
                                throw new ArithmeticException() ;
                            result = num1 / num2;
                        break;
                    case '%':
                        result=num1%num2;
                }

                if (result == (int) result&&num2!=0)
                {
                    textField.setText(String.valueOf((int) result));
                    ongoing.setText(ongoing.getText().concat("=").concat(String.valueOf((int)result)));
                } else
                {
                    textField.setText(String.valueOf(result));
                    ongoing.setText(ongoing.getText().concat("=").concat(String.valueOf(result)));
                }

                decCount=false;
                if(num2==0)
                {

                    num1=Double.parseDouble(textField.getText());
                    textField.setText(num1+"");
                }
                else
                {
                    num1 = result;
                    operator=0;
                    flagfornextInput=true;
                    operatrack=false;
                }

            }

        }
        catch (ArithmeticException ex1)
        {
            textField.setText("ERROR");
            flagfornextInput=true;
        }
        catch (NumberFormatException ex2)
        {

        }

        if (e.getSource() == clrButton) {
            textField.setText("");
            ongoing.setText("");
            num1=0;
            num2=0;
            result=0;
        }

        if (e.getSource() == delButton) {
            String string = textField.getText();
            String string1=ongoing.getText();
            ongoing.setText("");
            textField.setText("");
            for (int j = 0; j < string.length() - 1; j++) {
                textField.setText(textField.getText() + string.charAt(j));
            }
            for (int k=0;k<string1.length()-1;k++)
      {
                //            if(textField.getText().isEmpty())
//                    ongoing.setText("");
//                else
                ongoing.setText(ongoing.getText()+string1.charAt(k));
            }
        }


    }
}


