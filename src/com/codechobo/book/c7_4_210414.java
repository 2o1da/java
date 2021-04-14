package com.codechobo.book; // 소스파일 첫 줄에 단 한번 선언
// practice\bin\com\codechobo\book\c7_4_210424.class
// 선언이 없으면 이름 없는(unnamed) 패키지에 속하게 된다.

import java.util.Date;

// 같은 소스파일의 클래스들은 모두 같은 패키지에 속하게 된다.
public class c7_4_210414 {
	public static void main(String[] args) {
		System.out.println("Hello Wolrd!");
	}
}

class PackageTest {

}

// import문을 쓰면 클래스에서 패키지 이름을 생락할 수 있다.
class ImportTest1 {
	java.util.Date today = new java.util.Date();
}

class ImportTest2 {
	Date today = new Date();
	
}
