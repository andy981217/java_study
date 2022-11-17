package test.ch06;

public class Car2 {
	//인스턴스 필드(static이 없음)
	static int a;
	int speed;
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed+"으로 달립니다.");
	}
	void run2() {
		this.run2();
		System.out.println(this.speed+"으로 달립니다.");
	}
	//정적 블록
	static {
		int speed = 200;
//		this.run;
		a = 11; //this는 static 에서 안써도된다 왜냐 static은 전적변수인데 어디서나 사용가능하기때문에 얘 혼자만 쓰는게 아니라서 가능
	} 
	
	//정적(static) 메소드??
	static void simulate() {
		int speed=200;
//		this.speed=200;
		//객체를 따로 생성해서 접근해야한다. 아래처럼
		Car2 myCar = new Car2();
		
		myCar.speed=200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
			
		Car2 myCar = new Car2();
		
		myCar.speed=60;
		myCar.run();

	}

}
