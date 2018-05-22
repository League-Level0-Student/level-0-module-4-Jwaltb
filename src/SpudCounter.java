import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			if (i == 8) {
				JOptionPane.showMessageDialog(null, "more");

			}
			else if(i == 4) {
				JOptionPane.showMessageDialog(null, i);
			}
			else {
				JOptionPane.showMessageDialog(null, +i+ " potato");
			}

		}
	}

}
