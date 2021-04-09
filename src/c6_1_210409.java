
public class c6_1_210409 {
	
	public static void main(String[] args) {
		
		System.out.println("Width:"+Card.width);
		System.out.println("Height:"+Card.height);
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		
		System.out.println(c1.width+", "+c1.height);
		System.out.println(c2.width+", "+c2.height);
		
		// 오해하기 쉽기 때문에 Card로 바꾸는 것 권장
		c1.width=300;
		c1.height=500;
		
		System.out.println(c1.width+", "+c1.height);
		System.out.println(c2.width+", "+c2.height); // c1만 재할당했으나 c2도 같이 재할당 됨
	}
}

class Card{
	String kind;
	int number;
	
	static int width=100;
	static int height=250;
}
