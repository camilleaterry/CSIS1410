package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

      //  testDemo(demo);
        serialize(demo, "Demo.ser"); 
        System.out.println("Serialization is complete");
        
        ListVsSetDemo newDemo=deserialize("Demo.ser"); 
        testDemo(newDemo); 

    };

    private static void testDemo(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }
    
    private static void serialize(ListVsSetDemo demo, String filename)
    {
    	try
    	{
    		FileOutputStream fileOut = new FileOutputStream(filename); 
    		ObjectOutputStream out = new ObjectOutputStream(fileOut); 
    		out.writeObject(demo);
    		out.close(); 
    		fileOut.close();
    	}catch (IOException i)
    	{
    		System.out.println(i.getMessage());
    	}
    }
    
    private static ListVsSetDemo deserialize(String filename)
    {
    	ListVsSetDemo demo = null; 
    	try
    	{
    		FileInputStream fileIn = new FileInputStream(filename); 
    		ObjectInputStream in = new ObjectInputStream(fileIn);
    		demo = (ListVsSetDemo) in.readObject(); 
    		in.close(); 
    		fileIn.close();
    		
    		
    	}catch(IOException i)
    	{
    		
    	} catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		return demo;
    	
    }

}
