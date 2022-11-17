	package test.ch06.exam01.package2;

import test.ch06.exam01.package1.A;
import test.ch06.exam01.package1.B;

public class C {
	public C() {
		A a = new A();
		a.field1=1; //o
		a.field2=1; //o
		a.field3=1; //o
		a.method1();
		a.method2();
		a.method3();
		//private는 당연히 안되고, default는 다른 패키지 불가능 
	}
	
	
	
	
	
	
	
//	A a = new A(); //A 클래스 (default) 접근 불가
//	B b = new B();
	A a1 = new A(true); // o
//	A a2 = new A(1);
//	A a3 = new A("문자열");//X

}
