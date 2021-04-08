import java.util.Scanner;

public class c4_210408 {

	public static void main(String[] args) {

		int score = 0;
		char grade = 'D';

		System.out.print("������ �Է��ϼ��� >> ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");

		// 0.0 <= Math.random() < 1.0
		System.out.println(Math.random()); // 0.0 <= x < 1.0
		System.out.println(Math.random() * 10); // 0.0 <= x < 10.0
		System.out.println((int) (Math.random() * 10)); // 0 <= x < 10
		System.out.println((int) (Math.random() * 10) + 1); // 1 <= x < 11
		System.out.println();

		for (int i = 10; i > 0; --i) {
			System.out.println(i);
		}

//		int index = 1;
//		for (;;) { // ���ǽ��� ������ true
//
//		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println(12345 % 10); // 5, 10���� ������ ������ �ϸ� ������ �ڸ� ���

		int sum = 0;
		for (int num = 12345; num > 0; num /= 10) {
			System.out.println(num + ", " + num % 10);
			sum += num % 10;
		}
		System.out.println(sum);

		int num = 12345;
		while (num > 0) {
			sum += num % 10; // 5, 4, 3, 2, 1
			num /= 10; // 1234, 123, 12, 1
		}
		System.out.println(sum);

		// ó�� �� ���� ������ ����
		int input = 0;
		int answer = (int) (Math.random() * 100) + 1; // 1~100
		System.out.println(answer);

		Scanner scan = new Scanner(System.in);

		// �Է��� ���� �޴� ��� do-while��
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� >>");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("�� ���� ���� �õ��غ�����");
			} else if (input < answer) {
				System.out.println("�� ū ���� �õ��غ�����");
			}
		} while (input != answer);

		System.out.println("�����Դϴ�!");

		int i = 0;
		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}

		while (sum <= 100) {
			++i;
			sum += i;
		}

		for (;;) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}

		for (int _i = 0; _i <= 10; _i++) {
			if (_i % 2 == 0)
				continue; // 2�� ��� ����
			System.out.println(_i);
		}

		// ��ø �ݺ��� break
		Loop1: for (int x = 1; x < 10; x++) { // �ݺ����� �̸� ����
			for (int y = i; y < 10; y++) {
				if (y == 5)
					break Loop1;
//					break; // ���� for���� Ż��
//					continue Loop1;
//					continue;
			}
		}

		int menu = 0, number = 0;

		Scanner scanner2 = new Scanner(System.in);

		outer: while (true) {
			System.out.print("(1)square\n(2)square root\n(3)log\nINPUT (Exit:0) >>");
			String tmp = scanner2.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("���α׷� ����");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�");
				continue;
			}

			Loop2:
			for (;;) {
				System.out.print("����� ���� �Է��ϼ��� (�������:0, ��ü����:99) >>");
				tmp = scanner2.nextLine();
				number = Integer.parseInt(tmp);

				switch (number) {
				case 0:
					break Loop2;
				case 99:
					break outer;
//				default:
//					break;
				}

				switch (menu) {
				case 1:
					System.out.println("��=" + number * number);
					break;
				case 2:
					System.out.println("��=" + Math.sqrt(number));
					break;
				case 3:
					System.out.println("��=" + Math.log(number));
					break;
				}
			}
		}
		System.out.println("���α׷� ��ü ����");
	}
}
