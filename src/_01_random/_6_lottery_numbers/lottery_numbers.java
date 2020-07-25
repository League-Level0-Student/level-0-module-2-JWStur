package _01_random._6_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;

public class lottery_numbers {

	public static void main(String[] args) {
		Random ran = new Random();
		
		JOptionPane.showMessageDialog(null, "Lottery numbers: " + ran.nextInt(100) + ", " + ran.nextInt(100) + ", " + ran.nextInt(100) + ", " + ran.nextInt(100) + ", " + ran.nextInt(100) + ", " + ran.nextInt(100) + "."); 
		
	}
	
}
