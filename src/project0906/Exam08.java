package project0906;

import java.awt.FlowLayout;

import javax.swing.*;

public class Exam08 {
	static class MyGUI extends JFrame{                                 //Static 아님 Class 아님 
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("텍스트 실습");
			
			setLayout(new FlowLayout());
			
			JTextField txt1=new JTextField(10);                      //   한줄 ,크기10
			add(txt1); 
			JTextArea txt2=new JTextArea(5,10);            // 여러줄  5줄 , 크기 10
			add(txt2);
			add(new JScrollPane(txt2));               //칸이넘어가면 스크롤바가 생성됨
			
			JPasswordField txt3= new JPasswordField(10);             //  입력시 * , 크기 10
			add(txt3);
			
			
			setSize(200,300);
			setVisible(true);
			
			
		}
	}

	public static void main(String[] args) {
		new MyGUI();

	}

}
