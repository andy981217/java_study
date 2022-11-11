package test.ch03;

public class Acc {

	public static void main(String[] args) {
//		int apple = 1;
//		int totalpiece = apple * 10;
//		int number = 7;
//		
//		정확한 계산은 항상 정수로 해야한다. 
//		int result=totalpiece - number;
//		System.out.println("사과 1개에서 남은 양:"+result/10.0);
		
		int x =5;
		double y =0.0;
//		double z =x / y ;
		double z = x % y;
		System.out.println(z + 2);
//		infinity 무한대 / nan 숫자가 아님

		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z);
		}
	}

}
