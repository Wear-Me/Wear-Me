package main;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Size {
	JButton medium=new JButton();
	JButton large=new JButton();
	JButton xLarge=new JButton();
	JButton other =new JButton();
	
	JPanel up=new JPanel();
	JPanel down=new JPanel();
	JPanel out=new JPanel();

	public Size() {
		medium.setBounds(20,450,50,50);
		large.setBounds(100,450,50,50);
		xLarge.setBounds(180,450,50,50);
		other.setBounds(260,450,50,50);
		
		up.add(medium);
		up.add(large);
		up.add(xLarge);
		up.add(other);
		up.setBackground(Color.WHITE);
		up.setLayout(null);
		
		down.add(medium);
		down.add(large);
		down.add(xLarge);
		down.add(other);
		down.setBackground(Color.WHITE);
		down.setLayout(null);
		
		out.add(medium);
		out.add(large);
		out.add(xLarge);
		out.add(other);
		out.setBackground(Color.WHITE);
		out.setLayout(null);
	}
}
