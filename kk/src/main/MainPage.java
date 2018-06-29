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
class Main extends JFrame implements ActionListener{
	JFrame mFrame = new JFrame();
	JPanel mPanel=new JPanel();
	JButton mBtn=new JButton("");
	
	public Main(){
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.setBounds(100, 100, 362, 625);
		
		//mBtn.setIcon(arg0);
		mBtn.setBounds(100, 100, 362, 625);
		mBtn.setBorderPainted(false);
		mBtn.setContentAreaFilled(false);
		
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
		if(e.getSource()==mBtn) {
			mFrame.setVisible(false);
			new ConceptSelection();
		}
	}
	
}
class ConceptSelection extends JFrame implements ActionListener {

	JFrame conceptFrame=new JFrame();
	private JPanel conceptPane; // 컨셉을 고르기 위한 panel
	JButton btnAll = new JButton("전체");
	JButton btnDate = new JButton("데이트");
	JButton btnHongik = new JButton("홍대");
	JButton btnGangnam = new JButton("강남");
	JButton btnHack = new JButton("해커톤");
	JButton btnInterv = new JButton("인터뷰");
	JLabel label = new JLabel("원하는 스타일을 선택해봐");

	public ConceptSelection() {
		conceptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		conceptFrame.setBounds(100, 100, 362, 625);
		conceptPane = new JPanel();
		conceptPane.setBackground(Color.WHITE);
		conceptPane.setLayout(null);

		// 전체 버튼
		//btnAll.setIcon(new ImageIcon("C:\\Users\\BYE\\Desktop\\100예은\\사딘\\폰배경\\001.jpg"));
		btnAll.setBounds(45, 137, 95, 95);
		conceptPane.add(btnAll);
		// 버튼 투명화
		btnAll.setBorderPainted(false);
		btnAll.setContentAreaFilled(false);

		// 데이트 버튼
		//btnDate.setIcon(new ImageIcon("C:\\Users\\BYE\\Desktop\\100예은\\사딘\\폰배경\\003.jpg"));
		btnDate.setBounds(221, 137, 95, 95);
		conceptPane.add(btnDate);
		btnDate.setBorderPainted(false);
		btnDate.setContentAreaFilled(false);

		// 홍대 버튼
		//btnHongik.setIcon(arg0);
		btnHongik.setBounds(45, 293, 95, 95);
		conceptPane.add(btnHongik);
		btnHongik.setBorderPainted(false);
		btnHongik.setContentAreaFilled(false);

		// 강남 버튼
		//btnHongik.setIcon(arg0);
		btnGangnam.setBounds(221, 293, 95, 95);
		conceptPane.add(btnGangnam);
		btnGangnam.setBorderPainted(false);
		btnGangnam.setContentAreaFilled(false);

		// 해커톤 버튼
		//btnHack.setIcon(arg0);
		btnHack.setBounds(45, 454, 95, 95);
		conceptPane.add(btnHack);
		btnHack.setBorderPainted(false);
		btnHack.setContentAreaFilled(false);

		// 면접 버튼
		//btnInterv.setIcon(arg0);
		btnInterv.setBounds(221, 454, 95, 95);
		conceptPane.add(btnInterv);
		btnInterv.setBorderPainted(false);
		btnInterv.setContentAreaFilled(false);

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 50, 215, 32);
		conceptPane.add(label);

		conceptFrame.add(conceptPane);
		conceptFrame.setVisible(true);
		
		btnAll.addActionListener(this);
		btnDate.addActionListener(this);
		btnHongik.addActionListener(this);
		btnGangnam.addActionListener(this);
		btnHack.addActionListener(this);
		btnInterv.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == btnAll) {

		} else if (e.getSource() == btnDate) {

		} else if (e.getSource() == btnHongik) {

		} else if (e.getSource() == btnGangnam) {

		} else if (e.getSource() == btnHack) {

		} else if (e.getSource() == btnInterv) {

		}
	}
}
