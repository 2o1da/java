class Data3 {
	int x;
}

public class c6_3_210413 {

	public static void main(String[] args) {
		Data3 m_d = new Data3();
		m_d.x = 10;

		Data3 m_d2 = copy(m_d);
		// c6_3_210413 c = new c6_3_210413();
		// c.copy()라고 할 필요 없는 이유는 같은 class 안에 있기 때문
		
		
		System.out.println("m_d.x=" + m_d.x);
		System.out.println("m_d2.x=" + m_d2.x);
	}

	// static은 객체 생성 없이 호출 가능
	static Data3 copy(Data3 d) { //참조형 매개변수와 반환타입
		Data3 tmp = new Data3(); // 새로운 객체 생성 
		tmp.x = d.x; // 복사

		return tmp; // 객체의 주소 봔환
	}
}
