package test.ch07;

//초음속
public class SupersonicAirplane extends Airplane {
	//상수
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;

	//필드 
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행");
		}else { //normal 일때
			//super.메소드명() -> 부모클래스의 메소드 실행
			super.fly();			
		}
	}
}
