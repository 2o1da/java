
public class p_210407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 줄바꿈 여부
		System.out.print("Hello Wolrd");
		System.out.println("Hello Wolrd");
		
		System.out.println(5%3); // 나머지
		System.out.println(5/3); // 1
		System.out.println(5/3.0); // 1.6666666666666667

//		char ch1="A"; // ERROR:" "is String
		char ch2='A';
		
		final int MAX=100; // CONSTANT
		
//		byte b=128; //ERROR:-128~127
		int i1='A'; // int > char
//		int i2=3_000_000_000; // ERROR:-20억~20억
//		int i3=3_000_000L; // ERROR:long>int
//		float f=3.14; // ERROR:float<double
		
		int oct=011; // 9
		int hex=0x11; // 17
		System.out.println(oct);
		System.out.println(hex);		
	}

}
