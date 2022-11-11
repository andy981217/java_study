package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		System.out.println("45&25="+(45&25));
		System.out.println("45|25="+(45|25));
		System.out.println("45^25="+(45^25));
		System.out.println("~45="+(~45));
		System.out.println("--------------------");
		
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);
	}

}
