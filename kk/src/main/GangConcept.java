package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GangConcept extends JFrame implements ActionListener {
	// 16~20
	File[] list;
	File path;
	
	JLabel label = new JLabel("강남");
	
	JLabel item1 = new JLabel("<html><center>깔맞춤<BR>린넨수트세트</center><html>");
	JLabel item2 = new JLabel("<html><center>흰티에<BR>네이비슬랙스</center><html>");
	JLabel item3 = new JLabel("<html><center>데이트하러<BR>나온 오빠</center><html>");
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JButton backBtn = new JButton();
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public GangConcept() {
		Render();
	}


	public void Render() {
		ImageSave();

		btn1 = new JButton(new ImageIcon("./image//Style//" + list[14].getName()));
		btn2 = new JButton(new ImageIcon("./image//Style//" + list[13].getName()));
		btn3 = new JButton(new ImageIcon("./image//Style//" + list[12].getName()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 360, 625);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		btn1.setBounds(20, 100, 130, 130);
		panel.add(btn1);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		
		btn2.setBounds(20, 270, 130, 130);
		panel.add(btn2);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		
		btn3.setBounds(20, 440, 130, 130);
		panel.add(btn3);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);
		
		backBtn.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn.setBounds(20, 50, 30, 40);
		panel.add(backBtn);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);

		item1.setForeground(Color.GRAY);
		item1.setFont(new Font("Rix장미의유혹Basic Regular", Font.PLAIN, 20));
		item1.setHorizontalAlignment(SwingConstants.CENTER);
		item1.setBounds(177, 120, 153, 100);
		panel.add(item1);

		item2.setForeground(Color.GRAY);
		item2.setFont(new Font("Rix장미의유혹Basic Regular", Font.PLAIN, 20));
		item2.setHorizontalAlignment(SwingConstants.CENTER);
		item2.setBounds(177, 290, 153, 100);
		panel.add(item2);

		
		item3.setForeground(Color.GRAY);
		item3.setFont(new Font("Rix장미의유혹Basic Regular", Font.PLAIN, 20));
		item3.setHorizontalAlignment(SwingConstants.CENTER);
		item3.setBounds(177, 460, 153, 100);
		panel.add(item3);
		
		
		label.setFont(new Font("Rix장미의유혹Basic Regular", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 50, 215, 32);
		panel.add(label);

		frame.getContentPane().add(panel);
		frame.setVisible(true);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		backBtn.addActionListener(this);
	}

	void ImageSave() {
		path = new File("./image//Style//");
		list = path.listFiles();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == btn1) {
			ConceptSelection.str +="14";
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == btn2) {
			ConceptSelection.str +="13";
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == btn3) {
			ConceptSelection.str +="12";
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == backBtn) {
			frame.setVisible(false);
			new ConceptSelection();
		}

	}
}
