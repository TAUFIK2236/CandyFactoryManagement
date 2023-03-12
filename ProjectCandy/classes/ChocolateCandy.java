package classes;

import java.lang.*;

public class ChocolateCandy extends Candy{
    private String Flavor;
	
	public ChocolateCandy(){}
	public ChocolateCandy(String CandyOrdrNum, CandyDealer dealer, double CandyQuantity, String Flavor)
	{
		super(CandyOrdrNum, dealer, CandyQuantity);
		this.Flavor = Flavor;
	}
	
	public void setFlavor(String Flavor){this.Flavor = Flavor;}
	public String getFlavor(){return Flavor;}
	
	public void showDetails()
	{
		System.out.println("**** Chololate Candy Information ****");
		this.getdealer().showDetails();
		System.out.println("Candy Type: " + this.getdealer());
		System.out.println("Candy Quantity: " + this.getCandyQuantity());
		System.out.println("Candy Flavor: " + Flavor);
		System.out.println();
	} 
}