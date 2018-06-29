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

public class SeasonSelection extends JFrame {

	JFrame seasonFrame = new JFrame();
	private JPanel seasonPane; //계정을 고르기 위한 panel
	JButton btnSF = new JButton("New button");
	JButton btnSummer = new JButton("New button");
	JButton btnWinter = new JButton("New button");
	JLabel label = new JLabel("지금 계절은 뭐냐");


	public SeasonSelection() {
		seasonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seasonFrame.setBounds(100, 100, 360, 625);
		seasonPane = new JPanel();
		seasonPane.setBackground(Color.WHITE);
		seasonPane.setLayout(null);
		
		
		//봄,가을 버튼 Photos/계절아이콘/봄가을아이콘.jpg	
		btnSF.setIcon(new ImageIcon("kk/src/Photos/봄가을아이콘.jpg"));
		btnSF.setBounds(35, 237, 95, 23);
		seasonPane.add(btnSF);
		btnSF.setBorderPainted(false);
		btnSF.setContentAreaFilled(false);
		
		
		//여름 버튼
		btnSummer.setBounds(203, 237, 95, 23);
		seasonPane.add(btnSummer);
		btnSummer.setBorderPainted(false);
		btnSummer.setContentAreaFilled(false);
		
		
		//겨울 버튼
		btnWinter.setBounds(130, 376, 95, 23);
		seasonPane.add(btnWinter);
		btnWinter.setBorderPainted(false);
		btnWinter.setContentAreaFilled(false);
		
		
		
		//안내 문구
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 50, 215, 32);
		seasonPane.add(label);
		
		
		seasonFrame.getContentPane().add(seasonPane);
		seasonFrame.setVisible(true);
	}
}
