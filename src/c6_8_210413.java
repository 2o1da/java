import java.util.Scanner;

class InitTest {
	int x; // iv
	int y = x; // iv

	void method1() {
		int i;
		int j = i; // ERROR:lv�� �ʱ�ȭ���� �ʰ� ���
	}
}

class StaticBlockTest {
	static int[] arr = new int[10]; // ����� �ʱ�ȭ

	static {
		for (int i = 0; i < arr.length; i++) { // ���� �ʱ�ȭ
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}
}

public class c6_8_210413 {

	public static void main(String[] args) {

	}

}
