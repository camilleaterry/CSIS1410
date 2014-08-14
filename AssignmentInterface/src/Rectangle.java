/*
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Interface
 */

import interfacePackage.Printable;
import interfacePackage.Shape;


public class Rectangle implements Shape, Printable 
{
	private int length; 
	private int width; 
	
	public Rectangle(int l, int w)
	{
		length = l; 
		width = w; 
	}
	
	public int getLength()
	{
		return length; 
	}
	
	public int getWidth()
	{
		return width; 
	}
	
	public String toString()
	{
		return "Rectangle ("+ getLength()+"x"+getWidth() +")"; 
	}

	@Override
	public void print() {
		
		for (int row = 0; row < width; row++ )
		{
			for(int column = 0; column < length; column++)
			{
				if ( row==0 || row==width-1 || column==0 || column==length-1)
				{
					System.out.print("* "); 
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public double perimeter() {	
		return 2*(length + width);
	}

	@Override
	public double area() {
		return length*width; 
	}
}
