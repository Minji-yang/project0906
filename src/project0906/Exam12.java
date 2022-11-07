package project0906;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Exam12 extends JFrame{
	Exam12(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Key Event");
		
		setLayout(new FlowLayout());               //FlowLayout뒤에() 붙여줄것
		
		JTextField txt1=new JTextField(10);           // JTextField (크기) 넣어줄것 
		JTextArea area=new JTextArea(10,10);    //  JTextArea(줄갯수, 크기)
			
		txt1.addKeyListener(new KeyListener() {                  //txt1에 이벤트를 주자

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {                	//VK다음에 나오는게 자판키 
				    String str=txt1.getText();                           // 입력한 값 담아뒀다가
				    area.setText(area.getText()+str+'\n');                  // area에  가져감
				    txt1.setText("");                                  //클리어 시켜주기
				}
				
			}
			
			
		});
		
		 add(txt1);
		 add(area);		
		
		setSize(200,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam12();

	}

}
