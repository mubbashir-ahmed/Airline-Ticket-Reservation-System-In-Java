package app_packages;

import java.util.Scanner;

public class LoginSignUpClass {
	public String[] UserDB = new String[50];
	public String[] PassDB = new String[50];
	public String[] UserDBHC = {"mubbashir", "khadijah", "arbaz", "javeria"};
	public String[] PassDBHC = {"mubbashir123", "khadijah123", "arbaz123", "javeria123"};
	
	void LoginSignUpMenu() {
		System.out.println("\t\t     =======================");
		System.out.println("\t\t     DO YOU HAVE AN ACCOUNT?");
		System.out.println("\t\t     =======================");
		System.out.println("1. Log In (Existing account)");
		System.out.println("2. Sign Up (New account)");
		System.out.println("3. Exit");

		System.out.print("Enter Your Choice: ");		
		int choice;
		Scanner choiceScanner = new Scanner(System.in);
		choice = choiceScanner.nextInt();
		
		if(choice == 1) {
			LoginClass loginClass = new LoginClass();
			loginClass.LoginForm();
		}
		else if(choice == 2) {
			SignUpClass signUpClass = new SignUpClass();
			signUpClass.SignUpForm();
		}
		else if(choice == 3) {
			System.out.println("APPLICATION CLOSED!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid Choice!");
		}
	}
}