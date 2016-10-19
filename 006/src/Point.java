public class Point {
	private double x;
	private double y;
	
	public Point(double initX, double initY) {
		x = initX;
		y = initY;
	}
	
	public void setX(double newX) {
		x = newX;
	}

	public double getX() {
		return x;
	}
	
	public void setY(double newY) {
		y = newY;
	}
	
	public double getY() {
		return y;
	}
	
	public void print() {
		System.out.print("(" + x + ", " + y + ")");
	}
}