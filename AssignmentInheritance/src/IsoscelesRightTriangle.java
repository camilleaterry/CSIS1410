/**
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Inheritence
 */
public class IsoscelesRightTriangle
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
}
