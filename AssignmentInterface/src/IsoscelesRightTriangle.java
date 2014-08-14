/*
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Interface
 */

import interfacePackage.Printable;
import interfacePackage.Shape;


public class IsoscelesRightTriangle implements Printable, Shape
{
	private int leg; 
	
	public IsoscelesRightTriangle(int l)
	{
		leg = l; 
	}
	
	public double hypotenuse()
	{
		return Math.sqrt(2*leg*leg); 
	}
	
	public int getLeg()
	{
		return leg; 
	}
	
	public String toString()
	{
		return "IsoscelesRightTriangle ("+getLeg() +")";
	}

	@Override
	public double perimeter() 
	{
		return leg+leg+hypotenuse();
	}

	@Override
	public double area() {
		return (1/2.0*leg*leg);
	}

	@Override
	public void print() {
		for (int row = 0; row < leg; row++ )
		{
			for(int column = 0; column < leg; column++)
			{
				if( column==0||row==leg-1||row==column) 
					System.out.print("* ");
				else
					System.out.print("  "); 
			}
			
			System.out.println();
		}
		
		
	}
}
