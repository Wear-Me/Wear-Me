package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AvrType extends JPanel implements ActionListener {
	JFrame longFrame = new JFrame();
	JPanel longPanel = new JPanel();

	JButton upBtn = new JButton("상의");
	JButton downBtn = new JButton("하의");
	JButton outBtn = new JButton("아우터");
	JButton otherBtn = new JButton("다른 옷 추가");
	JButton backBtn = new JButton();
	Image fatImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image thinImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image muscleImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image avrImage = new ImageIcon("./src/image/cloud.jpg").getImage();

	int typeNum;

	public AvrType(int type) {
		typeNum = type;

		longFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		longFrame.setBounds(100, 100, 362, 625);
		longPanel.setBackground(Color.WHITE);
		longPanel.setLayout(null);

		upBtn.setBounds(20, 510, 70, 70);
		longPanel.add(upBtn);
		upBtn.setBorderPainted(false);
		upBtn.setContentAreaFilled(false);

		downBtn.setBounds(100, 510, 70, 70);
		longPanel.add(downBtn);
		downBtn.setBorderPainted(false);
		downBtn.setContentAreaFilled(false);

		outBtn.setBounds(180, 510, 70, 70);
		longPanel.add(outBtn);
		outBtn.setBorderPainted(false);
		outBtn.setContentAreaFilled(false);

		otherBtn.setBounds(260, 510, 70, 70);
		longPanel.add(otherBtn);
		otherBtn.setBorderPainted(false);
		otherBtn.setContentAreaFilled(false);

		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		outBtn.addActionListener(this);
		otherBtn.addActionListener(this);

		backBtn.setBounds(30, 50, 20, 40);
		backBtn.addActionListener(this);
		longPanel.add(backBtn);

		longFrame.add(longPanel);
		longFrame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (typeNum == 0) {
			g.drawImage(fatImage, 140, 150, null);
		} else if (typeNum == 1) {
			g.drawImage(thinImage, 140, 150, null);
		} else if (typeNum == 2) {
			g.drawImage(muscleImage, 140, 150, null);
		} else if (typeNum == 3) {
			g.drawImage(avrImage, 140, 150, null);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == backBtn) {
			longFrame.setVisible(false);
			new BodyType();
		}
	}
}
