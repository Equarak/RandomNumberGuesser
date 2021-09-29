import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	int lowGuess=0; 
	int highGuess =100;
	int nextGuess=0;
	int randNum = 0;
	//Call rand method to get random number 
	Random rand = new Random();
	randNum= RNG.rand();
	
	
	RNG.resetCount();
	RNG rng = new RNG();
	 System.out.println("Enter your first guess: ");
	// while loop
	
	 while(true)
	{
		 
		int guess = scan.nextInt();
	   
		
		System.out.println("Number of guesses is "+ RNG.getCount());
		
		while(guess<0 || guess>100)
				{
				   System.out.println("Please enter number from 0 to 100");
					guess = scan.nextInt();
				}


		  if(guess < randNum)
		  {
					lowGuess = guess;
					System.out.println("Your guess is too low");
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
					
		  }
		  else if(guess > randNum)
		{
			    highGuess = guess;
				System.out.println("Your guess is too high");
				RNG.inputValidation(nextGuess, lowGuess, highGuess);
				
				
		  }
		  else 
		{
				System.out.println("Congratulation! You guessed correctly");
				System.out.println("Play again?(yes/no): ");
				String answer = scan.next();
				
				if(answer.equalsIgnoreCase("no"))
				{
					 
					System.out.println("Thanks for playing...");
					System.out.println(" ");
						
						System.exit(0);// if answer is no, this loop end

			    }
			
				else // this else if from last if, this else reflects if the answer isn't no( mean yes) then this else will opperate (reset everything ) then the loop while start again.
				{
					System.out.println("Enter your first guess: ");
					
					//reset everything else before repeat loop
					
					RNG.resetCount();
					RNG rng1 = new RNG(); // call RNG method
					guess = 0;
					randNum=0;
					randNum= RNG.rand();
					nextGuess=0;
					lowGuess=0; 
					highGuess =100;
			// loop ends		

				}
		  }
	 }

}
}


