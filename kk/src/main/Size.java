package main;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Size {
	JButton medium=new JButton();
	JButton large=new JButton();
	JButton xLarge=new JButton();
	JButton other =new JButton();
	
	JButton medium2=new JButton();
	JButton large2=new JButton();
	JButton xLarge2=new JButton();
	JButton other2 =new JButton();
	
	JButton medium3=new JButton();
	JButton large3=new JButton();
	JButton xLarge3=new JButton();
	JButton other3 =new JButton();
	
	JPanel up=new JPanel();
	JPanel down=new JPanel();
	JPanel out=new JPanel();

	public Size() {
		medium.setBounds(20,450,50,50);
		large.setBounds(100,450,50,50);
		xLarge.setBounds(180,450,50,50);
		other.setBounds(260,450,50,50);
		
		medium2.setBounds(20,450,50,50);
		large2.setBounds(100,450,50,50);
		xLarge2.setBounds(180,450,50,50);
		other2.setBounds(260,450,50,50);
		
		up.add(medium);
		up.add(large);
		up.add(xLarge);
		up.add(other);
		up.setBackground(Color.WHITE);
		up.setLayout(null);
	
		down.add(medium2);
		down.add(large2);
		down.add(xLarge2);
		down.add(other2);
		down.setBackground(Color.WHITE);
		down.setLayout(null);
		

		out.add(medium3);
		out.add(large3);
		out.add(xLarge3);
		out.add(other3);
		
		out.setBackground(Color.WHITE);
		out.setLayout(null);
	}
}
