
import java.io.*;
/**
 * This program run a test of Coin class and out put is written 
 * on a File coinDemo.txt
*/

public class Demo 
    {
    public static void main(String[] args) throws IOException
    {
        int tailCount = 0; //to hold number of times tail appeared in toss
        int headCount = 0; // to hold number of times head appeared
                   
        //creating a coin object
        Coin coinToss1 = new Coin();
        //calling method to perform toss    
        coinToss1.tossNow();
        
        //creating object of the printWriter class.
        //creating new file coinDemo.txt to save output
        PrintWriter outputFile = new PrintWriter("CoinDemo.txt");
        //to make output pretty
        outputFile.println("\n *****************************");
        //showing the toss result
        outputFile.println(" ** OUTPUT from getSideUp method ** ");
           
        outputFile.println("Random Toss result: " + coinToss1.getSideUp());
        //showing the total no off tosses
        outputFile.println("from total number of tosses: " + coinToss1.getTotalTosses());

        //to make output pretty
        outputFile.println("\n *****************************");
        outputFile.println(" ** OUTPUT from the 50 times loop ** ");
    
         //loop to perform 50 tosses
           
        for(int i = 0; i<50; i++)
        {
            coinToss1.tossNow();
            if (coinToss1.getSideUp() == "Heads")//comparing tossresult to count no of timess
                                                  //head appeared or tail appeared
            {
                headCount += 1;
            }
            else
            {
                tailCount += 1;
            }

            outputFile.println(" " + coinToss1.getSideUp() + "\t [ " + headCount + " , " + tailCount + "]");
                 
                   
        }
               
       // calculating head count and tail count percentages
        int headPerc = 0;//stores head appearance percentage
        int tailPerc = 0;//stores tail appearnces percentage

        headPerc = headCount*100/ 50 ; //calculating percentage
        tailPerc = tailCount*100 /50 ;

               
        outputFile.println("Out of 50 tosses: Heads = " + headPerc + "%\t Tails = " + tailPerc + "%");
                
        //writing in a file
        outputFile.close();
        System.out.println("** Date written in file. File closed. ");
    }
    
}
