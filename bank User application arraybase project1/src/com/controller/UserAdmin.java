package com.controller;

import java.util.Scanner;

import com.service.Userservice;
import com.userapplication.exceptionHandler.ExceptionHandler;

public class UserAdmin {
	
	public static void main(String[] args) {
		
		System.out.println(" ******Welcome to UserService****");
		Scanner sc =new Scanner ( System.in);
		boolean flag =true;
		Userservice us =new Userservice ();
		while( flag)
		{
			System.out.println(" =====================");
			System.out.println("1:register user ID");
			System.out.println("2Show userDetails ");
			System.out.println("3:Displaysingleuser Details");
			System.out.println("4:update user");
			System.out.println("5:Delete user");
			System.out.println("6:exit");
			System.out.println("7:Enter choice between 1 to 7");
			
			int ch=ExceptionHandler.getvalidateChoice();
			switch (ch) {
			case 1: 
				us.registerUser();
				break;
			case 2:
				us.displayuserdetails();
				break;
			case 3:
				us.displaysingleuserdetails();
				break;
			case 4:
				us.updateuser();
				break;
			case 5:
				us.deleteuser();
				break;
				
				default:
					System.out.println("Wrong choice  ");
					
			}
			
		}
		System.out.println(" Thank you ");
		sc.close();
	}

}
