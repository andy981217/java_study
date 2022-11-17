package test.ch06.question;

public class Example1 { //static을 왜 쓴다고? 안쓰면 new 써서 만들어야 한대. class에 포함된 게 아니다..
			public static boolean isNumber(String str) {
				if(str==null || str.equals("")	) { //string은 ==대신 equal 사용 
					return false;}
				for(int i=0; i<str.length();i++) {
					char ch=str.charAt(i);
					System.out.println("값:"+ch);
				if(ch<'0'||ch>'9') { //숫자가 아님 '0'=48,'9'=57; 
					return false;
				}
			}
				return true;
		}
			
		public static void main(String[] args) {
			String str = "123";
			System.out.println(str+"는 숫자입니까?"+isNumber(str));
			str="1234o";
			System.out.println(str+"는 숫자입니까?"+isNumber(str));
		}

}
