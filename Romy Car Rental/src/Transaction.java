import java.util.*;
import java.io.*;

public class Transaction {

	final static int MONTHS_DAYS = 30, MONTHS = 12; //lets assume that 30 is one month for every month in this program
	private Customer aCustomer; //from the Customer class in same directory
	private Car aCar; //frm the Customer class in same directory
	private int monthe = 0, days = 0;
	
	private String CurrentMonth;
	private int CurrentDate, Currentyear;
	
	private String PickMonth;
	private int PickDate, PickYear;
	
	private String returnMonth;
	private int returnDate, returnYear;
	
	private String birthMonth;
	private int birthDate, birthYear, age = 0;
		
	public Transaction() { //constructor
		aCustomer = new Customer();
		aCar = new Car();
		CurrentMonth = "";
		CurrentDate = 0;
		Currentyear = 0;
		PickMonth = "";
		PickDate = 0;
		PickYear = 0;
		returnMonth = "";
		returnDate = 0;
		returnYear = 0;
		birthMonth = "";
		birthDate = 0;
		birthYear = 0;
 	}
	
	public void setTransaction(Customer cU, Car cA, String m, int d, int y, String pM, int pD, int pY, String rM, int rD, int rY, String bM, int bD, int bY) { //constructor
		aCustomer = cU;
		aCar = cA;
		CurrentMonth = m;
		CurrentDate = d;
		Currentyear = y;
		PickMonth = pM;
		PickDate = pD;
		PickYear = pY;
		returnMonth = rM;
		returnDate = rD;
		returnYear = rY;
		birthMonth = bM;
		birthDate = bD;
		birthYear = bY;
	}
	
	public String getCurrentMonth() { 
		return CurrentMonth;
	}
	
	public int getCurrentDate() { 
		return CurrentDate;
	}
	
	public int getCurrentYear() { 
		return Currentyear;
	}
////////////////////////////////////////////getting the value of current month/////////////////
	public int getCurrentMonthValue() {
		if(getCurrentMonth().equals("Jan"))
			monthe = 1;
		
		else if(getCurrentMonth().equals("Feb"))
			monthe = 2;
		
		else if(getCurrentMonth().equals("Mar"))
			monthe = 3;
		
		else if(getCurrentMonth().equals("Apr"))
			monthe = 4;
		
		else if(getCurrentMonth().equals("May"))
			monthe = 5;
		
		else if(getCurrentMonth().equals("Jun"))
			monthe = 6;
		
		else if(getCurrentMonth().equals("Jul"))
			monthe = 7;
		
		else if(getCurrentMonth().equals("Aug"))
			monthe = 8;		
		
		else if(getCurrentMonth().equals("Sep"))
			monthe = 9;
			
		else if(getCurrentMonth().equals("Oct"))
			monthe = 10;
			
		else if(getCurrentMonth().equals("Nov"))
			monthe = 11;
			
		else if(getCurrentMonth().equals("Dec"))
			monthe = 12;
		
		return monthe;
	}
	
	public String getPickMonth() { 
		return PickMonth;
	}
	
	public int  getPickDate() {
		return PickDate;
	}
	
	public int getPickYear() {
		return PickYear;
	}
	
//////////////////////////////////////getting the value of pick up month///////////////////////////
	public int getPickMonthValue() {
		if(getPickMonth().equals("Jan"))
			monthe = 1;
		
		else if(getPickMonth().equals("Feb"))
			monthe = 2;
		
		else if(getPickMonth().equals("Mar"))
			monthe = 3;
		
		else if(getPickMonth().equals("Apr"))
			monthe = 4;
		
		else if(getPickMonth().equals("May"))
			monthe = 5;
		
		else if(getPickMonth().equals("Jun"))
			monthe = 6;
		
		else if(getPickMonth().equals("Jul"))
			monthe = 7;
		
		else if(getPickMonth().equals("Aug"))
			monthe = 8;		
		
		else if(getPickMonth().equals("Sep"))
			monthe = 9;
			
		else if(getPickMonth().equals("Oct"))
			monthe = 10;
			
		else if(getPickMonth().equals("Nov"))
			monthe = 11;
			
		else if(getPickMonth().equals("Dec"))
			monthe = 12;
		
		return monthe;
	}
	
	public String getReturnMonth() {
		return returnMonth;
	}
	
	public int getReturnDate() { 
		return returnDate;
	}
	
