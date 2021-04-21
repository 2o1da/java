// public static final, public abstract
interface PlayingCard {
	// ���
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;

	// �߻� �޼���
	public abstract String getCardNumber();

	String getCardKind();
}

// ���� ��� ����, �������̽��� ��� ����
interface Fightable extends Movable, Attackable {
	// ��� �޾Ƽ� ��� �� 2��
}

interface Movable {
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

// Fighter Ŭ������ Fightable �������̽� ����
// extends �߻� Ŭ����
class Fighter implements Fightable {
	public void move(int a, int b) {
	}

	public void attack(Unit u) {
	}
}

// �Ϻθ� �����ϴ� ��� abstract �ٿ��� ��
abstract class Fighter2 implements Fightable {
	public void move(int a, int b) {
	}
	// public abstract void attack(Unit u);
}

public class c7_13_210421 {
	public static void main(String[] args) {

	}
}
