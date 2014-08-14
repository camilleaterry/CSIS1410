/**
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Inheritence
 */
public class Circle 
{
	private int radius; 
	
	public Circle(int rad)
	{
		radius = rad; 
	}
	
	public int diameter()
	{
		return 2*radius; 
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius; 
	}
	
	public int getRadius()
	{
		return radius; 
	}
	
	@Override
	public String toString()
	{
		return "Circle ("+ getRadius() + ")"; 
	}
}
