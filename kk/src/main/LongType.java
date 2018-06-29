package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class LongType extends JPanel implements ActionListener {
	JFrame longFrame = new JFrame();
	JPanel longPanel = new JPanel();

	
	
	JButton upBtn = new JButton("상의");
	JButton downBtn = new JButton("하의");
	JButton outBtn = new JButton("아우터");
	JButton otherBtn = new JButton("배경");
	JButton backBtn = new JButton();
	Image fatImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image thinImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image muscleImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image avrImage = new ImageIcon("./src/image/cloud.jpg").getImage();	
	JLabel lblNewLabel;
	Size m_Size = new Size();
	int typeNum;
	File[] list;
	File path;


	public LongType(int type) {
		typeNum = type;

		ImageSave();
		longFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		longFrame.setBounds(100, 100, 362, 625);
		longFrame.getContentPane().setLayout(null);
		longPanel.setBackground(Color.WHITE);
		longPanel.setLayout(null);

		longPanel.setBackground(Color.WHITE);
		longPanel.setLayout(null);
		/////////////////////
		upBtn.setBounds(20, 510, 70, 70);
		
		upBtn.setBorderPainted(false);
		upBtn.setContentAreaFilled(false);

		downBtn.setBounds(100, 510, 70, 70);
		
		downBtn.setBorderPainted(false);
		downBtn.setContentAreaFilled(false);

		outBtn.setBounds(180, 510, 70, 70);
		
		outBtn.setBorderPainted(false);
		outBtn.setContentAreaFilled(false);

		otherBtn.setBounds(260, 510, 70, 70);
		otherBtn.setBorderPainted(false);
		otherBtn.setContentAreaFilled(false);

		
		backBtn.setBounds(30, 50, 20, 40);
		backBtn.addActionListener(this);
		
		
		longFrame.getContentPane().add(otherBtn);
		longFrame.getContentPane().add(outBtn);
		longFrame.getContentPane().add(upBtn);
		longFrame.getContentPane().add(downBtn);
		
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		outBtn.addActionListener(this);
		otherBtn.addActionListener(this);
	
		//몸체 이미지 출력
		
		Render();
		longFrame.getContentPane().add(lblNewLabel);
	
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


			
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == backBtn) {
			longFrame.setVisible(false);
			new BodyType();
		}
		if(e.getSource()== upBtn)
		{
			longFrame.getContentPane().add(m_Size.xLarge);
			longFrame.getContentPane().add(m_Size.medium);
			longFrame.getContentPane().add(m_Size.large);
			longFrame.getContentPane().add(m_Size.other);
			longFrame.setVisible(true);
		}
		if(e.getSource()== downBtn)
		{
			
			m_Size.xLarge.setVisible(true);
			m_Size.medium2.setVisible(true);
			m_Size.large2.setVisible(true);
			m_Size.other2.setVisible(true);
			longFrame.getContentPane().add(m_Size.xLarge2);
			longFrame.getContentPane().add(m_Size.medium2);
			longFrame.getContentPane().add(m_Size.large2);
			longFrame.getContentPane().add(m_Size.other2);
			longFrame.setVisible(true);
			
		}
		if(e.getSource()== outBtn)
		{
			longFrame.getContentPane().add(m_Size.medium3);
			longFrame.getContentPane().add(m_Size.large3);
			longFrame.getContentPane().add(m_Size.xLarge3);
			longFrame.getContentPane().add(m_Size.other3);
			longFrame.setVisible(true);
		}
		
	}
	void ImageSave()
	{
		path = new File("./image//Style//");//경로 설정 필요
		list = path.listFiles();
	}
	public void Render()
	{
		ImageIcon img = new ImageIcon("./image//Style//"+ list[21].getName());

		lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(14, 21, 319, 394);
	}
	
}
