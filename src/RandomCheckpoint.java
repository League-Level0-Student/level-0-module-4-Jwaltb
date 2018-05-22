import java.util.Random;

public class RandomCheckpoint {
	public static void main(String[] args) {
		Random randy = new Random();
		int x = randy.nextInt(1001);
		int y = randy.nextInt(901);
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(x-y);
	}

}
