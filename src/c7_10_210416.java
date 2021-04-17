class Product1 {
	int price;
	int bonus;

	public Product1() {
	}

	Product1(int price) {
		this.price = price;
		bonus = (int) (price / 10.0);
	}
}

class Buyer1 {
	Product1[] cart = new Product1[10]; // 다형성:하나의 배열에 여러 종류의 객체 저장 

	int money = 1000, bonus = 0;
	int i = 0;

	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}

		money -= p.price;
		bonus += p.bonus;
		cart[i++] = p;
		System.out.println(p + "구매완료");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("총액:" + sum);
		System.out.println("구매리스트:" + itemList);
	}
}

class Tv3 extends Product1 {
	Tv3() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Pc extends Product1 {
	Pc() {
		super(80);
	}

	public String toString() {
		return "PC";
	}
}

class Audio extends Product1 {
	Audio() {
		super(200);
	}

	public String toString() {
		return "AUDIO";
	}
}

public class c7_10_210416 {
	public static void main(String[] args) {
		Buyer1 buyer1 = new Buyer1();

		buyer1.buy(new Tv3());
		buyer1.buy(new Pc());
		buyer1.buy(new Audio());
		buyer1.summary();
	}
}
