import java.nio.charset.spi.CharsetProvider;
import java.util.Arrays;
import java.util.Scanner;

public class c5_2_210409 {

	public static void main(String[] args) {

		System.out.println("매개 변수 개수 : " + args.length);

		// 2차원 배열 : 1차원 배열의 배열
		// 테이블 형태의 데이터 저장

		int[][] score = new int[4][3]; // 4행 3열, int 12개

		// new int[][] 생략 가능
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);

				sum += arr[i][j];
			}
		}
		System.out.println(sum);

		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.%n%n"); // %n%n 문자열로 출력됨
			}
		}

		String str = "ABCDE";
		char ch = str.charAt(3); // D
		String str2 = str.substring(1, 3); // 1~2

		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str.substring(0));

		// Arrays 클래스
		System.out.println(Arrays.deepToString(arr)); // 2차원 배열 출력
		System.out.println(Arrays.deepEquals(arr, score));

		// 배열의 복사
		int[] arr1 = { 0, 1, 2, 3, 4 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, 3);
		int[] arr4 = Arrays.copyOf(arr1, 7); // 빈 공간은 0으로 채움
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); // 2~3
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); // 빈 공간은 0으로 채움

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));

		int[] arr7 = { 3, 1, 9, 7, 5 };
		Arrays.sort(arr7); // 오름차순 정렬
		System.out.println(Arrays.toString(arr7));
		}

}