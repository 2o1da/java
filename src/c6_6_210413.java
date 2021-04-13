class Data1 {
	int value;
	// 컴파일러가 기본 생성자 자동 추가
	// Data1() {}
}

class Data2 {
	int value;

	// 생성자가 하나도 없을 때만 컴파일러가 기본 생성자 자동 추가
	// 생성자가 하나라도 있으니까 기본 생성자 따로 추가해줘야 함
	// Data2() {}
	Data2(int x) {
		value = x;
	}
}

public class c6_6_210413 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); // ERROR:Data2(){} 기본 생성자 없으면
	}
}
