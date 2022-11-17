package test.ch06.exam01.package1;

public class B{
	public void method() {
		A a = new A();
		a.field1=1; //o
		a.field2=1; //o
//		a.field3=1; //x 다른 건 같은 패키지 안이라 상관없는데
					//private 쓰는 field3 과 method3은 안된다.
		a.method1();
		a.method2();
//		a.method3();//x
	}
	
	
	
//	A a = new A();//A클래스 (default)접근 가능
//	A a1 = new A(true); // o
//	A a2 = new A(1);
//	A a3 = new A("문자열");//X
}
