class A {
	public void method(B b) {
		b.method();
	}

	public void method2(I i) { // ★B2와 관계없어진다
		i.method();
	}
}

class B {
	public void method() {
		System.out.println("B의 method()");
	}
}

// 선언과 구현 분리
interface I {
	void method();
}

class B2 implements I {
	public void method() {
		System.out.println("Interface의 method()");
	}
}

class C implements I {
	public void method() {
		System.out.println("C의 method()");
	}
}

public class c7_15_210422 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A가 B를 사용(의존)
		a.method2(new B2());
		a.method2(new C());

	}

}
