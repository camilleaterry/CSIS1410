
public abstract class Printer
{
	private int serialNumber; 
	
	public Printer (int number)
	{
		serialNumber = number; 
	}
	public abstract void print();
	
	public String toString()
	{
		return ("\n"+getClass().getSimpleName() +" #" + serialNumber);
	}
	
	
}
