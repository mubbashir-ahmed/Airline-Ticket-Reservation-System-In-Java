package app_packages;

public class MainClass {

	public static void main(String[] args) {
		try {
		LoginSignUpClass loginSignUpClassObj = new LoginSignUpClass();
		
		System.out.println("\t\t=================================");
		System.out.println("\t\tAIRLINE TICKET RESERVATION SYSTEM");
		System.out.println("\t\t=================================");
		
		loginSignUpClassObj.LoginSignUpMenu();
		}
		catch (Exception e) {
			System.out.println("AN ERROR OCCURED!");
		}
	}
}
