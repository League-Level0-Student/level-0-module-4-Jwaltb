package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomPractice {
public static void main(String[] args) {
	Random randy = new Random();
	int num = randy.nextInt(101);
	int x = randy.nextInt(279);
	int y = randy.nextInt(76)+50;
	int z = randy.nextInt(225)+172;
	JOptionPane.showMessageDialog(null, "The numbers are " + num + ", " + x + ", " + y + ", " + z + "!");
}
}
