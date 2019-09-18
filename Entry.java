import java.util.*;


public class Entry {
	
	String date = ""; 
	int weight = 0; 
	
	public String getDate() {
		return date; 
	}
	
	public int getWeight() {
		return weight; 
	}
	
	public void setDate(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date --> "); 
		if(sc.hasNext())
		date = sc.next();
		//sc.close(); ------> why does the scanner not need to be closed here for the program to work?
	}
	
	public void setWeight(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weight --> "); 
		if(sc.hasNextInt())
		weight = sc.nextInt();
		//sc.close(); -------> Same over here?
	}
	
	public String toString() {
		return "Date = " + getDate() + ", Weight = " + getWeight(); 
		
	}
	
}
