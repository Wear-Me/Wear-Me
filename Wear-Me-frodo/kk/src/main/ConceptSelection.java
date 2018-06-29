package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ConceptSelection extends JFrame implements ActionListener {

	JFrame conceptFrame = new JFrame();
	private JPanel conceptPane; // 컨셉을 고르기 위한 panel
	JButton btnAll = new JButton("");
	JButton btnDate = new JButton("");
	JButton btnHongik = new JButton("");
	JButton btnGangnam = new JButton("");
	JButton btnHack = new JButton("");
	JButton btnInterv = new JButton("");
	JButton backBtn = new JButton("");
	JLabel label = new JLabel("원하는 스타일을 선택해봐");

	public ConceptSelection() {
		conceptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		conceptFrame.setBounds(100, 100, 360, 625);
		conceptPane = new JPanel();
		conceptPane.setBackground(Color.WHITE);
		conceptPane.setLayout(null);

		// 전체 버튼
		btnAll.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/All.jpg")));
		btnAll.setBounds(12, 137, 158, 140);
		conceptPane.add(btnAll);
		// 버튼 투명화
		btnAll.setBorderPainted(false);
		btnAll.setContentAreaFilled(false);

		// 데이트 버튼
		btnDate.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Date.jpg")));
		btnDate.setBounds(182, 137, 140, 140);
		conceptPane.add(btnDate);
		btnDate.setBorderPainted(false);
		btnDate.setContentAreaFilled(false);

		// 홍대 버튼
		btnHongik.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Hong.jpg")));
		btnHongik.setBounds(22, 287, 140, 140);
		conceptPane.add(btnHongik);
		btnHongik.setBorderPainted(false);
		btnHongik.setContentAreaFilled(false);

		// 강남 버튼
		btnGangnam.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Gang.jpg")));
		btnGangnam.setBounds(182, 287, 140, 140);
		conceptPane.add(btnGangnam);
		btnGangnam.setBorderPainted(false);
		btnGangnam.setContentAreaFilled(false);

		// 해커톤 버튼
		btnHack.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Hack.jpg")));
		btnHack.setBounds(22, 437, 140, 140);
		conceptPane.add(btnHack);
		btnHack.setBorderPainted(false);
		btnHack.setContentAreaFilled(false);

		// 면접 버튼
		btnInterv.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Inter.jpg")));
		btnInterv.setBounds(182, 437, 140, 140);
		conceptPane.add(btnInterv);
		btnInterv.setBorderPainted(false);
		btnInterv.setContentAreaFilled(false);

		//안내문구
		label.setFont(new Font("Rix장미의유혹Basic Regular", Font.ITALIC, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(30, 58, 302, 32);
		conceptPane.add(label);

		conceptFrame.getContentPane().add(conceptPane);
		conceptFrame.setVisible(true);

		backBtn.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn.setBounds(20, 50, 30, 40);
		conceptPane.add(backBtn);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.addActionListener(this);
		

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
			conceptFrame.setVisible(false);
			new AllConcept();
		} else if (e.getSource() == btnDate) {
			conceptFrame.setVisible(false);
			new DateConcept();
		} else if (e.getSource() == btnHongik) {
			conceptFrame.setVisible(false);
			new HongConcept();
		} else if (e.getSource() == btnGangnam) {
			conceptFrame.setVisible(false);
			new GangConcept();
		} else if (e.getSource() == btnHack) {
			conceptFrame.setVisible(false);
			new HackConcept();
		} else if (e.getSource() == btnInterv) {
			conceptFrame.setVisible(false);
			new InterConcept();
		} else if (e.getSource() == backBtn) {
			conceptFrame.setVisible(false);
			new SeasonSelection();
		}
	}
}
