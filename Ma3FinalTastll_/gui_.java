package Ma3FinalTask_II;

import java.awt.*;
import javax.swing.*;

public class GUI {
	
	JFrame frame;
	JRadioButton rb1, rb2, rb3;
	JLabel label1, label2;
	JTextField field1;
	JPasswordField password1;
	JButton button1, button2;
	JComboBox<String> box1;
	
	public void frame() {
		frame = new JFrame();
		
		Container content = frame.getContentPane();
		content.setLayout(new FlowLayout(FlowLayout.CENTER));
		content.setBackground(Color.DARK_GRAY);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(label1);
		frame.add(field1);
		frame.add(password1);
		frame.add(label2);
		frame.add(button1);
		frame.add(button2);
		frame.add(box1);
		
		frame.setVisible(true);

	}
	
	
	public void comboBox() {
		String[] arr = {"BSIT", "BSEMC", "MSIT"};
		box1 = new JComboBox<String>(arr);
	}
	
	public void buttons() {
		button1 = new JButton("Red Team");
		button1.setPreferredSize(new Dimension(100, 50));
		button1.setBackground(Color.red);
		button1.setForeground(Color.white);
		
		button2 = new JButton("Blue Team");
		button2.setPreferredSize(new Dimension(100, 50));
		button2.setBackground(Color.blue);
		button2.setForeground(Color.white);
		
	}
	
	public void labels() {
		label1 = new JLabel("Hello GUI");
		label1.setForeground(Color.white);
		
		label2 = new JLabel("This is a java Swing Program");
		label2.setForeground(Color.white);
	}
	
	public void textField() {
		field1 = new JTextField();
		field1.setPreferredSize(new Dimension(60, 20));
	}
	
	public void passwordField() {
		password1 = new JPasswordField();
		password1.setPreferredSize(new Dimension(60, 20));
	}
	
	public void radioButtons() {
		rb1 = new JRadioButton("BSIT");
		rb1.setBackground(Color.DARK_GRAY);
		rb1.setForeground(Color.white);
		
		rb2 = new JRadioButton("BSEMC");
		rb2.setBackground(Color.DARK_GRAY);
		rb2.setForeground(Color.white);
		
		rb3 = new JRadioButton("MSIT");
		rb3.setBackground(Color.DARK_GRAY);
		rb3.setForeground(Color.white);
	}
}
