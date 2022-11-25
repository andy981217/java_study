package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		/*RemoteControl rc; 
				
		rc= new Television();
		rc.turnOn();
	
		rc=new Audio(); //오디오로 교체
		rc.turnOn();
		
		//static의 특성을 가졌기 때문에 객체를 생성하지 않고 호출한다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);*/

		
	}

}
