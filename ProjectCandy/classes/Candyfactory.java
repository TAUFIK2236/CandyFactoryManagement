package classes;

import java.lang.*;
import interfaces.*;

public class Candyfactory implements CandyOperation, CandyMakerOperation, CandyDealerOperation{
  private String name;
	private String Sector;
	private Candy Candies[] = new  Candy [1000];
	private CandyDealer dealers[] = new CandyDealer [500];
	private CandyMaker candyMakers[] = new CandyMaker [100];
	
	public Candyfactory(){}
	public Candyfactory(String name, String Sector)
	{
		this.name = name;
		this.Sector = Sector;
	}
	
	public void setName(String name){this.name = name;}
	public void setScetor(String Sector){this.Sector = Sector;}
	
	public String getName(){return name;}
	public String getSector(){return Sector;}

	public boolean CandyOrder(Candy a)
	{
		for(int i=0; i<Candies.length; i++)
		{
			if(Candies[i] == null)
			{
				Candies[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean CancelOrder(Candy a)
	{
		for(int i=0; i<Candies.length; i++)
		{
			if(Candies[i] == a)
			{
				Candies[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Candy searchOrder(String CandyOrdrNum)
	{
		for(int i=0; i<Candies.length; i++)
		{
			if(Candies[i] != null)
			{
				if(Candies[i].getCandyOrdrNum().equals(CandyOrdrNum))
				{
					return Candies[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCandyOrder()
	{
		for(int i=0; i<Candies.length; i++)
		{
			if(Candies[i] != null)
			{
				//Candies[i].showDetails();
			}
		}
	}
	
	
	public boolean insertCandyDealer(CandyDealer c)
	{
		for(int i=0; i<dealers.length; i++)
		{
			if(dealers[i] == null)
			{
				dealers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCandyDealer(CandyDealer c)
	{
		for(int i=0; i<dealers.length; i++)
		{
			if(dealers[i] == c)
			{
				dealers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public CandyDealer searchCandyDealer(int ID)
	{
		for(int i=0; i<dealers.length; i++)
		{
			if(dealers[i] != null)
			{
				if(dealers[i].getID() == ID)
				{
					return dealers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCandyDealer()
	{
		for(int i=0; i<dealers.length; i++)
		{
			if(dealers[i] != null)
			{
				dealers[i].showDetails();
			}
		}
	}
	
	public boolean insertCandyMaker(CandyMaker e)
	{
		for(int i=0; i<candyMakers.length; i++)
		{
			if(candyMakers[i] == null)
			{
				candyMakers[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCandyMaker(CandyMaker e)
	{
		for(int i=0; i<candyMakers.length; i++)
		{
			if(candyMakers[i] == e)
			{
				candyMakers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public CandyMaker searchCandyMaker(String Id)
	{
		for(int i=0; i<candyMakers.length; i++)
		{
			if(candyMakers[i] != null)
			{
				if(candyMakers[i].getSerialNumber().equals(Id))
				{
					return candyMakers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCandyMakers()
	{
		for(int i=0; i<candyMakers.length; i++)
		{
			if(candyMakers[i] != null)
			{
				candyMakers[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("**** Candy Factory Information ****");
		System.out.println("Factory Name: " + name);
		System.out.println("Candy factory Sector: " + Sector);
		System.out.println("//////////////////////////////////");
		System.out.println("### Candy Order ###");
		this.showAllCandyOrder();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Candy Maker ###");
		this.showAllCandyMakers();
		System.out.println("//////////////////////////////////");
		
	}	  

   
}
