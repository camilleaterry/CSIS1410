package labKeyValuePair;



public class PairApp
{

	public static void main(String[] args)
	{
	
		//Create two keyValuePairs p1 and p2
		KeyValuePair<String, Integer> p1= new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2= new KeyValuePair<>("NY", 8244910);
		
		//print p1 
		System.out.printf("p1: %s\n",p1.toString());
		
		//print p2 
		System.out.printf("p2: %s\n",p2.toString());
		
		//compare p1 and p2 and print the result
		System.out.println("p1.equals(p2): "+p1.equals(p2));
		System.out.println();
		
		//Assign p2 to p1; 
		p1=p2; 
		
		//print p1 
		System.out.printf("p1: %s\n",p1.toString());
		
		//print p2
		System.out.printf("p2: %s\n",p2.toString());
		
		//compare p1 to p2 and print the result
		System.out.println("p1.equals(p2): "+p1.equals(p2));
		
	}

}
