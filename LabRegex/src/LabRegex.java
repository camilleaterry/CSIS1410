import java.util.Scanner; 


public class LabRegex
{
	public static void main(String[] args)
	{
		//Check word starts with uppercase A
		String myRegex2 = ("^A.*");
		
		//Check word starts with uppercase A,E,I,O, or U
		String myRegex3 = ("[AEIOU]|[AEIOU]\\w+"); 
		
		//Checks AEIOU is followed by two digits
		String myRegex4 = ("[AEIOU]\\d{2}");
		
		//checks for number in this for 000-000-0000
		String checkPhone =("\\d{3}-\\d{3}-\\d{4}");
		
		//check for Email 
		String checkEmail = ("^[0-9a-zA-Z]+([0-9a-zA-Z]*[-._+])*[0-9a-zA-Z]+@[0-9a-zA-Z]+([-.][0-9a-zA-Z]+)*([0-9a-zA-Z]*[.])[a-zA-Z]{2,6}$");
		
				           
		test (myRegex2);
		test (myRegex3);
		test (myRegex4);
		test(checkPhone);
		test (checkEmail); 
	
	}
	
	private static void test(String regex)
	{
		String word; 
		Scanner input = new Scanner(System.in); 
		
		System.out.printf("Enter words to match the expression %s%n", regex); 
		System.out.println("Enter DONE when you are finished"); 
		System.out.print("Word: ");
		word = input.nextLine(); 
		while(!word.equalsIgnoreCase("done"))
		{
			System.out.printf("%s %s%n", word, word.matches(regex)?"matches": "does not match"); 
			System.out.print("Word: "); 
			word = input.nextLine(); 
		}
	}
}
