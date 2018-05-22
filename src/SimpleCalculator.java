

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String one = JOptionPane.showInputDialog("Input a number");
		String two = JOptionPane.showInputDialog("Input a different number");
			int x = Integer.parseInt(one);
			int y = Integer.parseInt(two);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you wanna do with these numbers?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation ==0) {
	add(x,y);
}
else if(operation == 1) {
	subtract(x,y);
}
else if(operation == 2) {
	multiply(x,y);
}
else {
	divide(x,y);
}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int a, int b) {
int c = (a+b);
JOptionPane.showMessageDialog(null, c);
}
static void subtract(int a, int b) {
	int c = (a-b);
	JOptionPane.showMessageDialog(null, c);
}
static void multiply( int a, int b) {
	int c = (a*b);
	JOptionPane.showMessageDialog(null, c);
}
static void divide(int a , int b) {
	int c = (a/b);
	JOptionPane.showMessageDialog(null, c);
}
	// 4. Create similar methods for subtraction, multiplication and division.
	
}