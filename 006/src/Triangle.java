public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point initA, Point initB, Point initC) {
		a = initA;
		b = initB;
		c = initC;
	}
	
	public void setA(Point newA) {
		a = newA;
	}
	
	public Point getA() {
		return a;
	}
	
	public void setB(Point newB) {
		b = newB;
	}
	
	public Point getB() {
		return b;
	}
	
	public void setC(Point newC) {
		c = newC;
	}
	
	public Point getC() {
		return c;
	}
	
	public double getPerimeter() {
		return getAB() + getBC() + getAC();
	}
	
	public double getAB() {
		return Distance.getDistance(a, b);
	}
	
	public double getBC() {
		return Distance.getDistance(b, c);
	}
	
	public double getAC() {
		return Distance.getDistance(a, c);
	}
	
	public double getArea() {
		return Math.sqrt(
			(getPerimeter() / 2) * (getPerimeter() / 2 - getAB()) * (getPerimeter() / 2 - getBC()) * (getPerimeter() / 2 - getAC())
		);
	}
	
	public void print() {
		System.out.print("[");
		a.print();
		System.out.print(" - ");
		b.print();
		System.out.print(" - ");
		c.print();
		System.out.print("]");
	}
}