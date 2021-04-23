import java.util.Scanner;

class AAA {
	int i = 1000;
	BBB b = new BBB();

	class BBB {
		void method() {
			System.out.println(i); // 객체 생성 필요없음
		}
	}
}

abstract class Vehicle {
	String name;

	Vehicle() {
		System.out.println("Vehicle 기본 생성자");
	}

	Vehicle(String s) {
		name = s;
		System.out.println("Vehicle 생성자");
	}

	abstract public String getName(String s);

	public String getName() {
		return "Vehicle name:" + name;
	}
}

class CCar extends Vehicle {
	public CCar(String s) {
		super(s);
		System.out.println("CCar 생성자");
	}

	CCar() {
		super.name = "Benz";
		System.out.println("CCar 기본 생성자");
	}

	public String getName(String s) {
		return "Car name:" + s;
	}

	public String getName(byte s[]) {
		return "CCar name:" + s;
	}
}

public class c7_16_210422 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.b.method();

//		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();

		Vehicle obj = new CCar("Maseratti");
		System.out.println();
		Vehicle obj2 = new CCar();
		System.out.println();
		System.out.println(obj.getName());
		System.out.println(obj.getName("Audi"));
		System.out.println(obj2.getName());
		System.out.println(obj2.getName("KIA"));
	}
}
