class Car {
	String color;
	int door;

	void drive() {
		System.out.println("BRRR~");
	}

	void stop() {
		System.out.println("STOP~");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("WATER~");
	}

	void doWork(Car c) {
		if (c instanceof FireEngine) { // instanceof ¿¬»êÀÚ
			FireEngine fe = (FireEngine) c;
			fe.water();
		}
	}
}

public class c7_8_210414 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;

		f.water();

		car = (Car) f;
//		car.water(); // ERROR

		f2 = (FireEngine) car;
		f2.water();
		
		System.out.println(f instanceof Object);
		System.out.println(f instanceof Car);
		System.out.println(f instanceof FireEngine);

	}
}
