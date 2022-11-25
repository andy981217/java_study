package test.ch08;

public class Television implements RemoteControl{
	private int volume;
	//＊인터페이스에 정의된 추상 메소드는 반드시 구현을 해줘야 한다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:" + volume);
	}

}
