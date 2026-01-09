package com.userapplicationValidationChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationChecker {
	
	static Scanner sc= new Scanner( System.in);
	
	public static String validateUserName() {
		System.out.println(" Enter your user name");
		String username=sc.next();
		if(Pattern.matches("[ A-Za-z]+", username)) {
			System.out.println(" valid username");
			return username;
		}
		else {
			System.out.println(" Invalid username");
			return validateUserName();
		}
	}
	
	
	public static String validateUserPancardNo() {
		System.out.println(" Enter your user pancard no");
		String pancardno=sc.next();
		if( pancardno.length()==10 && Pattern.matches("[ A-Z]{5}[0-9]{4}[A-Z]{1}", pancardno)) {
			System.out.println(" Valid  User pancard no");
			return pancardno;
			
		}else {
			System.out.println(" Invalid userpancard no");
			return validateUserPancardNo();
		}
	}
	public static String validateUserAadharno() {
		//sc.nextLine();
		System.out.println(" Enter your user Aadharcard no");
		 
		String aadharcardno=sc.nextLine();
	if(  aadharcardno.length()==14 &&Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", aadharcardno)){
		//if(  Pattern.matches("^[0-9]{4}\\s?[0-9]{4}\\s?[0-9]{4}$",aadharcardno)) {
			
		System.out.println(" Valid Aadharcard no ");
		return aadharcardno;
		
	}else {
		System.out.println(" Invalid user Aadharcard no");
		return validateUserAadharno();
	}	
	}

public static long validateMobileno() {
	System.out.println(" Enter your  mobile no");
	long mobileno=sc.nextLong();
	String mobileNO=String.valueOf(mobileno);
	if(mobileNO.length()==10 && (mobileNO.startsWith("6") || mobileNO.startsWith("7") || mobileNO.startsWith("8")
			|| mobileNO.startsWith("9"))) {
		System.out.println(" Valid mobile no");
		//return mobileno;
	}else {
		System.out.println(" Invalid mobile no");
		validateMobileno();
	}
	return mobileno;
}

public static String validateEmailId()	{
	System.out.println(" Enter your Email Id");
	String emailId=sc.next();
	//if(Pattern.matches(^[A-Za-z0-9+_.-]+@[A-Za-Z0-9.-]+\.[A-Za-z]{2,6}$, emailId)) {
	if(Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", emailId)) {
		System.out.println(" Valid EmailID");
		//sc.nextLine();
		return emailId;
	}
	else {
		System.out.println(" InvalidEmailId ,plese Renter it again ");
		return validateEmailId();
		
		
	}
	
	
}
	

}
