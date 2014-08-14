/*
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Interface
 */

import interfacePackage.Printable;
import interfacePackage.Shape;




public class Square extends Rectangle implements Printable, Shape
{
	public Square(int side)
	{
		super(side, side);
	}
	
	public int getSide()
	{
		return getLength();
		 
	}
	
	@Override
	public String toString()
	{
		return "Square ("+getSide()+")"; 
	}
	@Override
	public void print() 
	{
		for (int row = 0; row < getSide(); row++ )
		{
			for(int column = 0; column < getSide(); column++)
			{
				if( row==0 || row==getSide()-1 || column==0 || column==getSide()-1) 
					System.out.print("* ");
				else
					System.out.print("  "); 
			}
			
			System.out.println();
		}
		
	}

	@Override
	public double perimeter() {
		return 4* getSide();
	}

	@Override
	public double area() {
		return getSide()*getSide();
	}
}