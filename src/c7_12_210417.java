// ����� ��ġ������ ������ �ٸ�
abstract class Unit {
	// ���� Ŭ������ ���� �κ� ����
	int x, y;

	abstract void move(int x, int y); // Ŭ������ ���� �ٸ��� �����ؾ� �Ѵ�

	void stop() {
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("�غ�:" + x + ", " + y);
	}

	void stimPack() {

	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("��ũ:" + x + ", " + y);
	}

	void changeMode() {

	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("�����:" + x + ", " + y);

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
		Unit[] group = { new Marine(), new Tank(), new Dropship() }; // �迭 ������ �ʱ�ȭ �ѹ��� ��

		Object[] group2 = new Object[3];
//		group2[0].move(100,200); // ERROR:Marine ��ü�� move�� ������ Object �������� move�� ���� ����

		for (int i = 0; i < group.length; i++) {
			// ��������.��ü �޼���
			group[i].move(100, 200); // Unit Ŭ���� �������� �߻� �޼��� �־ ����
		}
	}
}
