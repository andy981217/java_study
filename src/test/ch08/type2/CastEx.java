package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
	/*	Vehicle vehicle = new Bus();
		vehicle.run();
		//강제 형변환 자식이 갖고 있는 거 쓰고 싶을때
		Bus bus = (Bus)vehicle;
		bus.checkFare();
	}*/
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		ride(taxi);
		ride(bus);
	}
	public static void ride(Vehicle vehicle) {
		//vehicle이 bus객체를 가지고 있냐? Vehicle vehicle = new Bus(	);?
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
			
		}
	}
}
