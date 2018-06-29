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

public class BodyType extends JFrame implements ActionListener {
	JFrame bodyFrame = new JFrame();
	JFrame bodyFrame2 = new JFrame();
	JPanel bodyPanel1 = new JPanel();
	JPanel bodyPanel2 = new JPanel();

	JButton btnThin = new JButton("");
	JButton btnFat = new JButton("");
	JButton btnMuscle = new JButton("");
	JButton btnAvr1 = new JButton("");
	JButton btnLong = new JButton("");
	JButton btnShort = new JButton("");
	JButton btnAvr2 = new JButton("");
	JButton backBtn = new JButton("");
	JButton backBtn2 = new JButton("");

	JLabel bodylabel1 = new JLabel("너의 몸뚱아리는 어떻냐");
	JLabel bodyLabel2 = new JLabel("너의 사지길이는 어떻냐");

	boolean thin = false;
	boolean fat = false;
	boolean muscle = false;
	boolean avr = false;

	public BodyType() {
		bodyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bodyFrame.setBounds(100, 100, 362, 625);

		bodyFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bodyFrame2.setBounds(100, 100, 362, 625);

		bodyPanel1.setBackground(Color.WHITE);
		bodyPanel1.setLayout(null);

		bodyPanel2.setBackground(Color.WHITE);
		bodyPanel2.setLayout(null);

		
		//멸치 버튼
		btnThin.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/thin.jpg")));
		btnThin.setBounds(33, 181, 135, 135);
		bodyPanel1.add(btnThin);
		btnThin.setBorderPainted(false);
		btnThin.setContentAreaFilled(false);

		//뚱뚱 버튼
		btnFat.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/fat.jpg")));
		btnFat.setBounds(180, 181,  135, 135);
		bodyPanel1.add(btnFat);
		btnFat.setBorderPainted(false);
		btnFat.setContentAreaFilled(false);

		//근육 버튼
		btnMuscle.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/muscle.jpg")));
		btnMuscle.setBounds(33, 327,  135, 135);
		bodyPanel1.add(btnMuscle);
		btnMuscle.setBorderPainted(false);
		btnMuscle.setContentAreaFilled(false);

		//평균몸 버튼
		btnAvr1.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/avgW.jpg")));
		btnAvr1.setBounds(180, 327, 135, 135);
		bodyPanel1.add(btnAvr1);
		btnAvr1.setBorderPainted(false);
		btnAvr1.setContentAreaFilled(false);
		
		
		bodylabel1.setFont(new Font("Rix장미의유혹Basic Regular", Font.ITALIC, 25));
		bodylabel1.setHorizontalAlignment(SwingConstants.CENTER);
		bodylabel1.setBounds(45, 40, 274, 32);
		bodyPanel1.add(bodylabel1);

		btnThin.addActionListener(this);
		btnFat.addActionListener(this);
		btnMuscle.addActionListener(this);
		btnAvr1.addActionListener(this);

		
		//뒤로가기
		backBtn.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn.setBounds(12, 29, 30, 50);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.addActionListener(this);
		bodyPanel1.add(backBtn);

		bodyFrame.getContentPane().add(bodyPanel1);
		bodyFrame.setVisible(true);

		
		// longbtn
		btnLong.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/long.jpg")));
		btnLong.setBounds(33, 181, 135, 135);
		bodyPanel2.add(btnLong);
		btnLong.setBorderPainted(false);
		btnLong.setContentAreaFilled(false);

		
		//shortbtn
		btnShort.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/short.jpg")));
		btnShort.setBounds(180, 181, 135, 135);
		bodyPanel2.add(btnShort);
		btnShort.setBorderPainted(false);
		btnShort.setContentAreaFilled(false);

		
		//평균키
		btnAvr2.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/avgT.jpg")));
		btnAvr2.setBounds(106, 327, 135, 135);
		bodyPanel2.add(btnAvr2);
		btnAvr2.setBorderPainted(false);
		btnAvr2.setContentAreaFilled(false);

		bodyLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		bodyLabel2.setFont(new Font("Rix장미의유혹Basic Regular", Font.ITALIC, 25));
		bodyLabel2.setBounds(45, 40, 274, 32);
		bodyPanel2.add(bodyLabel2);
		
		btnLong.addActionListener(this);
		btnShort.addActionListener(this);
		btnAvr2.addActionListener(this);

		backBtn2.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn2.setBounds(12, 29, 30, 50);
		backBtn2.setBorderPainted(false);
		backBtn2.setContentAreaFilled(false);
		backBtn2.addActionListener(this);
		bodyPanel2.add(backBtn2);
		
		bodyFrame2.getContentPane().add(bodyPanel2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == btnThin) {
			thin = true;
			bodyFrame.setVisible(false);
			bodyFrame2.setVisible(true);
		} else if (e.getSource() == btnFat) {
			fat = true;
			bodyFrame.setVisible(false);
			bodyFrame2.setVisible(true);
		} else if (e.getSource() == btnMuscle) {
			muscle = true;
			bodyFrame.setVisible(false);
			bodyFrame2.setVisible(true);
		} else if (e.getSource() == btnAvr1) {
			avr = true;
			bodyFrame.setVisible(false);
			bodyFrame2.setVisible(true);
		} else if (e.getSource() == backBtn) {
			bodyFrame.setVisible(false);
			new ConceptSelection();
		} else if (e.getSource() == btnLong) {
			bodyFrame2.setVisible(false);
			if (thin == true) {
				thin = false;
				new LongType(0);
			} else if (fat == true) {
				fat = false;
				new LongType(1);
			} else if (muscle == true) {
				muscle = false;
				new LongType(2);
			} else if (avr == true) {
				avr = false;
				new LongType(3);
			}
		} else if (e.getSource() == btnShort) {
			bodyFrame2.setVisible(false);
			if (thin == true) {
				thin = false;
				new ShortType(0);
			} else if (fat == true) {
				fat = false;
				new ShortType(1);
			} else if (muscle == true) {
				muscle = false;
				new ShortType(2);
			} else if (avr == true) {
				avr = false;
				new ShortType(3);
			}
		} else if (e.getSource() == btnAvr2) {
			bodyFrame2.setVisible(false);
			if (thin == true) {
				thin = false;
				new AvrType(0);
			} else if (fat == true) {
				fat = false;
				new AvrType(1);
			} else if (muscle == true) {
				muscle = false;
				new AvrType(2);
			} else if (avr == true) {
				avr = false;
				new AvrType(3);
			}
		} else if(e.getSource() == backBtn2) {
			bodyFrame2.setVisible(false);
			new BodyType();
		}
	}
}
