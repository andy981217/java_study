package test.ch06;

public class This {
	String model;
	int speed;
	This(String model){//생성자
		this.model=model;
		//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 this를 붙인다.
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
	    setSpeed(100); // 같은 클래스 간의 메소드를 호출 시 this 생략가능 
		System.out.println(this.model+","+this.speed);
	}
}
