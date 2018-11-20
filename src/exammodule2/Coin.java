import java.util.Random;

public class Coin
{
        
        //Fields
    
	private String sideUp; //to determine the side of coin
	private int totalTosses;
	
	/**
         * Constructor
         * @param sideUp stores the toss value. 
         * @param totalTosses stores total number of tosses 
         */
        
        public Coin()
	{
		sideUp = " ";
                totalTosses = 0;
	}
	
        /**
         * The tossNow method performs the coin toss
         */
        
	public void tossNow()
	{
		// creating a random object to generate random number.
		Random rand = new Random();
                
                //generate a random num to perform the number of tosses in the range of 0-50
                int randomTossNum = rand.nextInt(50); 
		//saving the random toss number to private parameter total tosses
                totalTosses = randomTossNum;
		 
                //loop for tossing coin 
                for (int i = 0; i <= totalTosses; i++)
		{
		//rand.nextInt(2) randomly chooses a num between 0-1
		//and compares the number to get a heads or tails
			if(rand.nextInt(2) == 0) 
			{
				sideUp = "Tails";
                    //		System.out.println(sideUp);
			
			}
			else
			{
				sideUp = "Heads";
                    //		System.out.println(sideUp);
			
			}
		}
	}
	
        /** 
         * getSideUp method 
         * @returns the coin side
	*/
        public String getSideUp()
	{
            return sideUp;
	}
      
        /**
         * getTotalTosses method
         * @return total no of tosses performed
        */
        public int getTotalTosses()
        {
            return totalTosses;
        }
}
