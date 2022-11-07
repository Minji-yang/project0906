package project0906;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import project0906.Exam09.MyGUI;

public class Exam10 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 실습");
			
			Container c=getContentPane();                                      //컨테이너를 만들어놓고 
			
			setLayout(new FlowLayout());			//레이아웃
			JButton btn1=new JButton("버튼1");            //버튼이름
			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					btn1.setBackground(Color.RED);
						c.setBackground(Color.YELLOW);                // 컨테이너의. 백그라운드색을바꿔줘
					/*
					 * 위에서 컨테이너를 만들지 않고 
					 * getContentPane().setBackground(Color.YELLOW);로 바로 가능
					 */
						
				}
				
			});
			
			add(btn1);
			setSize(200,200);
			setVisible(true);
		}
	}


	public static void main(String[] args) {
		new MyGUI();
	}

}
