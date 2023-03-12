package interfaces;
import java.lang.*;
import classes.CandyMaker;

public interface CandyMakerOperation {
 boolean insertCandyMaker(CandyMaker e);
	boolean removeCandyMaker(CandyMaker e);
	CandyMaker searchCandyMaker(String Id);
	void showAllCandyMakers();   
}
