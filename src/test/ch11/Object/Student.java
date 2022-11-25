package test.ch11.Object;

public class Student {
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no,String name) {
		this.no=no;
		this.name=name;
	}
	//메소드

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("no:"+no +", "+"hashCode"+ name.hashCode());
		int hashCode = no+ name.hashCode(); // 번호와 이름이 같으면 동일한 값이 생성이된다?
		System.out.println("1");
		System.out.println("2");
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) { //Object obj = new Student();
		if(obj instanceof Student) { //obj가 Student 객체를 갖나
			Student target = (Student)obj;
			
			//no하고 name 이 같은 지 비교
			if(no==target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
}
