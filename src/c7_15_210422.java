class A {
	public void method(B b) {
		b.method();
	}

	public void method2(I i) { // ��B2�� �����������
		i.method();
	}
}

class B {
	public void method() {
		System.out.println("B�� method()");
	}
}

// ����� ���� �и�
interface I {
	void method();
}

class B2 implements I {
	public void method() {
		System.out.println("Interface�� method()");
	}
}

class C implements I {
	public void method() {
		System.out.println("C�� method()");
	}
}

public class c7_15_210422 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A�� B�� ���(����)
		a.method2(new B2());
		a.method2(new C());

	}

}
