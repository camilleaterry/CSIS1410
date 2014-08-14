import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class MountainApp {
	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<>(); 
		try (Scanner s = new Scanner(new File("src/Mountains.csv")))
		{
			while (s.hasNextLine())
			{
				String line = s.nextLine();
				try
				{
					Mountain  current_mountain =  getMountain(line);
					mountainList.add(current_mountain);
					System.out.println(current_mountain.toString());
				}
				catch (Exception e)
				{
					System.err.println(line+ " cound not be read as mountain");
				}
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.toString());
		} 
	}
	private static Mountain getMountain(String line) {
		String[] arr = line.split(",");		
		String bool_str = arr[2];
		boolean bool_hasglacier = false;
		int altitude = Integer.parseInt(arr[1]);
		if(bool_str.equals("TRUE"))
			bool_hasglacier = true;
		else
			bool_hasglacier = false;
		return new Mountain(arr[0], altitude, bool_hasglacier);
	}
}