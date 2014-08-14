/**
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Inheritence
 */

public class Square extends Rectangle 
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
}