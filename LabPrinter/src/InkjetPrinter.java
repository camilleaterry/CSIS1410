
public class InkjetPrinter extends Printer
{
	int remainingCartridge; 
	public  InkjetPrinter(int sNumber)
	{
		super (sNumber); 
		remainingCartridge = 100; 
	}
	
	public int getRemainingCartridge()
	{
		System.out.println("Remaining Cartridge: " + remainingCartridge+"%");
		
		return remainingCartridge; 
	}
		

	public void print()
	{
		if(remainingCartridge > 0)
		{
			 remainingCartridge -= 10  ;
		}
		System.out.println(getClass().getSimpleName() + " is printing. Remaining cartridge: "+ remainingCartridge +"%");
		
	}
}
