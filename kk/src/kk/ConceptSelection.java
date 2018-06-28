package kk;

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

public class ConceptSelection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConceptSelection frame = new ConceptSelection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConceptSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//전체 버튼
		JButton btnAll = new JButton("");
		btnAll.setIcon(new ImageIcon("C:\\Users\\BYE\\Desktop\\100예은\\사딘\\폰배경\\001.jpg"));
		btnAll.setBounds(45, 137, 95, 95);
		contentPane.add(btnAll);
		//버튼 투명화
		btnAll.setBorderPainted(false);
		btnAll.setContentAreaFilled(false);
		
		
		//데이트 버튼
		JButton btnDate = new JButton("");
		btnDate.setIcon(new ImageIcon("C:\\Users\\BYE\\Desktop\\100예은\\사딘\\폰배경\\003.jpg"));
		btnDate.setBounds(221, 137, 95, 95);
		contentPane.add(btnDate);
		btnDate.setBorderPainted(false);
		btnDate.setContentAreaFilled(false);
		
		
		//홍대 버튼
		JButton btnHongik = new JButton("New button");
		btnHongik.setBounds(45, 293, 95, 95);
		contentPane.add(btnHongik);
		btnHongik.setBorderPainted(false);
		btnHongik.setContentAreaFilled(false);
		
		
		//강남 버튼
		JButton btnGangnam = new JButton("New button");
		btnGangnam.setBounds(221, 293, 95, 95);
		contentPane.add(btnGangnam);
		btnGangnam.setBorderPainted(false);
		btnGangnam.setContentAreaFilled(false);

		
		//해커톤 버튼
		JButton btnHack = new JButton("New button");
		btnHack.setBounds(45, 454, 95, 95);
		contentPane.add(btnHack);
		btnHack.setBorderPainted(false);
		btnHack.setContentAreaFilled(false);
		
		
		//면접 버튼
		JButton btnInterv = new JButton("New button");
		btnInterv.setBounds(221, 454, 95, 95);
		contentPane.add(btnInterv);
		btnInterv.setBorderPainted(false);
		btnInterv.setContentAreaFilled(false);
		
		JLabel label = new JLabel("원하는 스타일을 선택해봐");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 50, 215, 32);
		contentPane.add(label);
		
	}
}
