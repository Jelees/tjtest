package ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextAdd extends JFrame {
    private JButton button1, button2, button3;
    private JTextField text1, text2, result;

    public TextAdd() {
        setSize(280, 150);
        setTitle("덧셈 계산하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonListener listener = new ButtonListener();	// 리스너 객체 생성

        JPanel panel = new JPanel();
        panel.add(new JLabel("숫자 입력1: "));		// 레이블 생성
        text1 = new JTextField(15);		// 컬럼수가 15인 텍스트 필드 생성
        text1.addActionListener(listener);	// 텍스트 필드에 리스너 연결
        panel.add(text1);

        panel.add(new JLabel("숫자 입력2: "));		// 레이블 생성
        text2 = new JTextField(15);		// 컬럼수가 15인 텍스트 필드 생성
        text2.addActionListener(listener);	// 텍스트 필드에 리스너 연결
        panel.add(text2);

        panel.add(new JLabel("계산 결과: "));
        result = new JTextField(15);	// 결과를 나타낼 텍스트 필드
        result.setEditable(false);		// 편집 불가 설정
        panel.add(result);

        button1 = new JButton("+");
        button1.addActionListener(listener);
        panel.add(button1);

        button2 = new JButton("*");
        button2.addActionListener(listener);
        panel.add(button2);

        button3 = new JButton("Clear");
        button3.addActionListener(listener);
        panel.add(button3);

        add(panel);
        setVisible(true);
    }
    // 텍스트 필드와 버튼의 액션 이벤트 처리
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1 || e.getSource() == text1 || e.getSource() == text2) {
                String text1Value = text1.getText().trim();
                String text2Value = text2.getText().trim();
                if (!text1Value.isEmpty() && !text2Value.isEmpty()) {
                    int value1 = Integer.parseInt(text1Value);
                    int value2 = Integer.parseInt(text2Value);
                    result.setText(" " + (value1 + value2));
                    text1.setText("" + (value1 + value2) );
                    text2.setText("");
                }
                text1.requestFocus();
            } else if (e.getSource() == button2) {
                String text1Value = text1.getText().trim();
                String text2Value = text2.getText().trim();
                if (!text1Value.isEmpty() && !text2Value.isEmpty()) {
                    int value1 = Integer.parseInt(text1Value);
                    int value2 = Integer.parseInt(text2Value);
                    result.setText(" " + (value1 * value2));
                    text1.setText("" + (value1 * value2) );
                    text2.setText("");
                }
                text1.requestFocus();
            } else if(e.getSource() == button3){
                text1.setText("");
                text2.setText("");
                result.setText("");
                text1.requestFocus();
            }
        }
    }
    public static void main(String[] args) {
        new TextAdd();
    }
}