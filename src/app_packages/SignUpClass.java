package app_packages;

import java.util.Scanner;

public class SignUpClass extends LoginSignUpClass {
	public void SignUpForm() {
		System.out.println("\t\t\t==================");
		System.out.println("\t\t\tCREATE NEW ACCOUNT");
		System.out.println("\t\t\t==================");
		
		UserClass UserClassObj = new UserClass();
		Scanner stringScanner = new Scanner(System.in);
		Scanner intScanner = new Scanner(System.in);
		Scanner longScanner = new Scanner(System.in);
		
        System.out.print("=> Enter Name: ");
        String name = stringScanner.nextLine();
        UserClassObj.setName(name);
        
        System.out.print("=> Enter Username: ");
        String userName = stringScanner.nextLine();
        UserClassObj.setUserName(userName);

        System.out.print("=> Enter Password: ");
        String password = stringScanner.nextLine();
        UserClassObj.setPassword(password);

        System.out.print("=> Enter Passport Number: ");
        long passportNo = longScanner.nextLong();
        UserClassObj.setPassportNo(passportNo);
        
        System.out.print("=> Enter Gender: ");
        String gender = stringScanner.nextLine();
        UserClassObj.setGender(gender);
        
        System.out.print("=> Enter Age: ");
        int age = intScanner.nextInt();
        UserClassObj.setAge(age);
        
        System.out.print("=> Enter DOB (DD/MM/YYYY): ");
        String DOB = stringScanner.nextLine();
        UserClassObj.setDOB(DOB);
        
        System.out.print("=> Enter Address: ");
        String address = stringScanner.nextLine();
        UserClassObj.setAddress(address);
        
        System.out.print("=> Enter Country: ");
        String country = stringScanner.nextLine();
        UserClassObj.setCountry(country);
        
        System.out.print("=> Enter Email ID: ");
        String emailID = stringScanner.nextLine();
        UserClassObj.setEmailID(emailID);

        System.out.print("=> Enter Phone Number: ");
        long phoneNo = longScanner.nextLong();
        UserClassObj.setPhoneNo(phoneNo);
        
        if(!(name == null || userName == null || password == null || passportNo == 0 
        		|| gender == null || age == 0 || DOB == null || address == null 
        		|| country == null || emailID == null || phoneNo == 0)) {
        	UserClassObj.PushDataIntoArray();
        	System.out.println("\nSUCCESSFULLY ACCOUNT CREATED! WELCOME TO YOUR DASHBOARD\n");
            UserClassObj.UserMenu();
        }
        else {
        	System.out.println("\nFIELDS ARE NOT FILLED! KINDLY FILL THE FORM AGAIN!");
        	SignUpForm();
        }
	}
}
