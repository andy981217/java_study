package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*
		Child child = new Child();
		Parent parent = child; //자동 타입 변환 //parent의 향이 강하네?
		parent.method1();
		parent.method2();//오버라이드 된 메소드를 불러온다.
//		parent.method3(); // 자동형변환이 일어났을 때는 자식객체에 있는 
//		메소드는 불러오지않는다.
		parent.a=2;
		System.out.println(parent.a);
//		parent.b=1; (자식에게 있기 때문에 접근 불가능)
 * */	Parent parent = new Parent();
		Child child= new Child();
		child.method1();
		parent.method2();
		
		//------------------------------------------------------------------	
		/*Parent parent = new Child(); // 1.자동 타입 변화
		
//		instanceof: 객체 타입 확인을 위한 자바에서 제공하는 연산자
		// parent가 child 타입이 아니라면 강제 타입 변환을 할 수 없으므로
		if(parent instanceof Child) { //parent 매개변수가 child를 담고 있냐?
//			true, false 냐에 따라서 적용
			/*Child child = (Child)parent; // 2.강제 타입 변화
//		자동타입변화가 일어난 후에 강제 타입 변화가 일어난다.
			child.b=1;
			child.method3(); //자식메소드에 있는 필드에 접근 가능
		}*/
		
		
		}
	}


