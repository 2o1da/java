import java.util.Arrays;

public class c5_1_210409 {

	public static void main(String[] args) {

		int[] mArr = new int[5];
		System.out.println(mArr.length); // 배열의 길이

		for (int i = 0; i < mArr.length; i++) { // 인덱스 범위 주의
			System.out.println(mArr[i]);
		}

		// 배열의 초기화
		// int 같은 경우 0으로 자동 초기화
		// int[] score = new int[] { 50, 60, 70, 80, 90 };
		int[] score = { 50, 60, 70, 80, 90 };

		System.out.println(score); // [I@53bd815b의 문자열 출력 ([:배열, I:정수, 주소값)
		System.out.println(Arrays.toString(score)); // 배열 출력

		int[] score2;
		// score2 = {70,80,80}; // ERROR
		score2 = new int[] { 70, 80, 90 }; // new int[] 생략할 수 없음

		char[] chArr = { 'a', 'b', 'C' };
		System.out.println(chArr); // char 배열일 때만 원소값 출력

		// 최대값과 최소값
		int max = score[0];
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		// 섞기
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0 <= n < 10, 0~9

			int tmp = numArr[0]; // 배열 첫번째 원소와 계속 바꿈
			// int tmp = numArr[i];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));

		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int temp = 0, j = 0;
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44, 배열의 길이가 45이므로 *45

			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		System.out.println(Arrays.toString(ball));

		// String 배열
//		String[] name = new String[3]; // 기본형이 아닌 참조형의 기본값:null
//		name = new String[] { "Kim", "Da", "Sol" };

		String[] name = new String[] { "Kim", "Da", "Sol" };

		String[] strArr = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3); // 0~2
			System.out.println(strArr[num]);
		}
	}
}
