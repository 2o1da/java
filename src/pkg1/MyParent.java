package pkg1; // 패키지 pkg1 폴더

public class MyParent{ // 접근 제어자 default -> public
	private 	int prv; // 같은 클래스(파일)
				int dft; // 같은 패키지(폴더)
	protected 	int prt; // 같은 패키지 + 자손(다른 클래스)
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