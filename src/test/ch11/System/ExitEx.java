package test.ch11.System;

public class ExitEx {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			if (i==5) {
				//프로세스종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);
				//0은 정상종료
				//1과 -1은 비정상 종료
			}
		}

	}

}
