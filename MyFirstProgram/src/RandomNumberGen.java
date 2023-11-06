import java.util.Random;

public class RandomNumberGen {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
		
	}
}
