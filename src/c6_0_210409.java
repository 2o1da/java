// �ϳ��� �ҽ����Ͽ��� �ϳ��� Ŭ������ �ۼ��ϴ� ���� �ٶ���
// �ϳ��� �ҽ����Ͽ��� �ϳ��� public class�� ���
// �ҽ����ϸ��� main �޼��尡 �ִ� class��� ��ġ�ؾ� ��
// Run Configuration ���� Ŭ���� ���� �����ؼ� ������ �� ����
class c6_0_210409 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2 = t1; // ���� t2�� ��ü�� GC�� ó��
		
		Card c=new Card();
		c.kind="Heart";
		c.number=5;
		
//		c.width=200;
//		c.height=300;
		// cv�� ������ ���������� Ŭ������ ���� 
		Card.width=200;
		Card.height=300;
	}
}

class Tv {

	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

// Ŭ���� ���������� ���𹮸� ����
class Variables {

	int iv; // instance variable
	static int cv; // class variable (static + iv), static ����, ���� ����

	void method() {
		int lv = 0; // local variable, �޼��� ����� �ڵ� ����
	}
}

class Card {
	// iv : �����Ӽ�
	String kind;
	int number;

	// cv : ����Ӽ�
	static int width = 100;
	static int height = 250;
}