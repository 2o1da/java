package com.codechobo.book; // �ҽ����� ù �ٿ� �� �ѹ� ����
// practice\bin\com\codechobo\book\c7_4_210424.class
// ������ ������ �̸� ����(unnamed) ��Ű���� ���ϰ� �ȴ�.

import java.util.Date;

// ���� �ҽ������� Ŭ�������� ��� ���� ��Ű���� ���ϰ� �ȴ�.
public class c7_4_210414 {
	public static void main(String[] args) {
		System.out.println("Hello Wolrd!");
	}
}

class PackageTest {

}

// import���� ���� Ŭ�������� ��Ű�� �̸��� ������ �� �ִ�.
class ImportTest1 {
	java.util.Date today = new java.util.Date();
}

class ImportTest2 {
	Date today = new Date();
	
}
