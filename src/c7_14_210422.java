abstract class Unit2 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("����");
	}
}

// public abstract ����
interface Fightable2 {
	void move(int x, int y);

	void attack(Fightable2 f);
}

class Fighter extends Unit2 implements Fightable2 {
	// �������̵� ��Ģ:���󺸴� ���� ������(public) �� ������ �ȵ�
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "] �̵�");
	}

	public void attack(Fightable2 f) {
		System.out.println(f + " ����");
	}

	// �������̽� Fightable2 ������ Fighter ��ü ��ȯ
	Fightable2 getFightable() {
//		Fighter f = (Fightable2) new Fighter();
//		return f;

		return new Fighter(); // (Fightable2) ����
	}
}

public class c7_14_210422 {
	public static void main(String[] args) {
		// ���� Ŭ����, �������̽��� ���������� �ڼ� ��ü ����Ŵ (������)
		Unit2 u = new Fighter();
		Fightable2 f = new Fighter(); // Fightable �����ܸ� ��� ����
		Fighter f2 = new Fighter();

//		u.attack(); // Unit2�� attack() ��� ȣ�� �Ұ�
//		f.stop(); // Fightable2�� stop() ��� ȣ�� �Ұ�

		Fightable2 f3 = f2.getFightable();
		
	}

}
