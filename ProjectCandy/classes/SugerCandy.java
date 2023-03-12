package classes;

import java.lang.*;

public class SugerCandy extends Candy{
   private int SweetnessLvl;
	
	public SugerCandy(){}
	public SugerCandy(String CandyOrdrNum, CandyDealer dealer, double CandyQuantity, int SweetnessLvl)
	{
		super(CandyOrdrNum, dealer, CandyQuantity);
		this.SweetnessLvl= SweetnessLvl;
	}
	
	public void setSweetnessLvl(int SweetnessLvl){this.SweetnessLvl = SweetnessLvl;}
	public int getSweetnessLvl(){return SweetnessLvl;}
	
	public void showDetails()
	{
		System.out.println("**** Suger Candy Information ****");
		this.getdealer().showDetails();
		System.out.println("Candy Type: " + this.getdealer());
		System.out.println("Candy Quantity: " + this.getCandyQuantity());
		System.out.println("Candy Flavor: " + SweetnessLvl);
		System.out.println();
	} 

   
}
