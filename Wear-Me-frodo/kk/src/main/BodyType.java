package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	JButton btnThin = new JButton("멸치");
	JButton btnFat = new JButton("뚱뚱");
	JButton btnMuscle = new JButton("근육");
	JButton btnAvr1 = new JButton("니가 평균 몸매라고 생각하면 눌러");
	JButton btnLong = new JButton("긴사지");
	JButton btnShort = new JButton("짧은사지");
	JButton btnAvr2 = new JButton("니가 평균 사지라고 생각하면 눌러");
	JButton backBtn = new JButton("");

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

		// btnThin.setIcon(arg0);
		btnThin.setBounds(45, 280, 95, 95);
		bodyPanel1.add(btnThin);
		btnThin.setBorderPainted(false);
		btnThin.setContentAreaFilled(false);

		// btnFat.setIcon(arg0);
		btnFat.setBounds(221, 280, 95, 95);
		bodyPanel1.add(btnFat);
		btnFat.setBorderPainted(false);
		btnFat.setContentAreaFilled(false);

		// btnMuscle.setIcon(arg0);
		btnMuscle.setBounds(45, 441, 95, 95);
		bodyPanel1.add(btnMuscle);
		btnMuscle.setBorderPainted(false);
		btnMuscle.setContentAreaFilled(false);

		// btnAvr1.setIcon(arg0);
		btnAvr1.setBounds(221, 441, 95, 95);
		bodyPanel1.add(btnAvr1);
		btnAvr1.setBorderPainted(false);
		btnAvr1.setContentAreaFilled(false);

		bodylabel1.setHorizontalAlignment(SwingConstants.CENTER);
		bodylabel1.setBounds(60, 50, 215, 32);
		bodyPanel1.add(bodylabel1);

		btnThin.addActionListener(this);
		btnFat.addActionListener(this);
		btnMuscle.addActionListener(this);
		btnAvr1.addActionListener(this);

		backBtn.setBounds(30, 50, 20, 40);
		backBtn.addActionListener(this);
		bodyPanel1.add(backBtn);

		bodyFrame.add(bodyPanel1);
		bodyFrame.setVisible(true);

		// btnLong.setIcon(arg0);
		btnLong.setBounds(45, 280, 95, 95);
		bodyPanel2.add(btnLong);
		btnLong.setBorderPainted(false);
		btnLong.setContentAreaFilled(false);

		// btnShort.setIcon(arg0);
		btnShort.setBounds(221, 280, 95, 95);
		bodyPanel2.add(btnShort);
		btnShort.setBorderPainted(false);
		btnShort.setContentAreaFilled(false);

		// btnAvr2.setIcon(arg0);
		btnAvr2.setBounds(130, 441, 95, 95);
		bodyPanel2.add(btnAvr2);
		btnAvr2.setBorderPainted(false);
		btnAvr2.setContentAreaFilled(false);

		bodyLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		bodyLabel2.setBounds(60, 50, 215, 32);
		bodyPanel2.add(bodyLabel2);

		btnLong.addActionListener(this);
		btnShort.addActionListener(this);
		btnAvr2.addActionListener(this);

		bodyFrame2.add(bodyPanel2);
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
		}
	}
}
