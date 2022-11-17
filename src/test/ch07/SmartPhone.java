package test.ch07;

public class SmartPhone extends phone{
	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		super(model, color); //부모 생성자 호출
		
		
		System.out.println("자식 생성자 호출");
		this.model=model;
		this.color=color;
//		this.model=model; //부모 필드에 접근 가능.
//		this.color=color; //부모 필드에 초기값을 준다. 
		//위에 model 하고 color 가 없는데 에러가 안뜨네? 왜? 부모가 갖고 있어서 
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
