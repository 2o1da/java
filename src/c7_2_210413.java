class MPoint {
	int x, y;

	String getLocation() {
		return "x:" + x + ", y:" + y;
	}

	// Object Ŭ������ toString()�� �������̵�
	public String toString() {
		return "x:" + x + ", y:" + y;
	}

	MPoint() {
	}

	MPoint(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class MPoint3D extends MPoint {
	int z;

	// �������̵� : ��� ���� ���� Ŭ������ �޼��带 ����
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z; // �޼��� �̸� ������ ���� �Ұ�, �����θ� ���� ����
	}

	public MPoint3D(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public String toString() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
}

public class c7_2_210413 {
	public static void main(String[] args) {
		MPoint3D p = new MPoint3D(3, 5, 7);
		System.out.println(p.getLocation());
		System.out.println(p.toString());

		MPoint m_p = new MPoint(1, 2);
		System.out.println(m_p);
		System.out.println(m_p.toString());

	}
}