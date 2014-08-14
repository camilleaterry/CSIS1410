//Anil Dhungel
//CSIS 1410- Assignment Student

public class Student {
	private String firstName; 
	private String lastName; 
	private int sNumber; 
	private String major; 
	private double gpa; 
	private static int count =0; 
 
	public Student()
	{
		setFirstName(""); 
                setLastName("");
                sNumber = 1000000+count;
                setMajor("");
                setGpa(0.0);
                count++;
                
        }
                
	public Student(String fName, String lName, String maj, double gpa)
	{
		setFirstName(fName); 
                setLastName(lName);
                sNumber = 1000000+count;
                setMajor(maj);
                setGpa(gpa);
                count++;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getsNumber() {
		return sNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public static int getCount()
        {
            return count; 
        }
	
        @Override
	public String toString()
	{
		return getsNumber() +" "+ getFirstName()+" "+getLastName()+" ("+getMajor()+") gpa:"+ getGpa() ;
	}
}