package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class MainPage {
	public static void main(String[] args) {
		new Main();
	}
}

class Main extends JFrame implements ActionListener {
	JFrame mFrame = new JFrame();
	JPanel mPanel = new JPanel();
	JButton mBtn = new JButton("");

	public Main() {
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.setBounds(100, 100, 360, 625);

		// mBtn.setIcon(arg0);
		mBtn.setBounds(50, 400, 250, 100);


		mPanel.setBackground(Color.WHITE);
		mPanel.setLayout(null);
		mPanel.add(mBtn);

		mFrame.add(mPanel);
		mFrame.setVisible(true);

		mBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == mBtn) {
			mFrame.setVisible(false);
			new ConceptSelection();
		}
	}
}
