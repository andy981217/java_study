package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567","정정환");
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		//정말 final은 변경이 안될까?
		k1.name="김정환";
//		k1.nation="미국";
		System.out.println(k1.name);
	}

}
