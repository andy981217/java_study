package test.ch06;

public class Earth {
	//상수 선언시(변수명은 대문자로 쓴다.)
	//final: 절대 변경 X
	//static: 전역변수
	static final double EARTH_RADIUS=6400;//지구 둘레
	static final double EARTH_SURFACE_AREA;//지구 둘레
	//static 블록 : static 필드를 초기화 해줄 때 
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
