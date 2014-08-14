/**
 * 
 * Anil Dhungel 
 * CSIS 1410
 * Assignment 02- GPS with Junits
 */

public class Gps
{
	private String name; 
	private GpsCordinates position;
	private double updatedLong; 
	private double updatedLat; 
	
	/**
	 * The constructor GPS takes two parameters n and pos and assigns it to 
	 * name and position field
	 * @param n name of the Gps
	 * @param pos position of the GPS coordinates
	 */
	
	public Gps(String n, GpsCordinates pos)
	{
		name = n; 
		position = pos;  
	}
	
	/**
	 * This method updatePosition doesn't require any parameters but 
	 * randomly generates number in the range -2.5 to +2.5 and adds it to the
	 * current Longitude and Latitude.  
	 */
	public void updatePosition()
	{
		
		updatedLong = position.getLongitude()+(double)(Math.random()*(5)-2.5);
		updatedLat = position.getLatitude()+(double)(Math.random()*(5)-2.5);
	}
	
	
	public GpsCordinates getPosition()
	{
		return position; 
	}
	public String getName()
	{
		return name; 
	}
	
	public double getUpdateLong() {
		return updatedLong;
	}
	public void setUpdateLong(double updateLong) {
		this.updatedLong = updateLong;
	}
	public double getUpdateLat() {
		return updatedLat;
	}
	public void setUpdateLat(double updateLat) {
		this.updatedLat = updateLat;
	}
	
	/*
	 * This method returns name and position 
	 * @return statement myGps along with the name and position
	 */
	@Override
	public String toString()
	{
		return "myGps:" + getName() +": "+ getPosition(); 
	}
}
