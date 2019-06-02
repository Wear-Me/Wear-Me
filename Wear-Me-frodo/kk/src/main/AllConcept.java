package main;

import java.io.File;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class AllConcept extends JFrame implements ActionListener {
	// 0~5
	File[] list;
	File path;

	JLabel item1 = new JLabel("스윗한 핑크남");
	JLabel item2 = new JLabel("캐주얼한 동갑남친");
	JLabel item3 = new JLabel("활동적인 연하남");
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton backBtn = new JButton();
	JLabel label = new JLabel("전체");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public AllConcept() {
		Render();
	}

	public void Render() {
		ImageSave();
		btn1 = new JButton(new ImageIcon("./image//Style//" + list[21].getName()));
		btn2 = new JButton(new ImageIcon("./image//Style//" + list[22].getName()));
		btn3 = new JButton(new ImageIcon("./image//Style//" + list[23].getName()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 360, 625);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		// btn1.setIcon(new
		// ImageIcon(SeasonSelection.class.getResource("/Photos/봄가을아이콘.jpg")));
		btn1.setBounds(20, 100, 130, 130);
		panel.add(btn1);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);

		// btn1.setIcon(new
		// ImageIcon(SeasonSelection.class.getResource("/Photos/봄가을아이콘.jpg")));
		btn2.setBounds(20, 270, 130, 130);
		panel.add(btn2);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);

		// btn1.setIcon(new
		// ImageIcon(SeasonSelection.class.getResource("/Photos/봄가을아이콘.jpg")));
		btn3.setBounds(20, 440, 130, 130);
		panel.add(btn3);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);

		backBtn.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn.setBounds(20, 50, 30, 40);
		panel.add(backBtn);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.addActionListener(this);

		item1.setHorizontalAlignment(SwingConstants.CENTER);
		item1.setBounds(200, 120, 100, 100);
		panel.add(item1);

		item2.setHorizontalAlignment(SwingConstants.CENTER);
		item2.setBounds(200, 290, 100, 100);
		panel.add(item2);

		item3.setHorizontalAlignment(SwingConstants.CENTER);
		item3.setBounds(200, 460, 100, 100);
		panel.add(item3);

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
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == btn2) {
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == btn3) {
			frame.setVisible(false);
			new BodyType();
		} else if (e.getSource() == backBtn) {
			frame.setVisible(false);
			new ConceptSelection();
		}

	}
}