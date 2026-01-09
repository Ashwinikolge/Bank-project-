package com.userapplication.exceptionHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
	
	public static int getvalidateChoice() {
		Scanner sc =new Scanner( System.in);
		
		System.out.println(" Enter your choice ");
		int choice =0;
		try {
			choice =sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(" Invalid user choice ,plese re-enter valid input  choice");
			return getvalidateChoice();
			
		}
		return choice;
	}

}
