package pkg2;

import pkg1.MyParent;

// import pkg1.MyParent;

// 다른 패키지 자손 클래스
class MyChild extends pkg1.MyParent{
	public void printMembers() {
		// System.out.println(prv); // ERROR
		// System.out.println(dft); // ERROR
		System.out.println(prt);
		System.out.println(pub);
	}
}
// protected

// 다른 패키지 다른 클래스
public class c7_6_210414 {
	public static void main(String[] args) {
		MyParent mp = new MyParent();
		mp.printMembers();
		
		System.out.println();
//		System.out.println(mp.prv);
//		System.out.println(mp.dft);
//		System.out.println(mp.prt);
		System.out.println(mp.pub);
	}
}
// public