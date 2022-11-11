package test.ch03;

public class OverflowUnderflow {

	public static void main(String[] args) {
		byte var1 = 125;  //-128~ 127 자기 범위보다 커져서 처음으로 돌아가짐
		//오버플로우: 타입이 허용되는 최대값을 벗어나는 것 
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println(var1);
		}
		byte var2 = -125;
		
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2:"+var2);
	
		}
	}

}
