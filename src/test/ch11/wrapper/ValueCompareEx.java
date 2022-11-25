package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2); //얘는 객체 주소는 다르다
		System.out.println(obj1.equals(obj2)); // 값을 비교
		System.out.println();
		
		/*
		 [값을 비교하는 타입]
		 Boolean 
		 Character
		 byte, short, int : -128~127 값을 비교
		  */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		
	}

}
