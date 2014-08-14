/**
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Inheritence
 */
public class InheritanceApp
{
	public static void main(String[] args)
	{
		Rectangle myRectangle = new Rectangle(5,4); 
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5); 
		Circle myCircle = new Circle(4); 
		
		System.out.println(myRectangle.toString());
		System.out.println("Length: "+ myRectangle.getLength());
		System.out.println("Width: "+ myRectangle.getWidth());
		
		System.out.println("\n"+mySquare.toString()); 
		System.out.println("Side: "+ mySquare.getSide());
		
		System.out.println("\n"+ myIsoscelesRightTriangle.toString());
		System.out.println("Leg: "+ myIsoscelesRightTriangle.getLeg());
		
		System.out.println("\n"+myCircle.toString()); 
		System.out.println("Diameter: "+ myCircle.diameter());
		System.out.println("Circumference: " + (String.format( "%.1f",myCircle.circumference())));
		System.out.println("Radius: "+myCircle.getRadius()); 
		
		System.out.println("\nrectangle2:"); 
		System.out.println("____________");
		
		Rectangle rectangle2 = new Square(4); 
		System.out.println(rectangle2.toString());
		System.out.println("Length:"+rectangle2.getLength());
		System.out.println("Width:"+rectangle2.getWidth());
		//System.out.println(rectangle2.getSide())- Tried calling getSide, got undefined error.
		
		System.out.println("\nRectangle Array"); 
		System.out.println("_______________");
		
		Rectangle rectangle[] = new Rectangle[3]; 
		rectangle[0] = rectangle2; 
		rectangle[1] = mySquare; 
		rectangle[2] = myRectangle; 
		
		for (int count=0; count<rectangle.length; count++)
		{
			System.out.println(rectangle[count].toString()); 
			System.out.println("Length:"+rectangle[count].getLength());
			System.out.println("Width:"+rectangle[count].getWidth());
			System.out.println("");
			
		}
		
		
	
	}
}
