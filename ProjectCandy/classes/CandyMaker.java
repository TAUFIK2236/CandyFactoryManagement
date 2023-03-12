package classes;
import java.lang.*;

public class CandyMaker {
        private String SerialNumber;
	private String name;
	private double Credit;
	
	public void setSerialNumber(String SerialNumber){this.SerialNumber = SerialNumber;}
	public void setName(String name){this.name = name;}
	public void setCredit(double Credit){this.Credit = Credit;}
	
	public String getSerialNumber(){return SerialNumber;} 
	public String getName(){return name;}
	public double getCredit(){return Credit;} 
	
	public void showDetails()
	{
		System.out.println("Candy Maker Serial Number: " + SerialNumber);
		System.out.println("Candy Maker Name: " + name);
		System.out.println("Candy Maker Credit: " + Credit);
		System.out.println();
	}  
}