package test.ch11.Object;

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		
		//해시코드 : 객체를 식별하는 정수(객체의 메모리 번지를 이용해서 만들어진다.) 
		System.out.println(s1.hashCode()+","+s2.hashCode());
		
		if(s1.hashCode()==s2.hashCode()) { //왜 요기서는 return값을 안주죠?
			System.out.println("2");
			if(s1.equals(s2)) {
				System.out.println("논리적 동등 입니다.");
			}else {
				System.out.println("논리적 동등이 아닙니다.");
			}
		}
	}

}
