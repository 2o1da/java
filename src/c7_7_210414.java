// 캡슐화와 접근 제어자
class Time {
	private int hour;
	private int minute;
	private int second;

	// 메서드를 통해 멤버 변수에 간접 접근
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