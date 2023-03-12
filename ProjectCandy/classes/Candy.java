package classes;

import java.lang.*;


import interfaces.CandyCounter;


public abstract class Candy implements CandyCounter{
    
        private String CandyOrdrNum;
	private double CandyQuantity;
	private CandyDealer dealer;
	
	public Candy(){ }
	public Candy(String CandyOrdrNum, CandyDealer dealer, double CandyQuantity)
	{
		this.CandyOrdrNum = CandyOrdrNum;
		this.dealer = dealer;
		this.CandyQuantity = CandyQuantity;
	}
	
	public void setCandyOrdrNum(String CandyOrdrNum){ this.CandyOrdrNum = CandyOrdrNum; }
	public void setCandyDealer(CandyDealer dealer){	this.dealer = dealer;}
	public void setCandyQuantity(double balance){	this.CandyQuantity = CandyQuantity;	}
	
	public String getCandyOrdrNum(){	        return CandyOrdrNum;}
	public CandyDealer getdealer(){ 	return dealer;}
	public double getCandyQuantity(){	return CandyQuantity;}
	
	public abstract void showDetails();
	
	public boolean CandyPoduction(double amount)
	{
		if(amount>0)
		{
			CandyQuantity = CandyQuantity + amount;
			return true;
		}
		return false;
	}
	public boolean CandySellAmount(double amount)
	{
		if(amount>0 && amount<= CandyQuantity)
		{
			CandyQuantity = CandyQuantity - amount;
			return true;
		}
		return false;
	}
}
