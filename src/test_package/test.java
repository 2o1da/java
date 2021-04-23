package test_package;

import java.awt.dnd.DropTargetContext;

class P {
	int x = 10;

	int getP() {
		return 100;
	}
}

class C extends P {
	int y = 20;

	int z = getP();

	int getC() {
		x = 30;
		return 200;
	}
}

public class test {

	public static void main(String[] args) {
		P p1 = new P();
		P p2 = new C(); // 다형성
//		C c1 = new P();
		C c2 = new C();

		System.out.println(c2.x);
		System.out.println(c2.getP());

		P p3 = p2;
		P p4 = (P) c2; // 형변환 생략 가능
		// C c3 = (C) p1;
		C c4 = (C) p2; // 형변환 생략 불가

		System.out.println();
		System.out.println(p3.x);
		System.out.println(p4.x);
		System.out.println(c4.y);
		System.out.println(c4.getC());
		System.out.println(c4.x);
		System.out.println(c4.z);
		// 리모콘 버튼이 더 많으면 에러

	}

}