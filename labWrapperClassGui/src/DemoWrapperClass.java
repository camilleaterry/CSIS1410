

public class DemoWrapperClass
{
	String minMax()
	{
		return("Byte:\nMin:"+Byte.MIN_VALUE)+ ("\nMax:"+Byte.MAX_VALUE)
				+("\n\nShort: "+"\nMin: "+ Short.MIN_VALUE +"\nMax: "+Short.MAX_VALUE)
				+("\n\nInteger:\nMin: "+Integer.MIN_VALUE+"\nMax: "+Integer.MAX_VALUE)
				+("\n\nLong:\nMin: "+ Long.MIN_VALUE+"\nMax: "+Long.MAX_VALUE);
	}
	
	String toBinary (int number)
	{
		return ("Binary: "+Integer.toBinaryString(number)+
				"\nOctal : "+Integer.toOctalString(number)+
				"\nHex   : "+Integer.toHexString(number)); 
		
	}
	
	String charProperties(char c)
	{
		if (Character.isLetter(c)){
		return ("White space: "+Character.isSpaceChar(c)+
				"\nDigit: "+Character.isDigit(c)+
				"\nLetter: "+ Character.toLowerCase(c)+"|"+Character.toUpperCase(c));
		}else
		{
			return ("White space: "+Character.isSpaceChar(c)+
					"\nDigit: "+Character.isDigit(c)+
					"\nLetter: "+Character.isLetter(c));
		}
	}
}
