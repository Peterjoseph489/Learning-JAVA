
public class fibonnaci {
	public static void main(String[] args) {
		int n = 10; // Set n to the desired value
		
		if (n < 1) {
	        System.out.println("Please provide a positive whole number.");
	        return;
	    }

	    int[] sequence = new int[n];
	    sequence[0] = 0;
	    if (n >= 2) {
	        sequence[1] = 1;
	        for (int i = 2; i < n; i++) {
	            sequence[i] = sequence[i - 1] + sequence[i - 2];
	        }
	    }

	    System.out.print("Fibonacci Sequence: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(sequence[i]);
	        if (i < n - 1) {
	            System.out.print(", ");
	        }
	    }
	    System.out.println();
	}
}
