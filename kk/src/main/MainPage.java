package main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {
	public static void main(String[] args) {
		
		main.Main main = new Main();
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setBounds(100, 100, 360, 625);
		main.setVisible(true);
	}
}

class Main extends JFrame implements ActionListener {
	JScrollPane scrollPane;
	ImageIcon icon;
	JButton mBtn = new JButton("");
	
	//폰트 전역 지정 함수
	public void setUIFont(javax.swing.plaf.FontUIResource f) {
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put(key, f);
		}
	}

	public Main() {
		setUIFont (new javax.swing.plaf.FontUIResource("Rix장미의유혹Basic Regular", Font.PLAIN, 12));
		
	    icon = new ImageIcon(MainPage.class.getResource("/Photos/mainBackG.jpg"));
	    
	    //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
        
        background.setLayout(null);
        mBtn.setBorderPainted(false);
		mBtn.setContentAreaFilled(false);
        mBtn.setIcon(new ImageIcon(MainPage.class.getResource("/Photos/mainBtn.png")));
        mBtn.setBounds(50, 350, 250, 250);
        mBtn.addActionListener(this);
        background.add(mBtn);
        
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		if (e.getSource() == mBtn) {
			setVisible(false);
			new SeasonSelection();
		}
	}
}
