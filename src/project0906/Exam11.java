package project0906;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exam11 extends JFrame {
	Exam11(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //JFrame swing 임포트
		setTitle("Mouse Event");
		
		setLayout(new FlowLayout());                //레이아웃 awt 임포트
		
		JTextField txt1=new JTextField(10);                       //JTextfield로 적으면 오류남   대문자 각각 써줌
		add(txt1);
		JTextField txt2=new JTextField(10);
		add(txt2);
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				txt1.setText(Integer.toString(e.getX()));
				txt2.setText(Integer.toString(e.getY()));
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setSize(200,200);
		setVisible(true);
			}
	
	

	public static void main(String[] args) {
        new Exam11();
	}

}
