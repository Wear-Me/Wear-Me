package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InterConcept extends JFrame {
	// 21~25
	File[] list;
	File path;
	public ImageIcon img1;
	public ImageIcon img2;
	public ImageIcon img3;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public InterConcept() {
		Render();
	}

	public void Render() {
		ImageSave();

		setSize(360, 652);

		this.img1 = new ImageIcon("./image//Style//" + list[0].getName());
		this.img2 = new ImageIcon("./image//Style//" + list[1].getName());
		this.img3 = new ImageIcon("./image//Style//" + list[2].getName());

		getContentPane().setLayout(null);

		lblNewLabel = new JLabel(img1);// ����
		lblNewLabel.setBounds(148, 15, 173, 157);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel(img2);// �߰�
		label.setBounds(148, 199, 173, 157);
		getContentPane().add(label);
		String str;
		JLabel label_1 = new JLabel(img3);// �Ʒ�
		label_1.setBounds(148, 395, 173, 157);
		getContentPane().add(label_1);
		int idx = 0;
		str = list[0].getName();
		idx = str.lastIndexOf(".");

		textField = new JTextField(str);// ����
		textField.setBounds(0, 105, 130, 27);
		getContentPane().add(textField);
		textField.setColumns(10);

		str = list[1].getName();
		idx = str.lastIndexOf(".");

		textField_1 = new JTextField(str);// �߰�
		textField_1.setColumns(10);
		textField_1.setBounds(0, 223, 131, 27);
		getContentPane().add(textField_1);

		str = list[2].getName();
		idx = str.lastIndexOf(".");

		textField_2 = new JTextField(str);// �Ʒ�
		textField_2.setColumns(10);
		textField_2.setBounds(0, 329, 130, 27);
		getContentPane().add(textField_2);
		setVisible(true);
	}

	void ImageSave() {
		path = new File("./image//Style//");
		list = path.listFiles();
	}

}
