public class TriangleMath {
	public static void main(String args[]) {
		Point a = new Point(3.0, 0.0);
		Point b = new Point(0.0, 4.0);
		Point c = new Point(0.0, 0.0);
		Triangle t = new Triangle(a, b, c);
		
		pstr(" Our triangle is: ");
		t.print();
		pstr("\n");
		pstr("\tAB = " + t.getAB() + "\n");
		pstr("\tBC = " + t.getBC() + "\n");
		pstr("\tAC = " + t.getAC() + "\n");
		pstr("\tS  = " + t.getArea() + "\n");
		pstr("\tP  = " + t.getPerimeter() + "\n");
	}
	
	private static void pstr(String str) {
		System.out.print(str);
	}
}