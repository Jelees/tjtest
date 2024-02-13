package ex03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setSize(700, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("피자주문");
        f.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel label1 = new JLabel("자바피자에 오신것을 환영합니다.");
        panel2.add(label1);

        JButton button1 = new JButton("포테이토피자");
        JButton button2 = new JButton("콤비네이션피자");
        JButton button3 = new JButton("쉬림프피자");
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);

        JLabel label2 = new JLabel("개수: ");
        JTextField field2 = new JTextField(10);
        panel3.add(label2);
        panel3.add(field2);

        panel1.add(panel2);
        panel1.add(panel3);
        f.add(panel1);

    }
}
