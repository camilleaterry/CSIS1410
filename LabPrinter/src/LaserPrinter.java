
public class LaserPrinter extends Printer
{
		int remainingToner; 
		public  LaserPrinter(int sNumber)
		{
			super (sNumber); 
			remainingToner = 100; 
		}
		
		public int getRemainingToner()
		{
			System.out.println("Remaining Toner: " + remainingToner+"%");
			
				
			return remainingToner;
		}
			

		public void print()
		{
			if(remainingToner > 0)
			{
				remainingToner -=10;
			}
			System.out.println(getClass().getSimpleName() + " is printing. Remaining toner: "+ remainingToner +"%");
		}
			 
			
		
}
