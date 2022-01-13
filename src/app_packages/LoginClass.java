package app_packages;

import java.util.Scanner;

public class LoginClass extends LoginSignUpClass {
	public void LoginForm() {
		System.out.println("\t\t      =====================");
		System.out.println("\t\t      LOGIN TO YOUR ACCOUNT");
		System.out.println("\t\t      =====================");
		
		UserClass UserClassObj = new UserClass();
		Scanner loginScanner = new Scanner(System.in);
	    
		System.out.print("=> Enter Username: ");
	    String userName = loginScanner.next();
	    UserClassObj.setUserName(userName);

	    System.out.print("=> Enter Password: ");
	    String password = loginScanner.next();
	    UserClassObj.setPassword(password);

	    for(int i = 0;i < UserDBHC.length;i++) {
	    	for(int j = 0;j < PassDBHC.length;j++) {
	    		if(i == j) {
		    		if(UserDBHC[i].equals(userName) && PassDBHC[j].equals(password)) {
		    	        System.out.println("\nSUCCESSFULLY LOGGED IN! WELCOME TO YOUR DASHBOARD\n");
		    			UserClassObj.UserMenu();
		    		}
		    		else if(!UserDBHC[i].equals(userName) && !PassDBHC[j].equals(password)) {
		    			System.out.println("\nINVALID USERNAME OR PASSWORD!\n");
		    			LoginSignUpMenu();
		    		}
		    		else {
		    			System.out.println("\nSUCCESSFULLY LOGGED IN! WELCOME TO YOUR DASHBOARD\n");
		    			UserClassObj.SearchUserPassFromArray();
		    		}
		    		
	    		}
	    	}
	    }
	}
}
