package test.ch07.poly;
public class Student extends Person{
	//필드
	public int studentNo; //학번 
	//생성자
	public Student(String name, int StudentNo) {
		super(name); // super는 부모클래스 생성자를 실행
		this.studentNo=StudentNo;
	}
	//메소드 
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
