package test.ch08;

public class MultiInterfaceEx {

	public static void main(String[] args) {
	//두 개 상속 받아서 객체 2개
		RemoteControl2 rc = new SmartTelevision(); //자동 형변환
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
	}

}
