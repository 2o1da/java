class MyMath2 {
	long a, b; // iv

	long add() { // 인스턴스 메서드
		return a + b;
	}

	static long add2(long a, long b) { // static(클래스) 메서드, lv(지역변수)
		return a + b; // lv
	}
}

public class c6_4_210413 {
	public static void main(String[] args) {
		// 객체 생성 없이 호출 가능
		System.out.println(MyMath2.add2(200L, 300L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 150L;
		mm.b = 250L;

		// 객체 생성 후 호출 가능 
		System.out.println(mm.add());
	}
}
