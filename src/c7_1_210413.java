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
	// Ŭ���� ����� �������� ����
	Point p;// = new Point(); // Circle2�� Point�� ����(composite)
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
		
		System.out.println(c.toString()); // Point Ŭ������ Object Ŭ������ ��� �ް� �ֱ� ����
		System.out.println(c);
	}
}
