import java.util.Scanner;

class InitTest {
	int x; // iv
	int y = x; // iv

	void method1() {
		int i;
		int j = i; // ERROR:lv를 초기화하지 않고 사용
	}
}

class StaticBlockTest {
	static int[] arr = new int[10]; // 명시적 초기화

	static {
		for (int i = 0; i < arr.length; i++) { // 복잡 초기화
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}
}

public class c6_8_210413 {

	public static void main(String[] args) {

	}

}
