
public class c3_210408 {
	// ������(Operator)
	public static void main(String[] args) {

		int i = -10;
		i = -i; // �ǿ������� ��ȣ�� �ݴ�κ���
		System.out.println(i);

		// ����ȯ
		double d = 85.4;
		int score = (int) d;
		System.out.println(score); // 85

		// �����ڵ� ����ǥ
		System.out.println((char) 65); // 'A'
		System.out.println((int) 'a'); // 97

		System.out.println((int) 1.6f); // 1, �ݿø� ���� ����

		float f = 1234; // (float)1234 ��� �����Ϸ��� �ڵ� ����ȯ ����, ����ȯ ���� ����

		int i2 = (int) 3.14f; // OK, ����ȯ ���� �Ұ�

		int i3 = 100;
//		byte b = integer; // ERROR
		byte b = (byte) i3;

		byte b2 = 100; // OK:����Ʈ ������ ���� int�� ����
//		byte b2 = 1000; // ERROR
		byte b3 = (byte) 1000; // OK:�׷��� ���ս� �߻�
		System.out.println(b3); // -24

		System.out.println('2' - '0'); // (int)'2' - (int)'0' > 50 - 48 > 2

		int x = 1_000_000;
		int y = 2_000_000;
		long z1 = x * y; // �̹� �����÷ο� �߻��� ���� ���Ե�
		System.out.println(z1);

		long z2 = (long) x * y; // 1_000_000L
		long z3 = x * (long) y;
		System.out.println(z2);
		System.out.println(z3);

		// �ݿø�:Math Ŭ����
		long result = Math.round(4.52);
		System.out.println(result); // 5, 4.52�� �Ҽ��� ù°�ڸ����� �ݿø��� ����

		double pi = 3.141592;
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi * 1000));
		System.out.println(Math.round(pi * 1000) / 1000);
		System.out.println((double) Math.round(pi * 1000) / 1000);
		System.out.println(Math.round(pi * 1000) / 1000.0);

		System.out.println((int) (pi * 1000) / 1000.0);

		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2); // T
		System.out.println(str1.equals(str2)); // T

		String str11 = new String("abc");
		String str22 = new String("abc");
		System.out.println(str11 == str22); // F
		System.out.println(str11.equals(str22)); // T

		char ch = 'a';
		System.out.println(!('a' <= ch && ch <= 'z')); // ch�� �ҹ��ڰ� �ƴϴ� (����)

		int j = 3;
		i *= 10 + j; // i = i * (10 + j);
	}

}
