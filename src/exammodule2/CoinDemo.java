/**
 * This program runs a test of the Coin class
 * out put is on screen 
 * @author farahmahboob
 */
public class CoinDemo
{
	public static void main(String [] args)
	{
            int tailCount = 0; //to hold number of times tail appeared in toss
            int headCount = 0; // to hold number of times head appeared
                   
            //creating a coin object
            Coin coinToss1 = new Coin();
            //calling method to perform toss    
            coinToss1.tossNow();
           
            //to make output pretty
            System.out.println("\n *****************************");
            //showing the toss result
            System.out.println(" ** OUTPUT from getSideUp method ** ");
           
            System.out.println("Random Toss result: " + coinToss1.getSideUp());
            //showing the total no off tosses
            System.out.println("from total number of tosses: " + coinToss1.getTotalTosses());
		
            //to make output pretty
            System.out.println("\n *****************************");
            System.out.println(" ** OUTPUT from the 50 times loop ** ");
           
            //loop to perform 50 tosses
            for(int i = 0; i<50; i++)
                {
                    coinToss1.tossNow();//calling the tossNow method
                    if (coinToss1.getSideUp() == "Heads")//comparing tossresult to count no of timess
                    {                                    //head appeared or tail appeared
                        headCount += 1;
                    }
                    else
                    {
                        tailCount += 1;
                    }
                    //printing toss outcome
                    System.out.println(" " + coinToss1.getSideUp() + "\t [ " + headCount + " , " + tailCount + "]");
                 
                   
                }
                
                // calculating head count and tail count percentages
                int headPerc = 0;//stores head appearance percentage
                int tailPerc = 0;//stores tail appearnces percentage
             
                headPerc = headCount*100/ 50 ; //calculating percentage
                tailPerc = tailCount*100 /50 ;
               
                //percentage output
                System.out.println("Out of 50 tosses: Heads = " + headPerc + "%\t Tails = " + tailPerc + "%");
                
                
                
	}
}