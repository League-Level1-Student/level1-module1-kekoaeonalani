package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[]args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn?");
		String cookTime = JOptionPane.showInputDialog("How many minutes?");
		Popcorn corn = new Popcorn(flavor);
		Microwave micro = new Microwave();
		micro.putInMicrowave(corn);
		int cookInt = Integer.parseInt(cookTime);
		micro.setTime(cookInt);
		micro.startMicrowave();
		
	}
	
	
	
	
}
