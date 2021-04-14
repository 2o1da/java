class Product {
	int price, bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100); // 조상 생성자의 매개변수
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

	// 다형성
	// Product p1 = new Tv();
	// Product p2 = new Computer();
	// Product p3 = new Audio();
	void buy(Product p) { // 다형적 매개변수
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 구매 완료"); // p == p.toString()
	}
}

public class c7_9_210414 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv2());
		b.buy(new Computer());

		System.out.println("남은 돈:" + b.money);
		System.out.println("보너스 점수:" + b.bonusPoint);
	}

}
