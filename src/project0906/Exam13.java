package project0906;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exam13 extends JFrame {
	Exam13(){                                                                                    //생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu 실습하기");
		
		Container c=getContentPane();                              //컨테이너가 있어야 배경색을 바꿀수있음
		
		setLayout(new FlowLayout());
		
		JMenuBar menubar = new JMenuBar();                //메뉴바-메뉴-메뉴아이템순서대로 만들어주기
		JMenu menu1 =new JMenu("파일");                         //메뉴만들기
		JMenu menu2=new JMenu("편집");
		JMenu menu3=new JMenu("색상");
		
		JMenuItem item1=new JMenuItem("새문서");             //아이템만들기
		JMenuItem item2=new JMenuItem("열기");
		JMenuItem item3=new JMenuItem("닫기");
		
		setJMenuBar(menubar);                                           //메뉴바를 부착시켜준다.  set.MenuBar 오류
		
		menubar.add(menu1);                                                //이름을 menuBar로 해주는게 더 좋음
		menubar.add(menu2);                                                //메뉴를 메뉴바에 부착시킨다 
		menubar.add(menu3);                                                   // 부착시키지않으면 안나타남
		
		JMenuItem color1=new JMenuItem("빨강");
		JMenuItem color2=new JMenuItem("녹색");
		JMenuItem color3=new JMenuItem("파랑");
		
		menu3.add(color1);
		menu3.add(color2);
		menu3.add(color3);
	
	color1.addActionListener(new ActionListener() {                   //괄호주의

		@Override
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.RED);
			
		}
		
	});	
	
	color2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.GREEN);
			
		}
		
	});
	
	color3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.BLUE);                                 // Color : Blue 아님
			
		}
		
	});
	
	
			
		menu1.add(item1);                                                          //메뉴아이템 ( 메뉴목록을 ) 메뉴에 부착시킨다
		menu1.add(item2);
		menu1.add(item3);
		
		JMenuItem edit1=new JMenuItem("복사");                       // 아이템을 만들고
		JMenuItem edit2=new JMenuItem("잘라내기");
		JMenuItem edit3=new JMenuItem("붙여넣기");
		
		menu2.add(edit1);                                                                 // 아이템을 메뉴에 부착시킨다.
		menu2.add(edit2);
		menu2.addSeparator();                                                  //아이템과 아이템 사이에 분리되는 줄 넣기
		menu2.add(edit3);
						
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam13();                          // new 뜰때 생성자가 실행됨

	}

}
