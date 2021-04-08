import java.util.Scanner;

public class c4_210408 {

	public static void main(String[] args) {

		int score = 0;
		char grade = 'D';

		System.out.print("점수를 입력하세요 >> ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");

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
//		for (;;) { // 조건식이 없으면 true
//
//		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println(12345 % 10); // 5, 10으로 나머지 연산을 하면 마지막 자리 출력

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

		// 처음 한 번은 무조건 실행
		int input = 0;
		int answer = (int) (Math.random() * 100) + 1; // 1~100
		System.out.println(answer);

		Scanner scan = new Scanner(System.in);

		// 입력을 먼저 받는 경우 do-while문
		do {
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 시도해보세요");
			} else if (input < answer) {
				System.out.println("더 큰 수로 시도해보세요");
			}
		} while (input != answer);

		System.out.println("정답입니다!");

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
				continue; // 2의 배수 생략
			System.out.println(_i);
		}

		// 중첩 반복문 break
		Loop1: for (int x = 1; x < 10; x++) { // 반복문에 이름 붙임
			for (int y = i; y < 10; y++) {
				if (y == 5)
					break Loop1;
//					break; // 안의 for문만 탈출
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
				System.out.println("프로그램 종료");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다");
				continue;
			}

			Loop2:
			for (;;) {
				System.out.print("계산할 값을 입력하세요 (계산종료:0, 전체종료:99) >>");
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
					System.out.println("답=" + number * number);
					break;
				case 2:
					System.out.println("답=" + Math.sqrt(number));
					break;
				case 3:
					System.out.println("답=" + Math.log(number));
					break;
				}
			}
		}
		System.out.println("프로그램 전체 종료");
	}
}
