import java.text.NumberFormat.Style;

class Point {
	int x;
	int y;
}

class Point3D extends Point {
	int z;
}

class Point3D2 extends Point {
	int x;
	int y;
	int z;
}

class Tv {
	// ¸â¹ö 5°³
	boolean power;
	int channel;

	void Power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}

class SmartTv extends Tv {
	// ÀÚ½Ä ¸â¹ö 2°³ + ºÎ¸ð ¸â¹ö 5°³ = ÃÑ 7°³
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class c7_0_210413 {
	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello");
		stv.caption = true;
		stv.displayCaption("Bye");
	}
}
