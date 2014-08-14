
public class PrinterApp
{

	public static void main(String[] args) 
	{
		 

		InkjetPrinter inkjetHp = new InkjetPrinter(123456); 
		System.out.println(inkjetHp.toString());
		inkjetHp.getRemainingCartridge();
	
		LaserPrinter laserprinterEpson = new LaserPrinter(2345678);
		System.out.println(laserprinterEpson.toString());
		laserprinterEpson.getRemainingToner();
		
		
		System.out.println("\nArray of Printers"); 
		Printer[] arrayOfPrinters = new Printer[2]; 
		arrayOfPrinters[0] = inkjetHp; 
		arrayOfPrinters[1] = laserprinterEpson; 
		
		for( Printer u: arrayOfPrinters)
		{
			System.out.println(u);
			u.print(); 
			u.print(); 

			System.out.println("");
		}
		
		

	}

}
