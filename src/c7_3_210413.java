public class c7_3_210413 {
	public static void main(String[] args) {

		Child c = new Child();
		c.method();
		
		Point3D22 p=new Point3D22(1, 2, 3);
	}

}

class Parent {
	int x = 10; // super.x
}

class Child extends Parent {
	int x = 20; // this.x

	void method() {
		System.out.println("x:" + x);
		System.out.println("this.x:" + this.x);
		System.out.println("super.x:" + super.x);
	}
}

class Parent2 {
	int x = 10; // super.x, this.x �� �� ����
}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x:" + x);
		System.out.println("this.x:" + this.x);
		System.out.println("super.x:" + super.x);
	}
}

class Point {
	int x, y;

	Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class Point3D extends Point {
	int z;

	public Point3D(int a, int b, int c) {
		// ������ �ƴ����� ����õ
		// this.x=a;
		// this.y=b;

		super(a, b);
		this.z = c;
	}
}

class Point2 { // extends Object
	int x, y;

	Point2() {
		this(0, 0); // ù �ٿ� �ݵ�� ������ ȣ��
	}

	Point2(int x, int y) {
		super(); // Object(); // ù �ٿ� �ݵ�� ������ ȣ��, �׷��� ������ �����Ϸ��� ù �ٿ� super(); ����
		this.x = x;
		this.y = y;
	}
}

class Point3D22 extends Point2 {
	int z;

	Point3D22(int x, int y, int z) {
		// super(); // Poin2t() ȣ���ϹǷ� �ڼ� Ŭ���� Point2���� �⺻ �����ڸ� �������� ������ ���� �߻�
		this.x = x;
		this.y = y;
		this.z = z;
	}
}