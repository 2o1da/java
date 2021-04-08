
public class c5_210408 {

	public static void main(String[] args) {

		// 배열 : 같은 타입의 여러 변수를 하나로 묶음
		int[] score = new int[5]; // int값 5개의 저장공간 갖는 참조변수 선언
		score[3] = 100;

		System.out.println(score[0]); // 초기화하지 않으면 0으로 출력
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		// 참조변수가 배열을 가리킴
		String name[]; // 참조변수 선언
		name = new String[5]; // 주소값을 참조변수에 할당, 실제 저장공간 생성
	}
}
