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

public class SeasonSelection extends JFrame implements ActionListener {

	JFrame seasonFrame = new JFrame();
	private JPanel seasonPane; // 계정을 고르기 위한 panel
	JButton btnSF = new JButton("New button");
	JButton btnSummer = new JButton("New button");
	JButton btnWinter = new JButton("New button");
	JButton backBtn = new JButton("");
	JLabel label = new JLabel("지금 계절은 뭐냐");
	String path; // 이미지 경로

	public SeasonSelection() {
		seasonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seasonFrame.setBounds(100, 100, 360, 625);
		seasonPane = new JPanel();
		seasonPane.setBackground(Color.WHITE);
		seasonPane.setLayout(null);

		// 봄,가을 버튼 Photos/계절아이콘/봄가을아이콘.jpg
		btnSF.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/봄가을아이콘.jpg")));
		btnSF.setBounds(50, 237, 95, 95);
		seasonPane.add(btnSF);
		btnSF.setBorderPainted(false);
		btnSF.setContentAreaFilled(false);
		btnSF.addActionListener(this);

		btnSummer.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/여름아이콘.jpg")));
		// 여름 버튼
		btnSummer.setBounds(203, 237, 100, 100);
		seasonPane.add(btnSummer);
		btnSummer.setBorderPainted(false);
		btnSummer.setContentAreaFilled(false);
		btnSummer.addActionListener(this);

		// 겨울 버튼
		btnWinter.setBounds(130, 376, 95, 95);
		seasonPane.add(btnWinter);
		btnWinter.setBorderPainted(false);
		btnWinter.setContentAreaFilled(false);
		btnWinter.addActionListener(this);

		// 안내 문구
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 50, 215, 32);
		seasonPane.add(label);

		backBtn.setBounds(30, 50, 20, 40);
		backBtn.addActionListener(this);
		seasonPane.add(backBtn);

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
		} else if (e.getSource() == backBtn) {
			seasonFrame.setVisible(false);
			new Main();
		}
	}
}
