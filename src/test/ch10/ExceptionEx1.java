package test.ch10;

public class ExceptionEx1 {

	public static void printLength(String data) {
		try { //실행시킬 코드를 작성
			int result = data.length(); //문자 수
			System.out.println("문자 수: " + result);			
		}catch(NullPointerException e) { //에러가 났을 때 실행시킬 코드를 작성
			System.out.println(e.getMessage());// 예외가 발생한 이유만 출력 
			System.out.println("오류가 발생 warning!");
//			System.out.println(e.toString()); //예외 발생 이유 + 예외 종류 출력
			e.printStackTrace(); //예외 발생 이유 + 예외의 종류 리턴 + 예외가 발생한 곳 출력
		}finally { //finally는 옵션임
			//여러여부와 상관없이 무조건 실행된다.
			System.out.println("마무리 실행\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		
		System.out.println("프로그램 종료");
	}

}