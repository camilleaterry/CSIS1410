import interfaceLab.Flyable;

public class App 
{

	public static void main(String[] args)
	{ 
		
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		System.out.println(""); 
		
		Flyable [] flyingThings = new Flyable[3];
		flyingThings[0]= myPlane; 
		flyingThings[1]= myHangglider;
		flyingThings[2]= myBird;
		
		for(int count = 0; count <flyingThings.length; count++)
		{
			System.out.println(flyingThings[count]); 
			flyingThings[count].launch(); 
			flyingThings[count].land();
			System.out.println(""); 
			
		}
	}

	
	

}