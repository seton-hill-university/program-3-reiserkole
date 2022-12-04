//Header
// Application:  Loops
// Name:         Kole Reiser
// GitHub User:  kolereiser



import java.util.Scanner;



public class program3 {
	
	public static void main(String[] args) {
		
	// Initialize scanner
		Scanner keyboard = new Scanner (System.in);
		
	// Get number between 1 and 100
		System.out.println("Enter a number between 1 and 100. ");
		int Num1 = keyboard.nextInt ();
		
		
	// Validate
		while (Num1< 1 || Num1 > 100);
		{
			System.out.println("That number is not valid. ");
			System.out.println("Try again. Your number needs to be between 1 and 100. ");
			
			Num1 = keyboard.nextInt();
			
		}
	
	while (Num1 >1 || Num1 <100)
	{
			System.out.println("Thank you for your input Kole!");
			break;
			
	}
	
	// Countdown
	
		for (int Num2 = Num1; Num1 > 1; Num2 --)
		{
			System.out.println("You have " + Num2 + " left. This is so cool!");
			if(Num2==0)
				break;
		}
		
		
		}
	
}
