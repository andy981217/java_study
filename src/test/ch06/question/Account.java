package test.ch06.question;

public class Account {
	private int balance; //잔고
	public static final int MIN_BALANCE=0; //static final (상수) =변하지 않고 어디서든 사용가능하다. (대문자, 스네이크 사용)
	public static final int MAX_BALANCE=1000000;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE ||balance>MAX_BALANCE) {
			System.out.println("1");
			return;	
		}else {
			this.balance = balance;	
			System.out.println("2");
		}
		
		//1. 0<=balance =< 1,000,000 범위 일때 this. balance = balance;
		//2. 정상범위가 아니라면 현재 balance를 유지
	}

	

	
}

