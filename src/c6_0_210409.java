// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
// 하나의 소스파일에는 하나의 public class만 허용
// 소스파일명은 main 메서드가 있는 class명과 일치해야 함
// Run Configuration 에서 클래스 수동 설정해서 실행할 수 있음
class c6_0_210409 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2 = t1; // 원래 t2의 객체는 GC가 처리
		
		Card c=new Card();
		c.kind="Heart";
		c.number=5;
		
//		c.width=200;
//		c.height=300;
		// cv는 참조명도 가능하지만 클래스명 권장 
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

// 클래스 영역에서는 선언문만 가능
class Variables {

	int iv; // instance variable
	static int cv; // class variable (static + iv), static 변수, 공유 변수

	void method() {
		int lv = 0; // local variable, 메서드 종료시 자동 제거
	}
}

class Card {
	// iv : 개별속성
	String kind;
	int number;

	// cv : 공통속성
	static int width = 100;
	static int height = 250;
}