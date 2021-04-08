import java.util.*; // Scanner 사용하기 위함
//import java.util.Scanner;

public class c2_210408 {

	public static void main(String[] args) {

		// println()의 단점
		System.out.println(10.0 / 3); // 실수의 자리수 조절불가
		System.out.println(0x2a); // 10진수만 출력

		// printf()로 출력형식 지정가능
		System.out.printf("%.2f\n", 10.0 / 3); // 소수점 둘째자리까지 출력
		System.out.printf("%d\n", 0x2a); // 10진수
		System.out.printf("%o\n", 42); // 8진수
		System.out.printf("%X%n", 15); // 16진수
		System.out.printf("%x%n", 15); // 16진수

		System.out.printf("age:%d year:%d%n", 14, 2017); // 줄바꿈하지 않아서 개행문자 필요

		System.out.printf("%s%n", Integer.toBinaryString(15)); // 10진수를 2진수 문자열로 변환

		// 8진수와 16진수에 접두사 붙이기
		System.out.printf("%#o\n", 15); // 017
		System.out.printf("%#x\n", 15); // 0xf
		System.out.printf("%#X\n", 15); // 0XF

		// 실수 출력
		float f = 123.4567890f;
		System.out.printf("%f\n", f); // 정밀도 7이므로 앞에서 부터 7자리만 정확하고 나머지는 의미 없는 숫자
		System.out.printf("%e\n", f); // 반올림

		// 간략한 형식
		System.out.printf("%g\n", 123.456789); // 소수점 포함 7자리, 반올림
		System.out.printf("%g\n", 0.00000000000001);

		System.out.printf("[%5d]\n", 1234567); // 5자리 초과해도 그대로 출력
		System.out.printf("[%-5d]\n", 10); // 왼쪽 정렬
		System.out.printf("[%05d]\n", 10); // 0으로 채움

		System.out.printf("[%.8s]\n", "www.naver.com"); // 전체 중 8자리만 부분 출력

		Scanner scanner = new Scanner(System.in); // 원래 사용한 객체들은 모두 닫아줘야 하지만 화면 입력은 JVM이 자동으로 관리해줌

		int num1 = scanner.nextInt(); // 화면에서 입력 받은 정수를 num1에 저장
		int num2 = scanner.nextInt(); // 띄어쓰기 후에 입력한 값을 num2에 저장

//		String input = scanner.nextLine();		
//		int num3 = Integer.parseInt(input); // input을 정수로 변환, 문자열 넣으면 에러

		String str = "3";
		System.out.println("3".charAt(0) - '0'); // 3
		System.out.println('3' - '0' + 1); // 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // "3" + "1" = "
		System.out.println(3 + '0'); // 3 + 48 = 51
		System.out.println((char)(3 + '0')); // '3'
	}
}
