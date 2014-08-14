import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QuadrotorApp 
{
	public static void main (String[] args)
	{
		List<Quadrotor>rotors= new ArrayList<Quadrotor>(Arrays.asList(
				new Quadrotor(2,4,2),new Quadrotor(3,4,4),new Quadrotor(4,4,6),
				new Quadrotor(5,4,2),new Quadrotor(6,4,4),new Quadrotor(7,4,6)));
		Quadrotor searchItem = new Quadrotor(4,6,4);
		
		
		System.out.println(rotors.toString());
		changeOrientation(rotors);
		System.out.println(rotors.toString());
		

		if(rotors.contains(searchItem))
		{
			System.out.println("Rotor does contain "+searchItem.toString());
		}
		System.out.println("Number of rotors: "+rotors.size()); 
		
		//remove by name .. searchItem
		rotors.remove(searchItem);
		System.out.println(rotors.toString());
		
		rotors.remove(0);
		 
		System.out.println(rotors.toString());
		
	}
	
	private static void changeOrientation(List<Quadrotor> list)
	{
		for( Quadrotor el: list)
		{
			int temp = el.getX();
			el.setX(el.getY());
			el.setY(temp);
		}
	}
	
	
}


 