package ex03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mylab {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JPanel panel = new JPanel();

        f.add(panel);


        JLabel label1 = new JLabel("화씨 온도");

        JLabel label2 = new JLabel("섭씨 온도");

        JTextField field1 = new JTextField(15);

        JTextField field2 = new JTextField(15);

        JButton button = new JButton("변환");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(field1.getText());
                double celsius = (fahrenheit - 32 ) * 5 / 9;
                field2.setText(String.valueOf(celsius));
            }
        });

        panel.add(label1);

        panel.add(field1);

        panel.add(label2);

        panel.add(field2);

        panel.add(button);

        f.setSize(300, 150);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setTitle("온도변환기");

        f.setVisible(true);

    }

}
