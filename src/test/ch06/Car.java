package test.ch06;

public class Car {
	//1. 필드: 객체의 데이터를 저장
	String company ="현대자동차";
	String model = "그랜저";
	String color="검정";
	int maxSpeed=350;
	int speed;
//	boolean start; //시동여부
	//자바에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다. 	
	Car(String model){
//		this.model=model;
		this(model,"은색",250);
	}
	Car(String model,String color){
//		this.model=model;
//		this.color=color;
		this(model,color,250);
	}
//	Car(String model,String color){
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=maxSpeed;
//	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
