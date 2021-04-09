import java.util.Arrays;

public class c5_1_210409 {

	public static void main(String[] args) {

		int[] mArr = new int[5];
		System.out.println(mArr.length); // �迭�� ����

		for (int i = 0; i < mArr.length; i++) { // �ε��� ���� ����
			System.out.println(mArr[i]);
		}

		// �迭�� �ʱ�ȭ
		// int ���� ��� 0���� �ڵ� �ʱ�ȭ
		// int[] score = new int[] { 50, 60, 70, 80, 90 };
		int[] score = { 50, 60, 70, 80, 90 };

		System.out.println(score); // [I@53bd815b�� ���ڿ� ��� ([:�迭, I:����, �ּҰ�)
		System.out.println(Arrays.toString(score)); // �迭 ���

		int[] score2;
		// score2 = {70,80,80}; // ERROR
		score2 = new int[] { 70, 80, 90 }; // new int[] ������ �� ����

		char[] chArr = { 'a', 'b', 'C' };
		System.out.println(chArr); // char �迭�� ���� ���Ұ� ���

		// �ִ밪�� �ּҰ�
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

		// ����
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0 <= n < 10, 0~9

			int tmp = numArr[0]; // �迭 ù��° ���ҿ� ��� �ٲ�
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
			j = (int) (Math.random() * 45); // 0~44, �迭�� ���̰� 45�̹Ƿ� *45

			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		System.out.println(Arrays.toString(ball));

		// String �迭
//		String[] name = new String[3]; // �⺻���� �ƴ� �������� �⺻��:null
//		name = new String[] { "Kim", "Da", "Sol" };

		String[] name = new String[] { "Kim", "Da", "Sol" };

		String[] strArr = { "����", "����", "��" };
		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3); // 0~2
			System.out.println(strArr[num]);
		}
	}
}
