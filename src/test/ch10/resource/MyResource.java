package test.ch10.resource;

public class MyResource implements AutoCloseable{ 
	//AutoClosable은 리소스를 자동으로 닫아주는 기능을 사용하기 위해서 쓰는 인터페이스
	//필드 
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name=name;
		System.out.println("MyResource 열기");
	}
	
	//메소드
	public String read1() {
		System.out.println("MyResource"+name+"읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource"+name+"읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception { //닫아주는 메소드
		//파일을 닫을 때 실행하고 싶은 코드 작성 
		// TODO Auto-generated method stub
		System.out.println("MyResource"+name+"닫기");
		
	}
}
