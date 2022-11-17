package test.ch06.question.last;

import java.util.Scanner;

public class BankApplication {
	private static	Scanner scanner = new Scanner(System.in); //스캐너 객체 생성

	private static Account[] accountArray=new Account[100]; //account 객체를 담을 배열이기 때문에 [] 앞에 account 씀
	//->계좌 객체를 담을 배열 100개 가능  ,, 객체를 담을 배열은 초기값  null
	public static void main(String[] args) {
		boolean run =true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int selectNo=scanner.nextInt();
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
		

	}
		// 1. 계좌 생성
		public static void createAccount() {
			System.out.println("----------");
			System.out.println("계좌생성");
			System.out.println("----------");
			
			System.out.println("계좌번호");
			String ano = scanner.next();
			
			System.out.println("계좌주:");
			String owner = scanner.next();
			
			System.out.println("초기입금액:");
			int balance = scanner.nextInt();
		
			Account newAccount = new Account(ano,owner,balance);
			
			for(int i=0;i<accountArray.length; i++) {
				System.out.println(accountArray[i]); //null을 100개 찍음
				if(accountArray[i]==null) {
					accountArray[i]=newAccount;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break; //break 안쓰면 100번 돈다. //계좌를 넣고 for 반복문을 끝낸다. 
				}
			}
		}
		// 2. 계좌 목록
		public static void accountList() {
			for(int i=0; i<accountArray.length;i++) {
				
			}
		}
		// 3. 예금
		public static void deposit() {
			
		}
		// 4. 출금
		public static void withdraw() {
			
		}
		// 5. accountArray 배열에서 ano와 동일한 Account 객체 찾는 역할을 한다. 
		private static Account findAccount(String ano) {
			
		}

}
