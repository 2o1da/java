class Circle1 {
	int x, y, r;
}

class Point {
	int x, y;
}

class Circle extends Point {
	int r;
}

class Circle2 {
	// 클래스 멤버로 참조변수 선언
	Point p;// = new Point(); // Circle2가 Point를 포함(composite)
	int r;

	Circle2() {
		p = new Point();
	}
}

public class c7_1_210413 {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;

		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.r);

		Circle2 c2 = new Circle2();
		c2.p.x = 4;
		c2.p.y = 5;
		c2.r = 6;

		System.out.println("\n" + c2.p.x);
		System.out.println(c2.p.y);
		System.out.println(c2.r);
		
		System.out.println(c.toString()); // Point 클래스가 Object 클래스를 상속 받고 있기 때문
		System.out.println(c);
	}
}
