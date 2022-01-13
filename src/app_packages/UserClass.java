package app_packages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserClass {
	// VARIABLES TO GET USER DATA
    private int age;
	private String name;
    private String address;
    private String emailID;
    private String DOB;
    private String userName;
    private String password;
    private String gender;
    private String country;
    private long phoneNo;
    private long passportNo;
    
    // VARIABLES ARRAY TO STORE USER DATA
    private String[] nameArray = new String[500];
    private int[] ageArray = new int[500];
    private String[] addressArray = new String[500];
    private String[] emailIDArray = new String[500];
    private String[] DOBArray = new String[500];
    private String[] userNameArray = new String[500];
    private String[] passwordArray = new String[500];
    private String[] genderArray = new String[500];
    private String[] countryArray = new String[500];
    private long[] phoneNoArray = new long[500];
    private long[] passportNoArray = new long[500];
    
    // VARIABLES ARRAY TO STORE FLIGHT DETAILS
    private String[] flightNoArray = {"G9540", "G9546", "G9548", "G9551", "G9590", "G9521", "G9543", "G9621", "G9512", "G9435"};
    private String[] flightDateArray = {"01/02/2021", "01/02/2021", "01/02/2021", "02/02/2021", "02/02/2021", "02/02/2021", "03/02/2021", "03/02/2021", "03/02/2021", "03/02/2021"};
    private String[] flightDepAirport = {"Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport", "Karachi Airport"};
    private String[] flightArrivalAirport = {"Abu Dhabi Airport", "London Airport", "New York Airport", "Jeddah Airport", "Dubai Airport", "Istanbul Airport", "Qatar Airport", "Amsterdam Airport", "Beijeing Airport", "Turkey Airport"};
    private String[] flightDepTime = {"02:50 am", "11:20 am", "06:10 am", "04:30 am", "04:10 pm", "05:20 am", "02:50 am", "11:20 am", "06:10 am", "04:30 am"};
    private String[] flightArrivalTime = {"04:05 am", "10:20 pm", "06:10 pm", "04:30 pm", "05:35 pm", "09:10 am", "04:05 am", "10:20 pm", "06:10 pm", "04:30 pm"};
    private String[] flightStatus = {"Confirmed", "Expected", "Confirmed", "Expected", "Expected", "Confirmed", "Expected", "Confirmed", "Expected", "Expected"};
    
    public void UserMenu() {
    	int i = 0;
		while(i < 7) {
			System.out.println("\t\t\t    =========");
	        System.out.println("\t\t\t    DASHBOARD");
	        System.out.println("\t\t\t    =========");
	        System.out.println("NOTE: Kindly Check Departure Flights Before Booking.");
	    	System.out.println("1. User Details");
			System.out.println("2. Check Departure Flights");
			System.out.println("3. Book a Flight");
			System.out.println("4. Check Booked Flight Details");
			System.out.println("5. Update Booked Flight");
			System.out.println("6. Cancel Booked Flight");
			System.out.println("7. Logout");
	
			System.out.print("Enter Your Choice: ");		
			int choice;
			Scanner choiceScanner = new Scanner(System.in);
			choice = choiceScanner.nextInt();
			
			if(choice == 1) {
				UserDetails();
			}
			else if(choice == 2) {
				CheckDepFilghts();
			}
			else if(choice == 3) {
				BookFlight();
			}
			else if(choice == 4) {
				CheckBookedFlight();
			}
			else if(choice == 5) {
				UpdateBookedFlight();
			}
			else if(choice == 6) {
				CancelBookedFLight();
			}
			else if(choice == 7){
				Logout();
			}
		}
    }
    
    public void UserDetails() {
    	System.out.println("\t\t\t    ============");
    	System.out.println("\t\t\t    USER DETAILS");
    	System.out.println("\t\t\t    ============");
    	
        System.out.println("Name: " + getName());
        System.out.println("Passport Number: " + getPassportNo());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Country: " + getCountry());
        System.out.println("Phone Number: " + getPhoneNo());
        System.out.println("Email: " + getEmailID());
        System.out.println("Date of Birth: " + getDOB());
        System.out.println("Username: " + getUserName());
        System.out.println("Password: " + getPassword());
    }
    
    public void CheckDepFilghts() {
    	System.out.println("\t\t    =======================");
    	System.out.println("\t\t    CHECK DEPARTURE FLIGHTS");
    	System.out.println("\t\t    =======================");
    	
    	for(int i = 0;i < 10;i++) {
	    	System.out.print((i+1) + ". Flight Number: " + flightNoArray[i] 
	    			+ "\n\tDate: " + flightDateArray[i] 
	    			+ "\n\tDeparture Airport: " + flightDepAirport[i]
	    			+ "\n\tArrival Airport: " + flightArrivalAirport[i]
	    			+ "\n\tDeparture Time: " + flightDepTime[i]
	    			+ "\n\tArrival Time: " + flightArrivalTime[i]
	    			+ "\n\tStatus: " + flightStatus[i]);
	    	System.out.println("\n");
    	}
	}
    
    public void BookFlight() {
    	System.out.println("\t\t\t  =============");
    	System.out.println("\t\t\t  BOOK A FLIGHT");
    	System.out.println("\t\t\t  =============");
		
    	System.out.print("=> Enter Arrival Airport: ");
		Scanner arrivalPlaceScanner = new Scanner(System.in);
		String arrivalPlace = arrivalPlaceScanner.nextLine();
		for(int i = 0;i < flightArrivalAirport.length;i++) {
			if(flightArrivalAirport[i].equals(arrivalPlace)) {
				System.out.print("Flight Number: " + flightNoArray[i] 
		    			+ "\n\tDate: " + flightDateArray[i] 
		    			+ "\n\tDeparture Airport: " + flightDepAirport[i]
		    			+ "\n\tArrival Airport: " + flightArrivalAirport[i]
		    			+ "\n\tDeparture Time: " + flightDepTime[i]
		    			+ "\n\tArrival Time: " + flightArrivalTime[i]
		    			+ "\n\tStatus: " + flightStatus[i]);
		    	System.out.println("\n");
			}
//			else {
//				System.out.println("NO FLIGHT AVAILABLE FOR " + arrivalPlace);
//				break;
//			}
		}
		System.out.print("=> Enter Flight Number: ");
		String flightNo = arrivalPlaceScanner.nextLine();
		for(int j = 0;j < flightNoArray.length;j++) {
			if(flightNoArray[j].equals(flightNo)) {
				System.out.print("=> Enter Class You Want To Travel From (Economy or Business): ");
				Scanner travelClassScanner = new Scanner(System.in);
				String travelClass = travelClassScanner.next();
				System.out.println("CONGRADULATIONS! YOUR FLIGHT TO " + arrivalPlace + " HAS BEEN BOOKED! HAVE A SAFE JOURNEY!");
				System.out.print("\n=> Do You Want To Print The Ticket of Booked Flight? (YES/NO): ");
				Scanner choiceScanner = new Scanner(System.in);
				String choice = choiceScanner.next();
				switch(choice) {
					case "Yes":
					case "YES":
					case "yes":
						try {
							File flightSlip = new File("Booked Flight Ticket.txt");
							flightSlip.delete();	
							if (flightSlip.createNewFile()) {
								FileWriter writer = new FileWriter("Booked Flight Ticket.txt");
								writer.write("USER DETAILS\n"
						    					+ "============\n"
						    					+ "Name: " + getName()
										        + "\nPassport Number: " + getPassportNo()
										        + "\nGender: " + getGender()
										        + "\nAge: " + getAge()
										        + "\nAddress: " + getAddress()
										        + "\nCountry: " + getCountry()
										        + "\nPhone Number: " + getPhoneNo()
										        + "\nEmail: " + getEmailID()
										        + "\nDate of Birth: " + getDOB()
										        + "\n\nBOOKED FLIGHT DETAILS\n"
												+ "=====================\n"
												+ "Flight Number: " + flightNoArray[j] 
						    					+ "\n\tDate: " + flightDateArray[j] 
								    			+ "\n\tDeparture Airport: " + flightDepAirport[j]
								    			+ "\n\tArrival Airport: " + flightArrivalAirport[j]
								    			+ "\n\tDeparture Time: " + flightDepTime[j]
								    			+ "\n\tArrival Time: " + flightArrivalTime[j]
								    			+ "\n\tStatus: " + flightStatus[j]
								    			+ "\n\tTicket Number: " + getPassportNo() + flightNoArray[j]
						    					+ "\n\tClass: " + travelClass);
								writer.close();
								System.out.println("SUCCESSFULLY TICKET IS PRINTED!");
							}
						} 
						catch (IOException e) {
							System.out.println("AN ERROR OCCURED!");
						}
						break;
					case "No":
					case "NO":
					case "no":
						break;
					default:
						System.out.println("INVALID CHOICE! BY DEFAULT TICKET IS PRINTED!");
						break;
				}
			}
		}
	}
    
    public void CheckBookedFlight() {
    	System.out.println("\t\t    ===========================");
    	System.out.println("\t\t    CHECK BOOKED FLIGHT DETAILS");
    	System.out.println("\t\t    ===========================");
    	
    	try {
    		File flightSlip = new File("Booked Flight Ticket.txt");
    		Scanner fileReader = new Scanner(flightSlip);
    		while (fileReader.hasNextLine()) {
    			String fileData = fileReader.nextLine();
    			System.out.println(fileData);
    		}
    		fileReader.close();
    	} 
    	catch (FileNotFoundException e) {
    		System.out.println("AN ERROR OCCURED!");
    	}
	}
    
    public void UpdateBookedFlight() {
		System.out.println("\t\t\t====================");
		System.out.println("\t\t\tUPDATE BOOKED FLIGHT");
		System.out.println("\t\t\t====================");
		System.out.println("Your Current Flight is: ");
		
		try {
    		File flightSlip = new File("Booked Flight Ticket.txt");
    		Scanner fileReader = new Scanner(flightSlip);
    		while (fileReader.hasNextLine()) {
    			String fileData = fileReader.nextLine();
    			System.out.println(fileData);
    		}
    		fileReader.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("AN ERROR OCCURED!");
    	}
		
		System.out.println("What Do You Want To Change?");
		System.out.println("===========================");
		System.out.println("1. Arrival Airport");
		System.out.println("2. No Changes To My Current Flight");
		Scanner choiceScanner = new Scanner(System.in);
		int choice = choiceScanner.nextInt();
		
		if(choice == 1) {
			System.out.print("=> Are You Sure You Want To Change Your Arrival Airport? (YES/NO): ");
			String airportChangeChoice = choiceScanner.next();
			switch(airportChangeChoice) {
				case "YES":
				case "Yes":
				case "yes":
					BookFlight();
					break;
				case "NO":
				case "No":
				case "no":
					System.out.println("NO CHANGES OCCURED!");
					break;
				default:
					System.out.println("INVALID CHOICE! BY DEFAULT NO CHANGES OCCURED!");
					break;
			}
		}
		else if(choice == 2) {
			System.out.println("NO CHANGES MADE!\n");
			UserMenu();
		}
	}
    
    public void CancelBookedFLight() {
    	System.out.println("\t\t=================================");
    	System.out.println("\t\tDO YOU WANT TO CANCEL THE FLIGHT?");
    	System.out.println("\t\t=================================");
    	
    	try {
    		File flightSlip = new File("Booked Flight Ticket.txt");
    		Scanner fileReader = new Scanner(flightSlip);
    		while (fileReader.hasNextLine()) {
    			String fileData = fileReader.nextLine();
    			System.out.println(fileData);
    		}
    		fileReader.close();
    	} 
    	catch (FileNotFoundException e) {
    		System.out.println("AN ERROR OCCURED!");
    	}
    	
    	System.out.print("=> Enter Your Choice (YES/NO): ");
    	Scanner choiceScanner = new Scanner(System.in);
    	String choice = choiceScanner.next();
		switch(choice) {
			case "Yes":
			case "YES":
			case "yes":
				File flightSlip = new File("Booked Flight Ticket.txt");
				flightSlip.delete();
				System.out.println("YOUR FLIGHT HAS BEEN CANCELLED!");
				break;
			case "No":
			case "NO":
			case "no":
				break;
			default:
				System.out.println("INVALID CHOICE! BY DEFAULT FLIGHT IS NOT CANCELLED!");
				break;
		}
	}
    
    public void Logout() {
    	System.out.println("SUCCESSFULLY LOGGED OUT!");
		LoginSignUpClass loginSignUpClassObj = new LoginSignUpClass();
		loginSignUpClassObj.LoginSignUpMenu();
	}
    
    public void SearchUserPassFromArray() {
    	String userKey = getUserName();
    	String passKey = getPassword();
		for(int i = 0;i < userNameArray.length;i++) { 
			for(int j = 0;j < passwordArray.length;j++) {
				if(i == j) {
		            if (userNameArray[i] == userKey && passwordArray[j] == passKey) {
		            	UserMenu();
		            }
		            else {
		    			System.out.println("\nINVALID USERNAME OR PASSWORD!\n");
		    			LoginSignUpClass loginSignUpClassObj = new LoginSignUpClass();
		    			loginSignUpClassObj.LoginSignUpMenu();
		    		}
				}
			}
        }
	}
    
    public void PushDataIntoArray() {
		for(int i = 0;i < nameArray.length;i++) {
			if(nameArray[i] == null) {
				nameArray[i] = getName();
				break;
			}
		}
		for(int i = 0;i < ageArray.length;i++) {
			if(ageArray[i] == 0) {
				ageArray[i] = getAge();
				break;
			}
		}
		for(int i = 0;i < addressArray.length;i++) {
			if(addressArray[i] == null) {
				addressArray[i] = getAddress();
				break;
			}
		}
		for(int i = 0;i < emailIDArray.length;i++) {
			if(emailIDArray[i] == null) {
				emailIDArray[i] = getEmailID();
				break;
			}
		}
		for(int i = 0;i < DOBArray.length;i++) {
			if(DOBArray[i] == null) {
				DOBArray[i] = getDOB();
				break;
			}
		}
		for(int i = 0;i < userNameArray.length;i++) {
			if(userNameArray[i] == null) {
				userNameArray[i] = getUserName();
				break;
			}
		}
		for(int i = 0;i < passwordArray.length;i++) {
			if(passwordArray[i] == null) {
				passwordArray[i] = getPassword();
				break;
			}
		}
		for(int i = 0;i < genderArray.length;i++) {
			if(genderArray[i] == null) {
				genderArray[i] = getGender();
				break;
			}
		}
		for(int i = 0;i < countryArray.length;i++) {
			if(countryArray[i] == null) {
				countryArray[i] = getCountry();
				break;
			}
		}
		for(int i = 0;i < phoneNoArray.length;i++) {
			if(phoneNoArray[i] == 0) {
				phoneNoArray[i] = getPhoneNo();
				break;
			}
		}
		for(int i = 0;i < passportNoArray.length;i++) {
			if(passportNoArray[i] == 0) {
				passportNoArray[i] = getPassportNo();
				break;
			}
		}
	}
    
    // GETTERS AND SETTERS    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public long getPassportNo() {
        return passportNo;
    }
    public void setPassportNo(long passportNo) {
        this.passportNo = passportNo;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
