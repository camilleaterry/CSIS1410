import java.util.ArrayList;
import java.util.Scanner; 

public class Itinerary {

	public static void main(String[] args) 
	{
		ArrayList<String> itinerary = new ArrayList<String>(); 
		Scanner kb = new Scanner (System.in);
		String userChoice;
		String upperCase; 
 
		while (true)
		{
			System.out.print("Destination: ");
			userChoice = kb.next();
			upperCase = userChoice.toUpperCase();
			if(upperCase.equals("DONE"))
			{
				break;
			}else
			itinerary.add(userChoice); 
			 
		}
		
		StringBuilder travelRoute = new StringBuilder(); 
		String appender = "";
		for(String u: itinerary)
		{
			String upperCaseDestination = u.toUpperCase();
			travelRoute.append(appender).append(upperCaseDestination); 
			appender = " to "; 
		}
		
		System.out.println(travelRoute); 
		 
		kb.close(); 
	}
	

}
