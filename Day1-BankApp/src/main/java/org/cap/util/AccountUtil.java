package org.cap.util;

public class AccountUtil {

	private static int accNo=0;
	
	public static int generateAccountNumber(){
		System.out.println("inside account number");
		return accNo++;
	}
}
