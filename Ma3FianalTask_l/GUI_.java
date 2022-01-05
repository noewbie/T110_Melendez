package Ma3FinalTask_I;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI {
	JFrame frame;
	JPanel panel1;
	JTextField field1, field2, field3, field4, field5;
	JButton button;
	JLabel label1, label2;

	
	// Action Listener
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == button) {
				label2.setText(compute());
				label2.setVisible(true);
			}
		}
	};
	
	
	//Compute Average
	public String compute() {
		double arr[] = new double[5];
		String str[] = new String[5];
		double ave;
		
		arr[0] = Double.parseDouble(str[0] = field1.getText());
		arr[1] = Double.parseDouble(str[1] = field2.getText());
		arr[2] = Double.parseDouble(str[2] = field3.getText());
		arr[3] = Double.parseDouble(str[3] = field4.getText());
		arr[4] = Double.parseDouble(str[4] = field5.getText());
		
		if((arr[0] > 4 || arr[0] < 1) || (arr[1] > 4 || arr[1] < 1) || (arr[2] > 4 || arr[2] < 1)
		|| (arr[3] > 4 || arr[3] < 1) || (arr[4] > 4 || arr[4] < 1)) {
			return "Invalid Grades";
		} else {
			ave = ((arr[0] + arr[1] + arr[2] + arr[3] + arr[4]) / 5);
			return ("Grade : " + ave);
		}
		
	}
	
	
	// JFrame method
	public void frame() {
		frame = new JFrame("Hello GUI");
		
		Container content = frame.getContentPane();
		content.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		frame.add(panel1);
		
		frame.setVisible(true);
	}
	
	
	
	// JPanel method
	public void panel() {
		panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		panel1.setPreferredSize(new Dimension(200, 200));
		panel1.add(label1);
		panel1.add(field1);
		panel1.add(field2);
		panel1.add(field3);
		panel1.add(field4);
		panel1.add(field5);
		panel1.add(button);
		panel1.add(label2);
	}
	
	
	// JButton method
	public void button() {
		button =  new JButton("Average Grades");
		button.addActionListener(listener);
		button.setFocusable(false);
	}
	
	
	// JLabels method
	public void labels() {
		label1 = new JLabel("INPUT GRADES");
		
		label2 = new JLabel("[GRADES]");
		
	}
	
	
	// JTextFields method
	public void textField() {
		field1 = new JTextField();
		
		field2 = new JTextField();
		
		field3 = new JTextField();
		
		field4 = new JTextField();
		
		field5 = new JTextField();
	}
	
}
