class Product {
	int price, bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100); // ���� �������� �Ű�����
	}
	
	public String toString() {return "TV";}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}
	
	public String toString() {return "COMPUTER";}
}

class Buyer { 
	int money = 1000;
	int bonusPoint = 0;

	// ������
	// Product p1 = new Tv();
	// Product p2 = new Computer();
	// Product p3 = new Audio();
	void buy(Product p) { // ������ �Ű�����
		if (money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " ���� �Ϸ�"); // p == p.toString()
	}
}

public class c7_9_210414 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv2());
		b.buy(new Computer());

		System.out.println("���� ��:" + b.money);
		System.out.println("���ʽ� ����:" + b.bonusPoint);
	}

}
