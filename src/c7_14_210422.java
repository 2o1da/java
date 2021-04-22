abstract class Unit2 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춤");
	}
}

// public abstract 생략
interface Fightable2 {
	void move(int x, int y);

	void attack(Fightable2 f);
}

class Fighter extends Unit2 implements Fightable2 {
	// 오버라이딩 규칙:조상보다 접근 제어자(public) 가 좁으면 안됨
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "] 이동");
	}

	public void attack(Fightable2 f) {
		System.out.println(f + " 공격");
	}

	// 인터페이스 Fightable2 구현한 Fighter 객체 반환
	Fightable2 getFightable() {
//		Fighter f = (Fightable2) new Fighter();
//		return f;

		return new Fighter(); // (Fightable2) 생략
	}
}

public class c7_14_210422 {
	public static void main(String[] args) {
		// 조상 클래스, 인터페이스의 참조변수가 자손 객체 가리킴 (다형성)
		Unit2 u = new Fighter();
		Fightable2 f = new Fighter(); // Fightable 리모콘만 사용 가능
		Fighter f2 = new Fighter();

//		u.attack(); // Unit2에 attack() 없어서 호출 불가
//		f.stop(); // Fightable2에 stop() 없어서 호출 불가

		Fightable2 f3 = f2.getFightable();
		
	}

}
