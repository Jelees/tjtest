package ex03;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    public MyFrame2(){
        setTitle("BorderLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(new JButton("Button1"),BorderLayout.NORTH);
        add(new JButton("Button2"),BorderLayout.EAST);
        add(new JButton("Button3"),BorderLayout.CENTER);
        add(new JButton("B4"),BorderLayout.WEST);
        add(new JButton("Long Button5"),BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
