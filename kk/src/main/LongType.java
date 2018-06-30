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

	
	
	JButton upBtn = new JButton("");
	JButton downBtn = new JButton("");
	JButton outBtn = new JButton("");
	JButton otherBtn = new JButton("");
	JButton backBtn = new JButton();
	Image fatImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image thinImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image muscleImage = new ImageIcon("./src/image/cloud.jpg").getImage();
	Image avrImage = new ImageIcon("./src/image/cloud.jpg").getImage();	
	JLabel lblNewLabel;
	Size m_Size = new Size();
	int typeNum;
	File[] list;
	File[] list2;
	File path2;
	int count = -1;
	File path;
	JLabel lblNewLabel_1;


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
		
		
		upBtn.setIcon(new ImageIcon(LongType.class.getResource("/Photos/up.jpg")));
		/////////////////////
		upBtn.setBounds(20, 510, 70, 70);
		
		upBtn.setBorderPainted(false);
		upBtn.setContentAreaFilled(false);

		
		downBtn.setIcon(new ImageIcon(LongType.class.getResource("/Photos/pant.jpg")));
		downBtn.setBounds(100, 510, 70, 70);
		
		downBtn.setBorderPainted(false);
		downBtn.setContentAreaFilled(false);

		outBtn.setIcon(new ImageIcon(LongType.class.getResource("/Photos/out.jpg")));
		outBtn.setBounds(180, 510, 70, 70);
		
		outBtn.setBorderPainted(false);
		outBtn.setContentAreaFilled(false);

		
		otherBtn.setIcon(new ImageIcon(LongType.class.getResource("/Photos/backG.jpg")));
		otherBtn.setBounds(260, 510, 70, 70);
		otherBtn.setBorderPainted(false);
		otherBtn.setContentAreaFilled(false);

		
		backBtn.setIcon(new ImageIcon(SeasonSelection.class.getResource("/Photos/Back.png")));
		backBtn.setBounds(30, 50, 20, 40);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.addActionListener(this);
		
		
		longFrame.getContentPane().add(otherBtn);
		longFrame.getContentPane().add(outBtn);
		longFrame.getContentPane().add(upBtn);
		longFrame.getContentPane().add(downBtn);
		longPanel.add(backBtn);
		
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		outBtn.addActionListener(this);
		otherBtn.addActionListener(this);
		m_Size.large.addActionListener(this);
		m_Size.medium.addActionListener(this);
		m_Size.xLarge2.addActionListener(this);
		m_Size.large2.addActionListener(this);
		m_Size.medium2.addActionListener(this);
		m_Size.xLarge2.addActionListener(this);

		//몸체 이미지 출력
		
		Render();

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
			
		}
		if(e.getSource()== m_Size.xLarge)
		{
			count=1;
			SelectCloth();
	
		}
		if(e.getSource()== m_Size.medium)
		{
			count=3;
			SelectCloth();
			
			
		}
		if(e.getSource()== m_Size.large)
		{
			count=5;
			SelectCloth();			
		}
		
		if(e.getSource()== downBtn)
		{
			
			longFrame.getContentPane().add(m_Size.xLarge2);
			longFrame.getContentPane().add(m_Size.medium2);
			longFrame.getContentPane().add(m_Size.large2);
			longFrame.getContentPane().add(m_Size.other2);
		}
		
		if(e.getSource()== m_Size.xLarge2)
		{
			count=0;
			SelectCloth();
			
		}
		if(e.getSource()== m_Size.medium2)
		{
			count=2;
			SelectCloth();
			
		}
		if(e.getSource()== m_Size.large2)
		{
			count=4;
			SelectCloth();
			
		}
		
		if(e.getSource()== outBtn)
		{
			
			longFrame.getContentPane().add(m_Size.medium3);
			longFrame.getContentPane().add(m_Size.large3);
			longFrame.getContentPane().add(m_Size.xLarge3);
			longFrame.getContentPane().add(m_Size.other3);
			longFrame.setVisible(true);
		}
		if(e.getSource()== m_Size.xLarge3)
		{
			
			
		}
		if(e.getSource()== m_Size.medium3)
		{
			
			
		}
		if(e.getSource()== m_Size.large3)
		{
			
			
		}
		
		
	}
	void ImageSave()
	{
		path = new File("./src//Photos//body//");//경로 설정 필요
		path2 = new File("./src//Photos//옷//");
		list = path.listFiles();
		list2 = path2.listFiles();
		
		
	}
	public void Render()
	{
		  
		ImageIcon img = new ImageIcon("./src//Photos//body//"+ list[typeNum].getName());
		
				lblNewLabel = new JLabel(img);
				lblNewLabel.setBounds(14, 21, 319, 430);
				longFrame.getContentPane().add(lblNewLabel);
	}
	void SelectCloth()
	{

		
		int n =0;
		int y =380;
		if(count>=0) {
			ImageIcon img = new ImageIcon("./src//Photos//옷//"+ list2[count].getName());
			
			if(list2[count].getName().contains("-"))
			{
				n = 20;
				y = 500;
			}
			else
			{
				n = 0;
				y = 350;
			}
		
		lblNewLabel_1= new JLabel(img);
		lblNewLabel_1.setBounds(14, n, 319,y);

		longFrame.getLayeredPane().add(lblNewLabel_1);
		count = -1;
		
		longFrame.invalidate();
		longFrame.pack();
		longFrame.setBounds(100, 100, 400, 625);
		}
	}
		
}

