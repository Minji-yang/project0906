package project0906;

import java.awt.*;

import javax.swing.*;

public class Alone {
    static class MyGUI extends JFrame{                              //swing 임포트
    	MyGUI(){
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// SetDefaultCloseOperation오류
    		setTitle("combo박스와 List");
    		
    		setLayout(new FlowLayout());                     // awt 임포트
    		
    		String pet[]={"고양이","강아지","토끼","코알라","송아지"};  //pet 배열 잡기 []= {};
    		JList li1=new JList(pet);                                       //Jlist쓰면 오타    //배열에따른 리스트
    		JComboBox combo=new JComboBox(pet);          //JCombobox써도 오타  //배열에따른 콤보박스
    		//리스트는 shift키나 ctrl  누른상태에서 여러개 선택가능,    콤보박스는 하나만 선택가능
    		add(li1);
    		add(combo);                    // html에서 옵션
    		
    		   		
    		setSize(300,300);
    		setVisible(true);
    		
    	}
    }
	
	public static void main(String[] args) {
		new MyGUI();

	}

}
