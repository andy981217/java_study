package test.ch07.poly;
public class InstanceofEx {
	public static void personInfo(Person person) {
		System.out.println("name:"+person.name);
		person.walk();
	
		if(person instanceof Student) { //person이 Student 객체를 갖고있냐?
			Student student = (Student)person;
			student.study(); //메소드를 불러온다.
			System.out.println(student.studentNo);
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		Person p2 = new Student("김정환",10);
		personInfo(p2);
	}
}