class Data3 {
	int x;
}

public class c6_3_210413 {

	public static void main(String[] args) {
		Data3 m_d = new Data3();
		m_d.x = 10;

		Data3 m_d2 = copy(m_d);
		// c6_3_210413 c = new c6_3_210413();
		// c.copy()��� �� �ʿ� ���� ������ ���� class �ȿ� �ֱ� ����
		
		
		System.out.println("m_d.x=" + m_d.x);
		System.out.println("m_d2.x=" + m_d2.x);
	}

	// static�� ��ü ���� ���� ȣ�� ����
	static Data3 copy(Data3 d) { //������ �Ű������� ��ȯŸ��
		Data3 tmp = new Data3(); // ���ο� ��ü ���� 
		tmp.x = d.x; // ����

		return tmp; // ��ü�� �ּ� ��ȯ
	}
}
