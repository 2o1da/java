import java.util.*; // Scanner ����ϱ� ����
//import java.util.Scanner;

public class c2_210408 {

	public static void main(String[] args) {

		// println()�� ����
		System.out.println(10.0 / 3); // �Ǽ��� �ڸ��� �����Ұ�
		System.out.println(0x2a); // 10������ ���

		// printf()�� ������� ��������
		System.out.printf("%.2f\n", 10.0 / 3); // �Ҽ��� ��°�ڸ����� ���
		System.out.printf("%d\n", 0x2a); // 10����
		System.out.printf("%o\n", 42); // 8����
		System.out.printf("%X%n", 15); // 16����
		System.out.printf("%x%n", 15); // 16����

		System.out.printf("age:%d year:%d%n", 14, 2017); // �ٹٲ����� �ʾƼ� ���๮�� �ʿ�

		System.out.printf("%s%n", Integer.toBinaryString(15)); // 10������ 2���� ���ڿ��� ��ȯ

		// 8������ 16������ ���λ� ���̱�
		System.out.printf("%#o\n", 15); // 017
		System.out.printf("%#x\n", 15); // 0xf
		System.out.printf("%#X\n", 15); // 0XF

		// �Ǽ� ���
		float f = 123.4567890f;
		System.out.printf("%f\n", f); // ���е� 7�̹Ƿ� �տ��� ���� 7�ڸ��� ��Ȯ�ϰ� �������� �ǹ� ���� ����
		System.out.printf("%e\n", f); // �ݿø�

		// ������ ����
		System.out.printf("%g\n", 123.456789); // �Ҽ��� ���� 7�ڸ�, �ݿø�
		System.out.printf("%g\n", 0.00000000000001);

		System.out.printf("[%5d]\n", 1234567); // 5�ڸ� �ʰ��ص� �״�� ���
		System.out.printf("[%-5d]\n", 10); // ���� ����
		System.out.printf("[%05d]\n", 10); // 0���� ä��

		System.out.printf("[%.8s]\n", "www.naver.com"); // ��ü �� 8�ڸ��� �κ� ���

		Scanner scanner = new Scanner(System.in); // ���� ����� ��ü���� ��� �ݾ���� ������ ȭ�� �Է��� JVM�� �ڵ����� ��������

		int num1 = scanner.nextInt(); // ȭ�鿡�� �Է� ���� ������ num1�� ����
		int num2 = scanner.nextInt(); // ���� �Ŀ� �Է��� ���� num2�� ����

//		String input = scanner.nextLine();		
//		int num3 = Integer.parseInt(input); // input�� ������ ��ȯ, ���ڿ� ������ ����

		String str = "3";
		System.out.println("3".charAt(0) - '0'); // 3
		System.out.println('3' - '0' + 1); // 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // "3" + "1" = "
		System.out.println(3 + '0'); // 3 + 48 = 51
		System.out.println((char)(3 + '0')); // '3'
	}
}
