// ĸ��ȭ�� ���� ������
class Time {
	private int hour;
	private int minute;
	private int second;

	// �޼��带 ���� ��� ������ ���� ����
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (isNotValidHour(hour))
			return;
		this.hour = hour;
	}

	// Alt+Shift+M
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
}

public class c7_7_210414 {
	public static void main(String[] args) {
		Time t = new Time();
		t.getHour();
		t.setHour(25);
	}
} 	