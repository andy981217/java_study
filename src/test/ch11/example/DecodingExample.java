package test.ch11.example;

import java.io.UnsupportedEncodingException;

import javax.xml.crypto.Data;

public class DecodingExample {

	public static void main(String[] args) throws UnsupportedEncodingException  {
		byte[]bytes = {-20,-107,-120,-21,-123,-107};
		String str =new String(bytes,"UTF-8");
		System.out.println("str:"+str);
	}

}
