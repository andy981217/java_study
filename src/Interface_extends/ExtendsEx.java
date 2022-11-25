package Interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterFaceCImpl impl = new InterFaceCImpl();
		InterfaceA ia = impl; //자동형변환
		ia.methodA();
		
		InterfaceB ib= impl; //자동형변환
		ib.methodB();
		
		InterfaceC ic = impl;
		//interfaceC는 interfaceA,interfaceB를 상속을 받았으므로 아래와 같이 호출가능  
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
;