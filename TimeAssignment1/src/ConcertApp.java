public class ConcertApp
{
	public static void main(String[] args) 
        {
		Time start_time = new Time(20,0,0);
		Time end_time = new Time(22,0,0);
		Concert dummy_concert = new Concert("Bon Jovi", start_time, end_time);
		System.out.println(dummy_concert);
	}
}