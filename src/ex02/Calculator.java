package ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;

    private String num1="", num2="", operator;

    public Calculator(){
        txt = new JTextField(20);
        add(txt, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        add(panel,BorderLayout.CENTER);
        String[] button_names = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "C", "0", "=", "/"};
        JButton btn[] = new JButton[button_names.length];
        for (int i = 0; i<button_names.length; i++){
            btn[i] = new JButton(button_names[i]);
            btn[i].addActionListener(this);
            btn[i].setPreferredSize(new Dimension(100,100));
            panel.add(btn[i]);
        }
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "+":
            case "-":
            case "*":
            case "/":
                operator = actionCommand;
                num1 = txt.getText().trim();
                txt.setText("");
                break;
            case "=":
                num2 = txt.getText().trim();
                if(!num1.isEmpty() && !num2.isEmpty()) {
                    double result = 0;
                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);

                    switch (operator) {
                        case "+":
                            result = n1 + n2;
                            break;
                        case "-":
                            result = n1 - n2;
                            break;
                        case "*":
                            result = n1 * n2;
                            break;
                        case "/":
                            if (n2 != 0) {
                                result = n1 / n2;
                            } else {
                                txt.setText("잘못된 숫자를 입력하였습니다.");
                                return;
                            }
                            break;
                    }

                    txt.setText(Double.toString(result));
                }
                break;
            case "C":
                txt.setText("");
                break;
            default:
                txt.setText(txt.getText() + actionCommand);
                break;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}