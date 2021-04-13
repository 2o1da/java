
public class c6_5_210413 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();

		System.out.println(mm.add(3, 3)); // 매개변수가 모두 int형인 함수가 없으면 ambiguous 에러 발생
		System.out.println(mm.add(3L, 3));
		System.out.println(mm.add(3, 3L));
		System.out.println(mm.add(3L, 3L));

		int[] a = { 100, 200, 300 };
		System.out.println(mm.add(a));
	}
}

class MyMath3 {
	
	int add(int a, int b) {
		return a + b;
	}
	
	long add(int a, long b) {
		return a + b;
	}
	
	long add(long a, int b) {
		return a + b;
	}

	long add(long x, long y) {
		return x + y;
	}

	int add(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
