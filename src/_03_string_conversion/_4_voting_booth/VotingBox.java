package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBox {
public static void main(String[] args) {
	String ageAsString = JOptionPane.showInputDialog("How many years old are you?");
	int ageAsInt = Integer.parseInt(ageAsString);
	if (ageAsInt >= 18) {
		JOptionPane.showInputDialog("Who should be the next president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "nobody cares what you think");
	}
}
}
