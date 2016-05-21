package lotto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LotteryUI extends JFrame implements ActionListener {
	Lottery lottery;
	JButton btn;
	JPanel panNorth, panSouth;
	ImageIcon icon;
	List<JButton> btns;//interface(자료구조 - 4가지 : Set, List, Queue, Map)
	/*
	 * Set : index가 없다
	 * List : index존재
	 * Queue : 
	 * Map : index가 없으나, key값이 존재
	 */
	//List<?> btns;//interface(자료구조)
	public LotteryUI() {
		lottery = new Lottery();
		btn = new JButton("로또번호추첨");
		panNorth = new JPanel();
		panNorth.setBackground(Color.BLUE);
		panSouth = new JPanel();
		panSouth.setBackground(Color.BLUE);
		btns = new ArrayList<JButton>();//implement
		
//		icon = new ImageIcon(location)
		
		btn.addActionListener(this);
		panNorth.add(btn);
		add(panNorth, BorderLayout.NORTH);
		add(panSouth, BorderLayout.SOUTH);
		//this.setBounds(x, y, width, height);
		setBounds(300, 400, 1200, 300);
		// 300, 400은 x, y 좌표값
		// 1200, 300은 픽셀크기
		setVisible(true);//화면에 보여짐.
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = null;
		for (int i = 0; i < 6; i++) {
			btn = new JButton();
			btns.add(btn);
			panSouth.add(btn);
		}
		int[] lotto = lottery.getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
			btns.get(i).setIcon(this.getIcon(lotto[i]));
		}
		
		
	}
	
	private Icon getIcon(int i) {
		String img = "src/img/"+Integer.toString(i)+".gif";
		ImageIcon icon = new ImageIcon(img);
		return icon;
	}
	

}
