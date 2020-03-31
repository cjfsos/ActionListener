package ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 익명_무명_클래스로_버튼이벤트_구현2 extends JFrame implements ActionListener{
	JPanel mp; 
	JButton bt;
	
	익명_무명_클래스로_버튼이벤트_구현2(){
		setTitle("JButton 이벤트 처리");
		setSize(400,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정

		
		mp = new JPanel();
		bt = new JButton("쿠루시오");
		bt.setPreferredSize(new Dimension(100,50));
		
		bt.addActionListener(this);
		
		
		mp.add(bt);
		add(mp);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렸당");
	}



	public static void main(String[] args) {
		new 익명_무명_클래스로_버튼이벤트_구현2();
		
	}
}
