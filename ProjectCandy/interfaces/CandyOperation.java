package interfaces;
import java.lang.*;
import classes.Candy;

public interface  CandyOperation {
        boolean CandyOrder(Candy a);
	boolean CancelOrder(Candy a);
	Candy searchOrder(String CandyType);
	void  showAllCandyOrder();  
}