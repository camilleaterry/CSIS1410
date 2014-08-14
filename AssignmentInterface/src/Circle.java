/*
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Interface
 */
import interfacePackage.Shape;



public class Circle implements Shape
{
	private int radius; 
	
	double Perimeter()
	{
		return 2*Math.PI*radius; 
	}
	
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

	@Override
	public double perimeter() {
		
		return 2*Math.PI*radius; 
	}

	@Override
	public double area() {
		
		return Math.PI*radius*radius;
	}
}
