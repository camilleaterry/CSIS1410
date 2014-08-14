/**
 * 
 * Anil Dhungel 
 * CSIS 1410
 * Assignment 02- GPS with Junits
 */

public class GpsCordinates {
	private double longitude; 
	private double latitude; 
	
	/**
	 * Constructor GpsCordinates takes two double type parameter and assigns it longitude and latitude
	 * @param lat
	 * @param lon
	 */
	public GpsCordinates(double lat, double lon)
	{
		 longitude = lon; 
		 latitude = lat; 
	}
	
	public double getLatitude()
	{
		return latitude; 
	}
	
	public void setLatitude(double lat)
	{
		this.latitude = lat ; 
	}
	
	public  double getLongitude()
	{
		return longitude; 
	}
	
	public void setLongitude(double lon)
	{
		this.latitude = lon ; 
	}
	/**
	 * Method toString doesn't take any parameters returns current values of latitude and longitude
	 * @param void
	 * @return latitude and longitude
	 */
	@Override
	public String toString()
	{
		return getLatitude() +", "+ getLongitude(); 
	}
}
