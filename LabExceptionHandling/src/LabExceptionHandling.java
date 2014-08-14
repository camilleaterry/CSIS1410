import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandling
{
	public static void main(String[] args)
	{
		boolean done = false ; 
		
		do
		{
			try
			{
				int digit = numberFromUser();
				
				int result = sevenModulusN(digit);
				System.out.printf("7 %% %d = %d", digit, result);

				done = true; 
			} 
			
			catch (InputMismatchException e)
			{
				System.out.println("The number entered needs to be a whole number");
			}
			catch (Exception e)
			{
				System.out.println("A problem occurred:" + e.getMessage());
			}
			
		} while (!done);
		
	}

	private static int numberFromUser()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("number: ");
		return input.nextInt();
	}

	private static int sevenModulusN(int number)
	{
		if (number ==0)
		{
			throw new IllegalArgumentException("Can't calculate 7 % 0!");
		}
		return 7 % number;
	}
}
