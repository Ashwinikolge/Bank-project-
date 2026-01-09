package com.service;

import java.util.Scanner;

import com.model.Constant;
import com.model.User;
import com.userapplicationValidationChecker.ValidationChecker;

public class Userservice implements UserserviceInterface {

	User[] userArray = new User[Constant.max_size];
	Scanner sc = new Scanner(System.in);

	@Override
	public void registerUser() {

		System.out.println(" enter the no of account you want to register ");
		int n = sc.nextInt();
		if (n < userArray.length) {
			for (int i = 0; i < n; i++) {
				System.out.println(" Enter account Id");
				User u = new User();
				u.setUserId(sc.nextInt());
			
				u.setUsername(ValidationChecker .validateUserName());
				
				System.out.println(" Enter your Address ");
				u.setAddress(sc.next());
				
				u.setPancardno(ValidationChecker .validateUserPancardNo());
				
				u.setAadharno(ValidationChecker.validateUserAadharno());
				
			
				u.setEmailId(ValidationChecker.validateEmailId());
			
				u.setMobileno(ValidationChecker.validateMobileno());
				
				System.out.println(" Account Register Succesfully ");
				userArray[i] = u;
				System.out.println(" User register for  " + i + " th index");

			}

		} else {
			System.out.println(" only " + userArray.length + "user can be register");
		}
	}

	public int validateUserByUserid() {
		System.out.println(" Enter user id");
		int userid = sc.nextInt();
		boolean flag = false;
		for (User user : userArray) {
			if (user != null && userid == user.getUserId()) {
				flag = true;
			}
		}
		if (flag) {
			return userid;

		} else {
			System.out.println(" Invalid user id,plese enter valid user id");
			return validateUserByUserid();

		}
	}

	@Override
	public void displayuserdetails() {
		System.out.println("  User details");
		for (User user : userArray) {
			if (user != null) {
				System.out.println(user);
				/*System.out.println(user.getUserId());
				System.out.println(user.getUsername());
				System.out.println(user.getAddress());
				System.out.println(user.getEmailId());
				System.out.println(user.getMobileno());
				System.out.println(user.getAadharno());*/
				
				
			} else {
				continue;
			}
		}
	}

	@Override
	public void displaysingleuserdetails() {
		int userid = validateUserByUserid();
		System.out.println(" user details for userid :" + userid);
		for (User user : userArray) {
			if (user != null && userid == user.getUserId()) {
				System.out.println(user);

			} else {
				continue;
			}
		}
	}

	@Override
	public void updateuser() {
		boolean flag= true;
		while(flag) {
			System.out.println("--------------");
			System.out.println("1.Update Name");
			System.out.println("2.Update Email");
			System.out.println("3.Update Contact no");
			System.out.println("4.Exist");
			
			int  c=sc.nextInt();
			switch(c) {
			
			case 1:
				UpdateName();
				break;
			case 2:
				UpdateEmail();
				break;
			case 3:
				UpdateMobileno();
				break;
				default:
					System.out.println(" Wrong choice");
		
		}
		}
	}

	private void UpdateMobileno() {
long userid=validateUserByUserid();
for( User user: userArray ) {
	if( user!=null && userid==validateUserByUserid()) {
		System.out.println(" Enter your mobile no");
		user.setMobileno(sc.nextLong());
		System.out.println(" Updated User mobile no :"+ user.getMobileno());
		
	}
}
		
	}

	private void UpdateEmail() {
		long userid=validateUserByUserid();
		for( User user: userArray) {
			if(user!=null && userid==user.getUserId()) {
				System.out.println(" Enter your User EmailId");
				user.setEmailId(sc.next());
				System.out.println(" Updated User EmailId :"+ user.getEmailId());
			}
		}
		
		
	}

	private void UpdateName() {
		long  userid=validateUserByUserid();
		for( User user: userArray) {
			if( user!=null && userid==user.getUserId()) {
				System.out.println(" Enter your User Name");
				user.setUsername(sc.next());
				System.out.println(" Updated User Name :"+ user.getUsername());
			}
		}
		
	}

	@Override
	public void deleteuser() {
		
	   System.out.println("enter id of which user you delete :");
	   int userid = sc.nextInt();
		for( int i=0; i<userArray.length;i++) {
		if(userArray[i]!=null  && userid==userArray[i].getUserId()) {
			userArray[i]=null;
			
		}
		else {
			continue;
		}
		System.out.println(" After deleting the user list is");
		displayuserdetails();
	
	}
}
}