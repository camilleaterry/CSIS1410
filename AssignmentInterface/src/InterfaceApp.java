/*
 *Anil Dhungel 
 *CSIS-1410
 *Assignment Interface
 */

import interfacePackage.Printable;
import interfacePackage.Shape;


public class InterfaceApp 
{

	public static void main(String[] args) 
	{
		Rectangle rectangle1 = new Rectangle(6, 3);
		Square square1 = new Square(5); 
		IsoscelesRightTriangle triangle1 = new IsoscelesRightTriangle(6);
		Circle circle1 = new Circle(5);
		
		System.out.println(rectangle1.toString()); 
		System.out.println("\n"+square1.toString()); 
		System.out.println("\n"+triangle1.toString()); 
		System.out.println("\n"+circle1.toString() +"\nDiameter: "+ circle1.diameter());
		System.out.println("Circumference: " + (String.format( "%.1f",circle1.circumference())));
		System.out.println("\nShape Array:\n------------");
		
		Shape[] shapeArray = new Shape[4];
		shapeArray[0] = square1; 
		shapeArray[1] = rectangle1; 
		shapeArray[2] = triangle1;
		shapeArray[3] = circle1; 
		
		for (Shape u: shapeArray)
		{
			System.out.print("\n"+u.toString()); 
			System.out.print("\nPerimeter: "+(String.format("%.1f",u.perimeter())));
			System.out.print("\nArea: "+(String.format("%.1f", u.area())));
			System.out.println("");
			if(u instanceof Printable){
				((Printable) u).print();
			}
			 
			
		}
	}

}
