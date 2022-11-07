package project0906;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Exam14 extends JFrame{
	Exam14(){
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //set소문자로해주기
		setTitle("Toolbar 실습");
		
	
		
		setLayout(new FlowLayout());                                               //import
		
		JToolBar toolbar=new JToolBar();                              //JToolbar 오류   import
		ImageIcon img1=new ImageIcon("images/exit.png");
		
		
		JButton btn1=new JButton("새문서");                            // import
		JButton btn2=new JButton("열기");        
		JButton btn3=new JButton(img1);             // ImageIcon  import 
		
		add(toolbar,BorderLayout.CENTER);         //toolbar이름맞춰주기 toolBar로 위에도 써주면 좋음  //레이아웃임포트
		toolbar.add(btn1);
		toolbar.add(btn2);
		toolbar.add(btn3);
		
		JLabel lbl=new JLabel("이 글자가 바뀝니다.");           //import
		add(lbl);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(" 새문서를 선택했습니다.");
		
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("새문서를 열겠습니다.");
							}
	
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
			
		});
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	  new Exam14();

	}

}
