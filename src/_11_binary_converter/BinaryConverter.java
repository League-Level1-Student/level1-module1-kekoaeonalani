package _11_binary_converter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField answer = new JTextField(20);
	
	void addBox(){
		frame.add(panel);
		panel.add(answer);
	}
	
	
	
}
