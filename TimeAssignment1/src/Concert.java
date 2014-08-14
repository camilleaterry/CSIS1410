
public class Concert {

	private String name;
	private Time startTime;
	private Time endTime; 

	public Concert(String n, Time start,Time end)
	{
		name = n; 
                startTime = start; 
                endTime = end; 
	}
        @Override
	public String toString()
	{
		//return name+" starts at: "+startTime.toString()+ " and ends at "+endTime.toString()+".";
                
                return String.format("%s: Start: %s, end: %s", name, startTime, endTime); 
	}
	

}