	public int getReturnYear() { 
		return returnYear;
	}
	
/////////////////////////////////getting the value of return month////////////////////////////
	public int getReturnMonthValue() {
		if(getReturnMonth().equals("Jan"))
			monthe = 1;
		
		else if(getReturnMonth().equals("Feb"))
			monthe = 2;
		
		else if(getReturnMonth().equals("Mar"))
			monthe = 3;
		
		else if(getReturnMonth().equals("Apr"))
			monthe = 4;
		
		else if(getReturnMonth().equals("May"))
			monthe = 5;
		
		else if(getReturnMonth().equals("Jun"))
			monthe = 6;
		
		else if(getReturnMonth().equals("Jul"))
			monthe = 7;
		
		else if(getReturnMonth().equals("Aug"))
			monthe = 8;		
		
		else if(getReturnMonth().equals("Sep"))
			monthe = 9;
			
		else if(getReturnMonth().equals("Oct"))
			monthe = 10;
			
		else if(getReturnMonth().equals("Nov"))
			monthe = 11;
			
		else if(getReturnMonth().equals("Dec"))
			monthe = 12;
		
		return monthe;
	}
	
	public String getBirthMonth() { 
		return birthMonth;
	}
	
	public int getBirthDate() { 
		return birthDate;
	}
	
