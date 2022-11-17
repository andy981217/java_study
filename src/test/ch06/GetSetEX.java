package test.ch06;

public class GetSetEX {

	public static void main(String[] args) {
		GetSet getset=new GetSet();
		getset.setSpeed(20);   
		System.out.println(getset.getSpeed());
		if(!getset.isStop()) { //달리고 있을 때
			getset.setStop(true);
	}
		System.out.println(getset.getSpeed());
	}

}
