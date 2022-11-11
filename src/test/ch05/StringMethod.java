package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		String board = " 1.자바 학습, 참조 타입";
		String[]tokens=board.split(",");
		
		for(int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		/*String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("파워");
		System.out.println(location);
		
//		String substring = subject.substring(location);
//		System.out.println(substring);
		
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}
		
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련없는ㅇㅐㄹ");
		}*/
		
		
		
		/*String ssn = "981217-1234567";
		String firstName = ssn.substring(0,6);
		System.out.println(firstName);
		
		String secondName =ssn.substring(7);
		System.out.println(secondName);*/
		
		
		/*String oldStr = "자바 문자열";
		String newStr = oldStr.replace("자바", "JAVA");
			
		System.out.println(newStr);*/
		
	
		
		/*String ssn = "9812171456786"; //주민번호
		char sex = ssn.charAt(6);
		int length = ssn.length();
		
		if(length==13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;*/
		
	}
	

}
