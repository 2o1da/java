// 추상 클래스: 상속을 통해 완성해야 객체 생성 가능
abstract class Player {
	// 추상 메서드
	abstract void play(int pos);

	abstract void stop();
}

class AudioPlayer extends Player {
	// 추상 클래스 상속 받았기 때문에 추상 메서드 1개라도 구현하지 않으면 ERROR
	void play(int pos) {
		System.out.println(pos + "부터 재생합니다.");
	}

	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
}

public class c7_11_210417 {
	public static void main(String[] args) {
//		Player p = new Player(); // ERROR:추상 클래스는 미완성이므로 객체 만들 수 없음

		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();

		Player ap2 = new AudioPlayer(); // 다형성
		ap2.play(200);
		ap2.stop();

	}
}
