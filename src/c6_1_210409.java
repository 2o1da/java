
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
		
		// �����ϱ� ���� ������ Card�� �ٲٴ� �� ����
		c1.width=300;
		c1.height=500;
		
		System.out.println(c1.width+", "+c1.height);
		System.out.println(c2.width+", "+c2.height); // c1�� ���Ҵ������� c2�� ���� ���Ҵ� ��
	}
}

class Card{
	String kind;
	int number;
	
	static int width=100;
	static int height=250;
}
