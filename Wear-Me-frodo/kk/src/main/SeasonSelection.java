package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class SeasonSelection extends JFrame implements ActionListener {

	JFrame seasonFrame = new JFrame();
	private JPanel seasonPane; // 계정을 고르기 위한 panel
	JButton btnSF = new JButton("");
	JButton btnSummer = new JButton("");
	JButton btnWinter = new JButton("");
	JLabel label = new JLabel("지금 계절은 뭐냐");
	String path; // 이미지 경로

	public SeasonSelection() {
		seasonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seasonFrame.setBounds(100, 100, 360, 625);
		seasonPane = new JPanel();
		seasonPane.setBackground(Color.WHITE);
		seasonPane.setLayout(null);

		// 봄,가을 버튼
		btnSF.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/SF.jpg")));
		btnSF.setBounds(12, 223, 158, 150);
		seasonPane.add(btnSF);
		btnSF.setBorderPainted(false);
		btnSF.setContentAreaFilled(false);
		btnSF.addActionListener(this);

		// 여름 버튼
		btnSummer.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Smmer.jpg")));
		btnSummer.setBounds(167, 223, 177, 150);
		seasonPane.add(btnSummer);
		btnSummer.setBorderPainted(false);
		btnSummer.setContentAreaFilled(false);
		btnSummer.addActionListener(this);

		// 겨울 버튼
		btnWinter.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Winter.jpg")));
		btnWinter.setBounds(93, 375, 160, 150);
		seasonPane.add(btnWinter);
		btnWinter.setBorderPainted(false);
		btnWinter.setContentAreaFilled(false);
		btnWinter.addActionListener(this);
		
		
		// 안내 문구
		label.setFont(new Font("Rix장미의유혹Basic Regular", Font.ITALIC, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(50, 126, 240, 46);
		seasonPane.add(label);

		seasonFrame.getContentPane().add(seasonPane);
		seasonFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSF) {
			path = "/Photos/SF";
			seasonFrame.setVisible(false);
			new ConceptSelection();
		} else if (e.getSource() == btnSummer) {
			path = "/Photos/Summer";
			seasonFrame.setVisible(false);
			new ConceptSelection();
		} else if (e.getSource() == btnWinter) {
			path = "/Photos/Winter";
			seasonFrame.setVisible(false);
			new ConceptSelection();
		} 
	}
}
