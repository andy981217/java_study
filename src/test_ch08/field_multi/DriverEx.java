package test_ch08.field_multi;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.driver(taxi);
		driver.driver(bus);
	}

}
