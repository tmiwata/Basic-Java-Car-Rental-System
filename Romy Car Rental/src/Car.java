import java.util.*;
import java.io.*;

/////////////////////////////////////////////Car class/////////////////////////////////////
public class Car {

	private String carType, carModel;
	private double carPrice;
	
	public Car() {
	
		carType = "";
		carModel = "";
		carPrice = 0;
	}
	
	public void setCar(String cT, String cM, double cP){
		
		carType = cT;
		carModel = cM;
		carPrice = cP;	
	}
	
	public String getCarType() {
		return carType;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public String getCar() {
		return getCarType() + "-" + getCarModel();
	}
		
	public double getCarPrice() {
		return carPrice;
	}
	
//	public void saveToFile() throws IOException {
		
//		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Cars_Inventory.txt"), true));
//			outFile.println(getCar() + " " + getCarPrice());
//			outFile.close();
//  }
}