	public int getBirthYear() { 
		return birthYear;
	}

//////////////////////////////////////getting the value of birth month////////////////////////////
	public int getBirthMonthValue() { 
		if(getBirthMonth().equals("Jan"))
			monthe = 1;
		
		else if(getBirthMonth().equals("Feb"))
			monthe = 2;
		
		else if(getBirthMonth().equals("Mar"))
			monthe = 3;
		
		else if(getBirthMonth().equals("Apr"))
			monthe = 4;
		
		else if(getBirthMonth().equals("May"))
			monthe = 5;
		
		else if(getBirthMonth().equals("Jun"))
			monthe = 6;
		
		else if(getBirthMonth().equals("Jul"))
			monthe = 7;
		
		else if(getBirthMonth().equals("Aug"))
			monthe = 8;		
		
		else if(getBirthMonth().equals("Sep"))
			monthe = 9;
			
		else if(getBirthMonth().equals("Oct"))
			monthe = 10;
			
		else if(getBirthMonth().equals("Nov"))
			monthe = 11;
			
		else if(getBirthMonth().equals("Dec"))
			monthe = 12;
		
		return monthe;
	}

//////////////////////////////////////////////getting the age///////////////////////////////////
	public int getAge(){ 
		
		int age = 0;
		if((getCurrentYear() > getBirthYear())&&(getCurrentMonthValue() == getBirthMonthValue())) {
            if(getCurrentDate() == getBirthDate())
				age = getCurrentYear() - getBirthYear();
			
            else if(getCurrentDate() < getBirthDate())
				age = getCurrentYear() - getBirthYear();
			
            else if(getCurrentDate() > getBirthDate())
				age = (getCurrentYear() - 1) - getBirthYear();
        }
		
		else if((getCurrentYear() > getBirthYear())&&(getCurrentMonthValue() > getBirthMonthValue()))
            age = getCurrentYear() - getBirthYear();
		
		else if((getCurrentYear() > getBirthYear())&&(getCurrentMonthValue() < getBirthMonthValue()))
			age = (getCurrentYear() - 1) - getBirthYear();
			
		return age;
	}

///////////////////////for getting How many days Car has been rented/////////////////
	public int getDays(){
		
		int totalMonth = 0, totalYear = 0;
		
		if((getPickYear() == getReturnYear()) && (getPickMonthValue() == getReturnMonthValue())) {
			if(getPickDate() == getReturnDate())
				days = 0;
			else if(getPickDate() < getReturnDate())
				days = getReturnDate() - getPickDate();
		}
		
		else if((getPickYear() == getReturnYear()) && (getPickMonthValue() < getReturnMonthValue())) {
			if(getPickDate() == getReturnDate()) {
				totalMonth = getReturnMonthValue() - getPickMonthValue();
				days = totalMonth * MONTHS_DAYS;
			}
			else if(getPickDate() < getReturnDate()) {
				totalMonth = getReturnMonthValue() - getPickMonthValue();
				days = (totalMonth * MONTHS_DAYS) + (getReturnDate() - getPickDate());
			}
		}
		
		else if(getPickYear() < getReturnYear()) {
			if(getPickMonthValue() == getReturnMonthValue()) {
				totalYear = getReturnYear() - getPickYear();
				days = ((totalYear * MONTHS) * MONTHS_DAYS) + (getReturnDate() - getPickDate());
			}
			
			else if(getPickMonthValue() < getReturnMonthValue()) {
				totalMonth = getReturnMonthValue() - getPickMonthValue(); 
				days = ((totalMonth + MONTHS) * MONTHS_DAYS) + (getReturnDate() - getPickDate());
			}
			
			else if(getPickMonthValue() > getReturnMonthValue()) { //kani mali
				totalMonth = MONTHS - (getPickMonthValue() - getReturnMonthValue());
				days = (totalMonth * 30) + (getReturnDate() - getPickDate());
			}
		}
		
		return days;
	}
	
///////////////////////////to get the total Rental price/////////////////////////////////
	public double getRentalPrice() {
		
		return getDays() * aCar.getCarPrice();
	}
	
//////////////////////////////////////change to String for checking the date////////////////////////
	public String toStringDateChecker() {
		String outpot = "";
		
		if((getPickMonthValue() > getReturnMonthValue()) && (getPickYear() == getReturnYear())) 
			outpot += String.format("FALSE");
		
		if((getPickMonthValue() == getReturnMonthValue()) && (getPickDate() > getReturnDate()) && (getPickYear() == getReturnYear()))
			outpot += String.format("FALSE");
		
		if(getPickYear() > getReturnYear())
			outpot += String.format("FALSE");
		
		else
			outpot += String.format("TRUE");

		return outpot;
	}
	
//////////////////////////////////////////change to String for checking the age of customer/////////////////////
	public String toStringAgeChecker() {
		String outfut = "";
		
		if(getAge() >= 20)
			outfut += String.format("TRUE");
			
		else if(getAge() < 20)
			outfut += String.format("FALSE");
			
		return outfut;
	}

//////////////////////////////(int)age to (String)age to print in GUI/////////////////////
	public String toStringAge() {
		String output = "";
		output += String.format("%d", getAge()); 
		return output;
	}
	
/////////////////////////////////Status and Gender cheking , "mr/mrs"///////////////////////////////////
	public String toStringMrMrs() {
		String outfowt = "";
		
		if(aCustomer.getGender().equals("M") || aCustomer.getGender().equals("m"))
			outfowt += String.format("Mr.");
		
		else if((aCustomer.getStatus().equals("S") || aCustomer.getStatus().equals("s")) && aCustomer.getGender().equals("F") || aCustomer.getGender().equals("f"))
			outfowt += String.format("Ms.");
	
		else if((aCustomer.getStatus().equals("Ma") || aCustomer.getStatus().equals("ma")) && aCustomer.getGender().equals("F") || aCustomer.getGender().equals("f"))
			outfowt += String.format("Mrs.");
			
		return outfowt;
	}
	
//////////////////////////////////////////show all for customer///////////////////////////////////
	public String toStringReceipt() {
		String outMe = "";
		
		//outMe += String.format(toStringMrMrs() + aCustomer.getFullName()); 
		outMe += String.format("               	             Romy's Car Rental\n");
		outMe += String.format("                              Owned & Operated By:\n");
		outMe += String.format("                                      Romy Carillio\n");
		outMe += String.format("                             RENTAL TRANSACTION\n");
		outMe += String.format("-----------------------------------------------------------------------------------------------------\n");
		outMe += String.format("Car                                                        %s\n", aCar.getCar());
		outMe += String.format("Rental Days                                                %d\n", getDays());
		outMe += String.format("Rental Price                                               %.2f\n", aCar.getCarPrice());
		outMe += String.format("                                                           --------------\n");
		outMe += String.format("Total Payment                                              %.2f\n",getRentalPrice());
		outMe += String.format(toStringMrMrs() + aCustomer.getFullName());
		return outMe;
	}
	
////////////////////////////////////////////save all data to .txt file for the Owner//////////////////////////////
	public void saveToFile() throws IOException {
	
	PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Transactions_Inventory.txt"), true));
        outFile.println("Current Date: " + getCurrentMonth() + " " + getCurrentDate() + ", " + getCurrentYear());
		outFile.println(" ");
		outFile.println("Pick up Date: " + getPickMonth() + " " + getPickDate() + ", " + getPickYear());
		outFile.println("Return Date: " + getReturnMonth() + " " + getReturnDate() + ", " + getReturnYear()  + " = Days: " + getDays());
		outFile.println("Full Name: " + aCustomer.getFullName());
		outFile.println("Age: " + getAge());
		outFile.println("Location: " + aCustomer.getLocation());
		outFile.println("Contact: " + aCustomer.getContact());
		outFile.println("Car: " + aCar.getCar());
		outFile.printf("Total Rent Price: %.2f", + getRentalPrice());
		outFile.println(" ");
		outFile.println("--------------------------------------------------");
        outFile.close();
     }
}