class MyMath2 {
	long a, b; // iv

	long add() { // �ν��Ͻ� �޼���
		return a + b;
	}

	static long add2(long a, long b) { // static(Ŭ����) �޼���, lv(��������)
		return a + b; // lv
	}
}

public class c6_4_210413 {
	public static void main(String[] args) {
		// ��ü ���� ���� ȣ�� ����
		System.out.println(MyMath2.add2(200L, 300L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 150L;
		mm.b = 250L;

		// ��ü ���� �� ȣ�� ���� 
		System.out.println(mm.add());
	}
}
