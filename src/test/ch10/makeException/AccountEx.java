package test.ch10.makeException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//저축
		account.deposit(10000); //만원 저축
		System.out.println("예금액: " + account.getBalance());//잔고를 가져온다.
		
		//출금
		try {
			account.withdraw(30000);			
		}catch(InsuffException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
