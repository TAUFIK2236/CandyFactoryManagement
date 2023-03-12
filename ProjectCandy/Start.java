import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Candyfactory b = new Candyfactory();
		b.setName("Mimi");
		b.setScetor("ACC12");
		
		System.out.println("------------------------------------");
		System.out.println("Mimi..We are sharing sweetness");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("Select your option for management\n");
		
			System.out.println("\t1. CandyMaker Management");
			System.out.println("\t2. Candy Dealer Management");
			System.out.println("\t3. Candy Management");
			System.out.println("\t4. Candy Counter");
			System.out.println("\t5. Show Factory Information");
			System.out.println("\t6. Exit");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your selection number: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You have selected CandyMaker Management");
					System.out.println("#####################################");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Join New Candy MAker");
					System.out.println("\t2. Fired Candy Maker");
					System.out.println("\t3. Find out CandyMaker");
					System.out.println("\t4. Show All CandyMaker");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("#####################################");
							System.out.println("You have selected Join CandyMaker");
							System.out.println("#####################################");
                                                        
                                                        System.out.print("Enter SerialNumber: ");
							String nid1 = sc.next();
							System.out.print("Enter CandyMaker Name: ");
							String name1 = sc.next();
							System.out.print("Enter candyMaker credit: ");
							double Credit1 = sc.nextDouble();
							
							CandyMaker c1 = new CandyMaker();
							c1.setSerialNumber(nid1);
							c1.setName(name1);
							c1.setCredit(Credit1);
							
							if(b.insertCandyMaker(c1))
							{
								System.out.println("***  Candy Maker Joined, Serial Number : " + c1.getSerialNumber() + "  ***");
							}
							else
							{
								System.out.println("***  CandyMaker NOT Joined, NID : " + c1.getSerialNumber() + "  ***");
							}
								
							
							
							break;
							
						case 2:
							
							System.out.println("#####################################");
							System.out.println("Your option for Fired a CandyMaker");
							System.out.println("#####################################");
							System.out.print("Enter the Serial Number to Fired a CandyMaker: ");
							String SerialNumder = sc.next();
							
							CandyMaker c2 = b.searchCandyMaker(SerialNumder);
							
							if(c2 != null)
							{
								System.out.println("***  CandyMaker Found  ***");
								
								if(b.removeCandyMaker(c2))
								{
									System.out.println("***  CandyMaker Fired,serial Number : " + c2.getSerialNumber() + "  ***");
								}
							}
							else
							{
								System.out.println("***  CandyMaker NOT Found and NOT Fired  ***");
							}
								
							break;
							
						case 3:
							
							System.out.println("#####################################");
							System.out.println("You have choosen Search CandyMaker");
							System.out.println("#####################################");
                                                        System.out.print("Enter the SerialNumber to search a CandyMaker: ");
							String Serial = sc.next();
							
							CandyMaker c3 = b.searchCandyMaker(Serial);
							
							if(c3 != null)
							{
								System.out.println("***  Candy Maker Found  ***");
								c3.showDetails();
							}
							else
							{
								System.out.println("***  CandyMaker Not Found  ***");
							}
							
							break;
							
							
							
						case 4:
						
							System.out.println("#####################################");
							System.out.println("You have selected Show All Candy Maker");
                                                        b.showDetails();//Taufik
							System.out.println("#####################################");
                                                        
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You have selected Customer Management");
					System.out.println("#####################################");
					
					System.out.println("Sir ,What Your Opinion  ?\n");
					
					System.out.println("\t1. Insert New CandyDealer");
					System.out.println("\t2. Kick out a CandyDealer");
					System.out.println("\t3. Find out  Candydealer");
					System.out.println("\t4. Deatails of all candy dealer");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("#####################################");
							System.out.println("You have selected Insert Candy dealer");
							System.out.println("#####################################");
							
							System.out.print("Enter Candy dealer ID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Candy dealer Name: ");
							String name1 = sc.next();
							System.out.print("Enter CandyDealer Phone Number: ");
							String phnNumber1 = sc.next();
							
							CandyDealer c1 = new CandyDealer();
							c1.setiID(nid1);
							c1.setName(name1);
							c1.setPhoneNumber(phnNumber1);
							
							if(b.insertCandyDealer(c1))
							{
								System.out.println("***  Candy Dealer Inserted, ID : " + c1.getID() + "  ***");
							}
							else
							{
								System.out.println("***  Candy Dealer NOT Inserted, ID : " + c1.getID() + "  ***");
							}
								
							break;
							
						case 2:
							
							System.out.println("#####################################");
							System.out.println("You have selected Kick out a CandyDealer");
							System.out.println("#####################################");
							
							System.out.print("Enter the ID to Kick out a Candy dealer: ");
							int id2 = sc.nextInt();
							
							CandyDealer c2 = b.searchCandyDealer(id2);
							
							if(c2 != null)
							{
								System.out.println("***  Candy dealer Found  ***");
								
								if(b.removeCandyDealer(c2))
								{
									System.out.println("***  Candy dealer Kicked out, ID : " + c2.getID() + "  ***");
								}
							}
							else
							{
								System.out.println("***  Candy Dealer NOT Found and NOT Kicked out  ***");
							}
								
							break;
							
						case 3:
							
							System.out.println("#####################################");
							System.out.println("You have selected Find out  Candydealer");
							System.out.println("#####################################");
							
							System.out.print("Enter the ID to Find out  Candydealer: ");
							int id3 = sc.nextInt();
							
							CandyDealer c3 = b.searchCandyDealer(id3);
							
							if(c3 != null)
							{
								System.out.println("***  Candy dealer Found  ***");
								c3.showDetails();
							}
							else
							{
								System.out.println("***  Candy dealer Not Found  ***");
							}
							
							break;
							
						case 4:
						
							System.out.println("#####################################");
							System.out.println("You have selected Deatails of all candy dealer");
							System.out.println("#####################################");
							
							b.showAllCandyDealer();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("#####################################");
					System.out.println("You have selected candy Management");//Candy Management
					System.out.println("#####################################");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Candy Order");
					System.out.println("\t2. Cancel Candy Order");
					System.out.println("\t3. Search Candy Order");
					System.out.println("\t4. Show All candy order");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("#####################################");
							System.out.println("You have selected Insert New candy dealer");
							System.out.println("#####################################");
							
							
							System.out.print("Enter the ID to verify a candy dealer: ");
							int nid1 = sc.nextInt();
							
							CandyDealer c1 = b.searchCandyDealer(nid1);
							
							if(c1 != null)
							{
								System.out.println("***  candy dealer Verified  ***");
								
								Candy a = null;
								
								System.out.println("Candy order numder");
								System.out.println("\t1. Suger Candy");
                                                                System.out.println("\t2. Chocolate Candy");
								System.out.println("\t3. Go Back");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter your Type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								if(type == 1)
								{
									System.out.print("Candy Order number: ");
									String an = sc.next();
									System.out.print("Enter Candy Quantity: ");
									double ba = sc.nextDouble();
									System.out.print("Enter Sweetness level: ");
									int ir = sc.nextInt();
									
									SugerCandy sa = new SugerCandy(an, c1/*candyDealer*/, ba, ir);
									a = sa;
									
								}
								else if(type == 2)
								{
									System.out.print("Candy order numder: ");
									String an = sc.next();
									System.out.print("Enter Candy Quantity: ");
									double ba = sc.nextDouble();
									System.out.print("Enter candy Flavor: ");
									String ty= sc.nextLine();
									
									
									ChocolateCandy fa = new ChocolateCandy (an, c1/*candyDealer*/, ba, ty);
									
									a = fa;
								}
								else if(type == 3)
								{
									System.out.println("#####################################");
									System.out.println("You have selected to Go Back....");
									System.out.println("#####################################");
								}
								else
								{									
									System.out.println("#####################################");
									System.out.println("Invalid Option... Going Back...");
									System.out.println("#####################################");
								}
								
								if(a!= null)
								{
									if(b. CandyOrder(a))
									{
										System.out.println("***  Candy order added, Candy Order number: " + a.getCandyOrdrNum() + "  ***");
									}
									else
									{
										System.out.println("***  Candy order Inserted, Candy Order Number: " + a.getCandyOrdrNum() + "  ***");
									}
								}	
							}
							else
							{
								System.out.println("***  Invalid CandyDealer... Can Not assign a order   ***");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("#####################################");
							System.out.println("You have selected Cancel Order");
							System.out.println("#####################################");
                                                        System.out.print("Enter the order numder to Cancel: ");
                                                       String Or2 = sc.next();
							
							Candy c4 = b.searchOrder(Or2);
							
							if(Or2 != null)
							{
								System.out.println("***  Candy order Found  ***");
								
							
								
								if(b.CancelOrder(c4))
								{
									System.out.println("***  Candy order cancel,Order Number : " + c4.getCandyOrdrNum() + "  ***");
								}
							}
							else
							{
								System.out.println("***  Candy order NOT Found and NOT cancelled  ***");
							}
							
                                           
							
						case 3:
							
							System.out.println("#####################################");
							System.out.println("You have selected Search Candy order");
							System.out.println("#####################################");
                                                         String Or3 = sc.next();
							
							Candy c3 = b.searchOrder(Or3);
							
							if(c3 != null)
							{
								System.out.println("***  Candy Order found ***");
								c3.showDetails();
							}
							else
							{
								System.out.println("***  Candy Order Not Found  ***");
							}
							
							break;
							
							
							
							
							
							
						case 4:
						
							System.out.println("#####################################");
							System.out.println("You have selected Show All candy Order");
							System.out.println("#####################################");
							
                                                        b.showAllCandyOrder();
							//b.showAllAccounts();
							
							break;
							
						case 5:
							
							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}
					
					
					break;
					
				case 4:
					
					System.out.println("################################################");
					System.out.println("You have selected Candy Counter Management");
					System.out.println("################################################");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Production Candy");
					System.out.println("\t2. Sell Candy");
					System.out.println("\t3. Candy Counter History");
					System.out.println("\t4. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("#####################################");
							System.out.println("You have selected Candy Production");
							System.out.println("#####################################");
							
							System.out.print("Enter Order Number for Order verification: ");
							String an1 = sc.next();
							
							Candy a1 = b.searchOrder(an1);
							
							if(a1 != null)
							{
								System.out.println("*** Order Found  ***");
								System.out.println("Candy order number: " + a1.getCandyOrdrNum());
								System.out.println("Candy dealer name: " + a1.getdealer().getName());
								
								System.out.println("Candy Stack: " + a1.getCandyQuantity());
								System.out.print("Candy Production Amount: ");
								double am = sc.nextDouble();
								
								if(a1.CandyPoduction(am))
								{
									System.out.println("--- Production added ---");
									System.out.println("New Amount of candy: " + a1.getCandyQuantity());
									frwd.writeInFile(am + " produced  in " + a1.getCandyQuantity());
								}
								else
								{
									System.out.println("---Production Failed ---");
								}
							}
							else
							{
								System.out.println("***  Invalid Order... Can NOT Production   ***");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("#####################################");
							System.out.println("You have selected Sell Candy");
							System.out.println("#####################################");
							
							System.out.print("Enter Order Number for Order verification: ");
							String an2 = sc.next();
							
							Candy a2 = b.searchOrder(an2);
							
							if(a2 != null)
							{
								System.out.println("*** Order Found  ***");
								System.out.println("Candy order number: " + a2.getCandyOrdrNum());
								System.out.println("Candy dealer Name: " + a2.getdealer().getName());
								
								System.out.println("stack candy: " + a2.getCandyQuantity());
								System.out.print("sell Amount: ");
								double am = sc.nextDouble();
								
								if(a2.CandySellAmount(am))
								{
									System.out.println("--- Sold!! ---");
									System.out.println("New Amount of candy: " + a2.getCandyQuantity());
									frwd.writeInFile(am + " Sold out from  " + a2.getCandyQuantity());
								}
								else
								{
									System.out.println("---Couldnt sell ---");
								}
							}
							else
							{
								System.out.println("***  Invalid Candy amount... Can NOT sell candy  ***");
							}
							
							break;
							
						case 3:
							
							System.out.println("#####################################");
							System.out.println("You have selected Candy counter History");
							System.out.println("#####################################");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
							
							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");
							
							break;
							
						default:
							
							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}
					
					break;
					
				case 5:
				
					System.out.println("#####################################");
					b.showDetails();
					System.out.println("#####################################");
					
					break;
					
				case 6:
					
					repeat = false;
					System.out.println("#####################################");
					System.out.println("Thank You for using our Candy Factory Application");
					System.out.println("#####################################");
					
					break;
				
				default:
					
					System.out.println("###############################");
					System.out.println("Invalid Choice... Try Again....");
					System.out.println("###############################");
					
					break;
			}
		}		
	}
}