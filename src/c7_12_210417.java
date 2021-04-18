// 선언부 일치하지만 몸통은 다름
abstract class Unit {
	// 기존 클래스의 공통 부분 추출
	int x, y;

	abstract void move(int x, int y); // 클래스에 따라 다르게 구현해야 한다

	void stop() {
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("해병:" + x + ", " + y);
	}

	void stimPack() {

	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크:" + x + ", " + y);
	}

	void changeMode() {

	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("드랍쉽:" + x + ", " + y);

	}

	void load() {
	}

	void unload() {
	}
}

public class c7_12_210417 {
	public static void main(String[] args) {
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		Unit[] group = { new Marine(), new Tank(), new Dropship() }; // 배열 생성과 초기화 한번에 함

		Object[] group2 = new Object[3];
//		group2[0].move(100,200); // ERROR:Marine 객체에 move가 있으나 Object 리모컨에 move가 없기 때문

		for (int i = 0; i < group.length; i++) {
			// 참조변수.객체 메서드
			group[i].move(100, 200); // Unit 클래스 리모컨에 추상 메서드 있어서 가능
		}
	}
}
