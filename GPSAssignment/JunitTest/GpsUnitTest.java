/**
 * Author: Anil Dhungel
 * Csis 1410 
 * Assignment 02 GPS with junits
 */

import static org.junit.Assert.*;
import org.junit.Test;


public class GpsUnitTest {
	/**
	 * Checks the name matches the gps name "garmin".
	 */
	@Test
	public void test1() {
		
		Gps test1 = new Gps("garmin",new GpsCordinates(100, 100)); 
		String gpsName = test1.getName();
		assertTrue (gpsName.equals("garmin"));
	}
	/**
	 * Checks if the name is different from garmin. 
	 */
	@Test	
	public void test2() {
		
		Gps test2 = new Gps("garmin",new GpsCordinates(100, 100)); 
		String gpsName = test2.getName();
		assertFalse (gpsName.equals("tomtom"));
	}
	/**
	 * Checks if the longitude and latitude are updated, if it is different from original
	 * position, verifies if the new field position is with -2.5 to 2.5.
	 */
	@Test
	public void test3()
	{
		GpsCordinates gpsCor = new GpsCordinates(40.760671, -111.891122);
		Gps gps = new Gps("Garmin", gpsCor);
		double originalLat = gpsCor.getLatitude();
		double originalLong = gpsCor.getLongitude();
		
		
		gps.updatePosition();
		
		double updatedLat = gps.getUpdateLat();
		double updatedLong = gps.getUpdateLong();
		
		
		if(originalLat != updatedLat)
		{
			assertTrue(updatedLat - originalLat < 2.5 && updatedLat - originalLat > -2.5);
			assertTrue(updatedLong - originalLong < 2.5 && updatedLong - originalLong  > -2.5);
		}
	}
	

}
