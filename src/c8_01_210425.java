public class c8_01_210425 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
//			System.out.println(0 / 0);
			System.out.println(args[0]);
			System.out.println(2);
		} 
		catch (ArithmeticException e1) {
			if (e1 instanceof ArithmeticException) {
				System.out.println("True");
			}
			System.out.println("ArithmeticException");
		} 
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		/*
		 * catch (Exception e2) { // Exception:��� ������ �ְ� �����̱� ������ �� ������ catch ���� �´�.
		 * System.out.println("Exeption"); }
		 */
		System.out.println(5);
	}
}