//Anil Dhungel
//CSIS 1410- Assignment Student

import java.util.ArrayList; 
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
         ArrayList<Student> studentList = new ArrayList<>();
        
            studentList.add(new Student("George", "Harris", "Biology", 3.1));
            studentList.add(new Student("Isaac", "Newton", "Physics", 4.0));
            studentList.add(new Student("Dennis", "Ritchie", "CS", 3.97));
            
        int choice ; 
        
     do{
        System.out.println("\n1. Add a student");  
        System.out.println("2. Find a student");  
        System.out.println("3. Delete a student");
        System.out.println("4. Display all students");
        System.out.println("5. Display the total number of students");
        System.out.println("6. Exit\n");
        System.out.print("Enter your selection: ");
       
        Scanner kb  = new Scanner(System.in); 
        choice = kb.nextInt(); 
         
        
        if(choice ==1)
        {
           System.out.print("First Name: ");
           kb.skip("\n");
           String firstName = kb.nextLine();
           System.out.print("Last Name: ");
           String lastName = kb.nextLine(); 
           System.out.print("Major: ");
           String major = kb.nextLine();
           System.out.print("Gpa: ");
           double gpa = kb.nextDouble();  
           
           Student enteredStudent = new Student(firstName, lastName, major, gpa);  
           studentList.add(enteredStudent);
           System.out.println("\n");
        }
       
        if(choice == 2)
        {
           System.out.print("Find a student with sNumber S");
           int sNumberChoice = kb.nextInt(); 
           
            boolean numberFound = false;
          for(int counter = 0; counter < studentList.size(); counter++)
           {
      
               if(studentList.get(counter).getsNumber()==sNumberChoice)
               {
                   
                   
                   System.out.println("\nS"+studentList.get(counter).getsNumber()+" "+studentList.get(counter).getFirstName()+" "+studentList.get(counter).getLastName()+" ("+
                           studentList.get(counter).getMajor()+") gpa:"+studentList.get(counter).getGpa());
                   numberFound = true;
                   
               }
           }
           if(!numberFound)
               System.out.println("S"+sNumberChoice+" is not a valid sNumber.");
        }
       
        if(choice == 3)
        {
          System.out.print("Delete student with sNumber S");
          
          int currentSnum = kb.nextInt();
          boolean deleteARecord = false;
          for(int counter = 0; counter < studentList.size(); counter++)
           {          
               if(studentList.get(counter).getsNumber()==currentSnum)
               {                   
                   System.out.println("S"+studentList.get(counter).getsNumber()+" "+studentList.get(counter).getFirstName()+" "+studentList.get(counter).getLastName()+" has been deleted.");
                   deleteARecord = true;
                   studentList.remove(studentList.get(counter));
                   System.out.print("\n");
               }
           }
          
          if(!deleteARecord){
              System.out.println("No record found to be deleted");
        }  
        }
       
        if(choice ==4)
        {
            studentList.stream().forEach((studentList1) ->
            {
                System.out.println("S" + studentList1.toString());
            });
           System.out.print("\n");
        }
        
       if(choice ==5)
        {
            System.out.println("Number of students: "+studentList.size());
        }
     
      }  while(choice !=6 );
        System.out.println("Good Bye!");
    }
}
 