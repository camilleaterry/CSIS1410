package labJUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure;


public class MyTestRunner 
{
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(AllTests.class);
		int totalTest = result.getRunCount(); 
		int totalFail = result.getFailureCount();
		int totalPass = totalTest-totalFail; 
		System.out.println("Total test: "+ totalTest + " Total fail: "+ totalFail + " Total Pass: "+ totalPass);
		
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
			
		}
		
	}
}
