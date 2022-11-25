package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String []array = {"100","1oo"};
		
		for (int i=0; i<array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //int형 데이터로 형변환 해준다.
				System.out.println("array["+i+"]:"+value);
			}catch(ArrayIndexOutOfBoundsException e) {//ctrl+space 단축키로 선택
				e.printStackTrace();
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

}
