
public class IfStatement {
	public static void main(String[] args) {
		
		// If statement = Performs a block of code if it's condition evaluates to be true
		
		int age = 19;
		
		if (age >= 74) {
			System.out.println("You are an Old Man!");
		} else if (age >=18) {
			System.out.println("You are not an adult!");
		} else if (age >=13) {
			System.out.println("You are a teenager!");
		} 
		else {
			System.out.println("You are not an adult!");
		}
	}
}
