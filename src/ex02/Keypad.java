package ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keypad extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;

    public Keypad(){
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
                String currentText = txt.getText().trim();
                if (!currentText.isEmpty()) {
                    txt.setText(currentText + "+");
                }
                break;
            case "/" :
                break;
            case "=":
                String[] number1 = txt.getText().split("\\+");
                double sum = 0;
                for (String num : number1) {
                    sum += Double.parseDouble(num.trim());
                }
                txt.setText(Double.toString(sum));
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
        new Keypad();
    }
}


