package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.tire = new HankookTire();
		
		myCar.run();
	}

}
