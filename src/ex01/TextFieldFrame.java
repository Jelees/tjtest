package ex01;

import javax.swing.*;
import java.awt.event.*;

class TextFieldFrame extends JFrame {
    private JButton button1, button2;
    private JTextField text, result;

    public TextFieldFrame() {
        setSize(300, 130);
        setTitle("제곱 계산하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonListener listener = new ButtonListener();	// 리스너 객체 생성

        JPanel panel = new JPanel();
        panel.add(new JLabel("숫자 입력: "));		// 레이블 생성
        text = new JTextField(15);		// 컬럼수가 15인 텍스트 필드 생성
        text.addActionListener(listener);	// 텍스트 필드에 리스너 연결
        panel.add(text);

        panel.add(new JLabel("제곱한 값: "));
        result = new JTextField(15);	// 결과를 나타낼 텍스트 필드
        result.setEditable(false);		// 편집 불가 설정
        panel.add(result);
        button1 = new JButton("OK");
        button1.addActionListener(listener);
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.addActionListener(listener);
        panel.add(button2);
        add(panel);
        setVisible(true);
    }
    // 텍스트 필드와 버튼의 액션 이벤트 처리
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1 || e.getSource() == text) {
                String name = text.getText();
                int value = Integer.parseInt(name);
                result.setText(" " + value * value);
                text.requestFocus();
            } else if(e.getSource() == button2 ){
                text.setText("");
                result.setText("");
                text.requestFocus();
            }
        }
    }
}
