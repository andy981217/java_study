package test.ch07;

public class Computer extends Calculator {

	@Override
	//오버라이드: 부모클래스의 메소드를 재정의()
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}

}
