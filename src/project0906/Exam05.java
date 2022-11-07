package project0906;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import project0906.Exam04.MyGUI;

public class Exam05 {                                   

	static class MyGUI extends JFrame{
		MyGUI(){                                               //클래스와 동일한 이름의 메소드 . 리턴값없음 =생성자 
			setDefaultCloseOperation(EXIT_ON_CLOSE);   //JFrame.EXIT_ON_CLOSE 와 차이
			
			setLayout(new CardLayout(10,10));            //수평간격 수직간격
			JButton btn1=new JButton("버튼1");                 // 버튼만들기 ("버튼이름")
			add(btn1);                                                                       //부착하기
			JButton btn2=new JButton("버튼2");
			add(btn2);
			JButton btn3=new JButton("버튼3");
			add(btn3);	
			JButton btn4=new JButton("버튼4");
			add(btn4);
			
			
			setTitle("CardLayout실습");
			setSize(500,500);
			setVisible(true);
			
		
		}
	}
	public static void main(String[] args) {
		new MyGUI();
	}

}
