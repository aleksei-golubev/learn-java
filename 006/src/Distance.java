public class Distance {
	private static final Distance instance = new Distance();
	
	private Distance() {}
	
	public static Distance getInstance() {
		return instance;
	}
	
	public static double getDistance(Point a, Point b) {
		return Math.sqrt(
			Math.pow(a.getX() - b.getX(), 2) +
			Math.pow(a.getY() - b.getY(), 2)
		);
	}
	
	public static void print(Point a, Point b) {
		System.out.print(getDistance(a, b));
	}
}