package ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 익명_무명_클래스로_버튼이벤트_구현 extends JFrame{//implements 를 안함
	JPanel mp; 
	JButton bt;
	
	익명_무명_클래스로_버튼이벤트_구현(){
		setTitle("JButton 이벤트 처리");
		setSize(400,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정

		
		mp = new JPanel();
		bt = new JButton("쿠루시오");
		bt.setPreferredSize(new Dimension(100,50));
		
		//익명(무명)의 클래스로 버튼 이벤트 추가
		bt.addActionListener(new ActionListener() {//버튼.액션리스너(뉴 액션리스터()
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌리고야 말았다.");
			}
		});
		mp.add(bt);
		add(mp);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new 익명_무명_클래스로_버튼이벤트_구현();
		
	}
}
