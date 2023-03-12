package classes;
import java.lang.*;

public class CandyDealer {
   
	private int ID;
	private String name;
	private String phoneNumber;
	
	public void setiID(int ID){this.ID = ID;}
	public void setName(String name){this.name = name;}
	public void setPhoneNumber(String phnNumber){this.phoneNumber = phoneNumber;}
	
	public int getID(){return ID;}
	public String getName(){return name;}
	public String getPhoneNumber(){return phoneNumber;}
	
	public void showDetails()
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Candy Dealer ID: " + ID);
		System.out.println("Candy Dealer Name: " + name);
		System.out.println("Candy Dealer Number: " + phoneNumber);
		System.out.println();
	}
}