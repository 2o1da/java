package pkg1; // ��Ű�� pkg1 ����

public class MyParent{ // ���� ������ default -> public
	private 	int prv; // ���� Ŭ����(����)
				int dft; // ���� ��Ű��(����)
	protected 	int prt; // ���� ��Ű�� + �ڼ�(�ٸ� Ŭ����)
	public 		int pub;
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
// private

class c7_5_210414 {
	public static void main(String[] args) {
		MyParent mp = new MyParent();
		mp.printMembers();

		System.out.println();
		// System.out.println(mp.prv); // ERROR
		System.out.println(mp.dft);
		System.out.println(mp.prt);
		System.out.println(mp.pub);
	}
}
// default