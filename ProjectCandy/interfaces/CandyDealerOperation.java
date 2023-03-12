package interfaces;
import java.lang.*;
import classes.CandyDealer;

public interface CandyDealerOperation {
    boolean insertCandyDealer(CandyDealer c);
	boolean removeCandyDealer(CandyDealer c);
	 CandyDealer searchCandyDealer(int ID);
	void showAllCandyDealer();
    
}
