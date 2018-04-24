import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String answer;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 answer = JOptionPane.showInputDialog("What kind of pet do you want to buy?"); 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you do to make your pet happy?" , "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk", "Feed", "Play" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
//feed equals 1
//walk equals 2
//play equals 		// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	static void Walk() {
		happinessLevel += 5;
		JOptionPane.showMessageDialog(null, answer + " is hungry from the walk.");
		
	}
	static void Feed() {
		happinessLevel += 10;
		JOptionPane.showMessageDialog(null, answer + " is full.");
	}
	static void Play() {
		happinessLevel += 15;
		JOptionPane.showMessageDialog(null, answer + " is tired.");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}