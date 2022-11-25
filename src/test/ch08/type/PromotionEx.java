package test.ch08.type;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a; //인터페이스 변수를 선언
		a = b; //자동 타입 변환
		a = c; //
		a = d; 
		a = e;
	}

}
