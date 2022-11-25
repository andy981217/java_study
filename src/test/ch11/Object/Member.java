package test.ch11.Object;

public class Member  {
	//필드
	public String id;
	//생성자
	public Member(String id) {
		this.id=id;
	}
	//논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교 
	@Override
	public boolean equals(Object obj) {
		//obj가  Member을 갖고 있냐?
		if(obj instanceof Member) { //강제형변환을 위한 검사
			Member target = (Member)obj; //강제 형변환(자식객체 필드를 가져오기위함)
		
			if(id.equals(target.id)) {//여기서의 equals는 String의 equals(순수하게 문자값 비교)
				return true;
			}
		}	
		return false;
	}
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);

		/*String a="1";
		String b="2";
		
		if(a==b) //X주소를 비교
		if(a.equals(b)) // O 값을 비교 
		//논리적 동등: 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
	}*/

}
