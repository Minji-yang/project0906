package project0906;

import java.awt.*;

import javax.swing.*;

public class Exam03 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("border layout 실습");
			setLayout(new BorderLayout(10,10)); //레이아웃 잡기
			JButton btn1= new JButton("버튼1");        //버튼만들기
			add(btn1,BorderLayout.NORTH);                 //부착시키기  위치잡기
			JButton btn2= new JButton("버튼2");            // 버튼만들기 
			add(btn2,BorderLayout.WEST);                      //부착시키기  위치잡기
			JButton btn3=new JButton("버튼3");
			add(btn3,BorderLayout.CENTER);
			JButton btn4= new JButton("버튼4");
			add(btn4,BorderLayout.EAST);
			JButton btn5=new JButton("버튼5");
			add(btn5,BorderLayout.SOUTH);
			setSize(256,256);
			setVisible(true);                            //false하면 창이 안보임
		}

	}

	public static void main(String[] args) {
		    new MyGUI();                                  // 생성자 만들어줌 - 이걸 안해주면 창이 뜨지 않는다

	}

}
