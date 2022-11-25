package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.naem");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println("1");
		System.out.println(userName);
		System.out.println("1");
		System.out.println(userHome);
		System.out.println("1");

		Properties props = System.getProperties();
		Set keys = props.keySet();
		System.out.println("1");
		
		for (Object objkey : keys) {
			String key =(String)objkey;
			System.out.println("1");
			System.out.println(key);
			
		}
	}

}
