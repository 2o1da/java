class AAA {
	int i = 1000;
	BBB b=new BBB();

	class BBB {
		void method() {
			System.out.println(i); // ��ü ���� �ʿ����
		}
	}
}

class CCC {

}

public class c7_16_210422 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.b.method();

	}
}
