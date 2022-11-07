package project0906;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Exam06 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Container 실습");
		
			Container c=getContentPane();
			c.setBackground(Color.YELLOW);          
			
			setLayout(new FlowLayout());
			JButton btn1=new JButton("버튼1");         //대소문자 주의
			btn1.setBackground(Color.black);
			c.add(btn1);                                                                   // 검은색이라서 안보임
			btn1.setForeground(Color.MAGENTA);
			c.add(btn1);
			
			JButton btn2=new JButton("버튼2");         //대소문자 주의
			btn2.setFont(new Font("맑은고딕",Font.BOLD,30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));         //대기모양 마우스
			btn2.setToolTipText("이 버튼은 크게 보여요~");                              //마우스대면 글자나옴
			c.add(btn2);
			
			JButton btn3=new JButton("버튼3");
			btn3.setEnabled(false);                          //비활성화
			c.add(btn3);                                                      //c.을 생략해도되나요
	
			
			setSize(300,300);
			setVisible(true);
		
		
		
		
		}
	}

	
	public static void main(String[] args) {
		new MyGUI();

	}

}
