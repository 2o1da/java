import java.nio.charset.spi.CharsetProvider;
import java.util.Arrays;
import java.util.Scanner;

public class c5_2_210409 {

	public static void main(String[] args) {

		System.out.println("�Ű� ���� ���� : " + args.length);

		// 2���� �迭 : 1���� �迭�� �迭
		// ���̺� ������ ������ ����

		int[][] score = new int[4][3]; // 4�� 3��, int 12��

		// new int[][] ���� ����
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);

				sum += arr[i][j];
			}
		}
		System.out.println(sum);

		String[][] words = { { "chair", "����" }, { "computer", "��ǻ��" }, { "integer", "����" } };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ " + words[i][1] + "�Դϴ�.%n%n"); // %n%n ���ڿ��� ��µ�
			}
		}

		String str = "ABCDE";
		char ch = str.charAt(3); // D
		String str2 = str.substring(1, 3); // 1~2

		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str.substring(0));

		// Arrays Ŭ����
		System.out.println(Arrays.deepToString(arr)); // 2���� �迭 ���
		System.out.println(Arrays.deepEquals(arr, score));

		// �迭�� ����
		int[] arr1 = { 0, 1, 2, 3, 4 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, 3);
		int[] arr4 = Arrays.copyOf(arr1, 7); // �� ������ 0���� ä��
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); // 2~3
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); // �� ������ 0���� ä��

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));

		int[] arr7 = { 3, 1, 9, 7, 5 };
		Arrays.sort(arr7); // �������� ����
		System.out.println(Arrays.toString(arr7));
		}

}