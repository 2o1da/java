// public static final, public abstract
interface PlayingCard {
	// 상수
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;

	// 추상 메서드
	public abstract String getCardNumber();

	String getCardKind();
}

// 다중 상속 가능, 인터페이스만 상속 가능
interface Fightable extends Movable, Attackable {
	// 상속 받아서 멤버 총 2개
}

interface Movable {
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

// Fighter 클래스는 Fightable 인터페이스 구현
// extends 추상 클래스
class Fighter implements Fightable {
	public void move(int a, int b) {
	}

	public void attack(Unit u) {
	}
}

// 일부만 구현하는 경우 abstract 붙여야 함
abstract class Fighter2 implements Fightable {
	public void move(int a, int b) {
	}
	// public abstract void attack(Unit u);
}

public class c7_13_210421 {
	public static void main(String[] args) {

	}
}
