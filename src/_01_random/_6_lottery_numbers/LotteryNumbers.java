package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		String message = "Lottery Numbers, ";
		Random ran = new Random();
		for (int i = 0; i < 6; i++) {
			number = ran.nextInt(100) + 1;
			System.out.println(number);
			message = message + number;
			message = message + " ";
		}
		JOptionPane.showMessageDialog(null, message);

	}

}
