public class CompareNumbers {
	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("No arguments.");
		} else if (args.length == 1) {
			Float a = Float.parseFloat(args[0]);
			
			if (a > 0) {
				System.out.println(a + " is positive.");
			} else if (a < 0) {
				System.out.println(a + " is negative.");
			} else {
				System.out.println("Zero.");
			}
		} else {
			Float a = Float.parseFloat(args[0]);
			Float b = Float.parseFloat(args[1]);
			int rv = a.compareTo(b);
			
			if (rv > 0) {
				System.out.println(a + " greater then " + b + ".");
			} else if (rv < 0) {
				System.out.println(a + " less then " + b + ".");
			} else {
				System.out.println("Equal.");
			}
		}
	}
}