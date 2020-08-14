package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

class voting {
	public static void main(String[] args) {
		String inputAge = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(inputAge);
		
		if (age < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares about your opinion.");
		}
		else {
			JOptionPane.showInputDialog("Who do you think should be president?"); 
		}
	}
}
