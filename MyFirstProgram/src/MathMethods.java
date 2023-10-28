
public class MathMethods {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println(z);
		
		double a = Math.min(x, y);
		System.out.println(a);
		
		double b = Math.abs(y);
		System.out.println(b);
		
		double c = Math.sqrt(x);
		System.out.println(c);
		
		double d = Math.round(x);
		System.out.println(d);
		
		double e = Math.ceil(x);
		System.out.println(e);
		
		double f = Math.floor(x);
		System.out.println(f);
	}
}
