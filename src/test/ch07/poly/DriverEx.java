package test.ch07.poly;

public class DriverEx {
	public static void main(String[] args) {
		Driver 차종 = new Driver(); //driver 객체를 생성한다.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		차종.drive(bus);
		차종.drive(taxi);
	}
}