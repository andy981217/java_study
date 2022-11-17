package test.ch06.question;

public class Example3 {

	public static int max(int[]arr) {
		//만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환
		if (arr==null||arr.length==0) {
			return -999999;
			//빨간줄은 조건식에만 return 이 있어서,, 
		}
		//최대값
		int k=arr[0]; //초기값
		for(int i=0; i<arr.length; i++) {
			if(k<arr[i]) {
				k=arr[i];
			}
		}
		return k;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}

