class Data1 {
	int value;
	// �����Ϸ��� �⺻ ������ �ڵ� �߰�
	// Data1() {}
}

class Data2 {
	int value;

	// �����ڰ� �ϳ��� ���� ���� �����Ϸ��� �⺻ ������ �ڵ� �߰�
	// �����ڰ� �ϳ��� �����ϱ� �⺻ ������ ���� �߰������ ��
	// Data2() {}
	Data2(int x) {
		value = x;
	}
}

public class c6_6_210413 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); // ERROR:Data2(){} �⺻ ������ ������
	}
}
