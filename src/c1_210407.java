
public class c1_210407 {

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
//		long l=10_000_000_000; // ERROR:100억은 int를 넘음
		long l=10_000_000_000L;
		
		int oct=011; // 9
		int hex=0x11; // 17
		System.out.println(oct); // println()은 10진수로 출력
		System.out.println(hex);
		
		System.out.println(10.0); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
		
		String s1=new String("AB"); // 클래스
		String s2="AB";
		String s3=""; // 빈 문자열
//		char ch=''; // ERROR:빈 문자형★
		
		// 문자열 + anytype, anytype + 문자열 > 문자열
		System.out.println(""+7); // ""+"7" > "7", 숫자를 문자열로 변환
		System.out.println(""+7+7); // "7"+"7" > "77", 왼쪽부터 변환
		System.out.println(7+7+""); // "14", 왼쪽부터 변환
	}
}
