public class c6_7_210413 {

	public static void main(String[] args) {

	}
}

class Car2 {
	String color;
	String gearType;
	int door;

	// �ڵ� �ߺ� �����ϱ� ���� this ���
	Car2() {
		color = "white";
		gearType = "auto";
		door = 4;
	}

	Car2() {
		// Car("white", "auto", 4); // Car (X)
		this("white", "auto", 4); // Car2(String c, String g, int d) ȣ��
	}

	Car2(String color) {
		this(color, "auto", 4); // Car2(String c, String g, int d) ȣ��
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car2(String c, String g, int d) {
		this.color = c;
		gearType = g; // this ���� ����
		door = d;
	}
}