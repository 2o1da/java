// �߻� Ŭ����: ����� ���� �ϼ��ؾ� ��ü ���� ����
abstract class Player {
	// �߻� �޼���
	abstract void play(int pos);

	abstract void stop();
}

class AudioPlayer extends Player {
	// �߻� Ŭ���� ��� �޾ұ� ������ �߻� �޼��� 1���� �������� ������ ERROR
	void play(int pos) {
		System.out.println(pos + "���� ����մϴ�.");
	}

	void stop() {
		System.out.println("����� ����ϴ�.");
	}
}

public class c7_11_210417 {
	public static void main(String[] args) {
//		Player p = new Player(); // ERROR:�߻� Ŭ������ �̿ϼ��̹Ƿ� ��ü ���� �� ����

		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();

		Player ap2 = new AudioPlayer(); // ������
		ap2.play(200);
		ap2.stop();

	}
}
