package project0906;

import java.awt.*;
import javax.swing.*; // Jframe  JButton  등을  다 포함 *

public class Exam02 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI 프로그램 ");   
			//윈도우 창의 탭의 이름 - HTML HEAD 안 TITLE과 같은기능  -탭이름
			setLayout(new FlowLayout());
			JButton btn1=new JButton("버튼1");     //버튼 생성만하면 뜨지않고 붙이는 작업필요
			add(btn1);  //버튼생성
			JButton btn2=new JButton("버튼2");  // 클래스 객체생성과 유사한 형태
			add(btn2);
			JButton btn3=new JButton("버튼3");    // 다 만들어놓고  add한꺼번에 부착도 가능
			add(btn3);
			JButton btn4=new JButton("버튼4");
			add(btn4);
			JButton btn5=new JButton("버튼5");
			add(btn5);
			JTextField txt1=new JTextField(20);              //Textfield로 쓰면 오류
			add(txt1);
			JCheckBox ch1=new JCheckBox("a");
			add(ch1);        //여러개선택가능         radio는 하나만 선택할 수 있어야되니까
		
			setSize(256,256); // 창 크기 픽셀단위
			setVisible(true);
			
		}
	}

	public static void main(String[] args) {
		new MyGUI();              // 이거 생성해줘야 창이 뜸

	}

}
