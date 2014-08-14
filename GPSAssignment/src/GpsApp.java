/**
 * Anil Dhungel 
 * CSIS 1410
 * Assignment 02- GPS with Junits
 */

import java.text.DecimalFormat;


public class GpsApp {
	public static void main (String[] args)
	{
		GpsCordinates gpsSlc = new GpsCordinates(40.760671, -111.891122);  
		System.out.println("Gps cordinates of SLC: "+ gpsSlc.toString()+"\n"); 
		
		Gps gpsInfo = new Gps( "Garmin", gpsSlc); 
		System.out.println(gpsInfo.toString()+"\n");
		
		
		DecimalFormat df = new DecimalFormat("#.000000");
			
		gpsInfo.updatePosition();
		System.out.printf("\nposition Update1: "+ df.format(gpsInfo.getUpdateLat()) +"  "+df.format(gpsInfo.getUpdateLong()) );
		gpsInfo.updatePosition();
		System.out.print("\nposition Update2: "+ df.format(gpsInfo.getUpdateLat()) +"  "+df.format(gpsInfo.getUpdateLong()) );
		gpsInfo.updatePosition();
		System.out.print("\nposition Update3: "+ df.format(gpsInfo.getUpdateLat()) +"  "+df.format(gpsInfo.getUpdateLong()) );
	
	}
}
