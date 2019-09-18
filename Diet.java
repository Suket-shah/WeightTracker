import java.util.*; 

public class Diet {
	
	ArrayList<String> list1 = new ArrayList<String>(); 
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	int weightDiff = 0; 
	int netWeight = 0; 
	String search;
	
	public void addEntry(Scanner sc) {
		
		Entry entry = new Entry(); 
		
		entry.setDate(sc);
		entry.setWeight(sc);
		
		list1.add(entry.getDate());
		list2.add(entry.getWeight());
				
	}
	
	public void getEntry(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Date -->");
		if(sc.hasNext())
		search = sc.next();
		int x = 0;
		try {
			while(search.equals(list1.get(x)) == false) {
				x++;
			}
			
			System.out.println("Your weight was " + list2.get(x));
		}
		
		catch(Exception e) {
			System.out.println("Invalid Date" + e);
		}
		//sc.close();
	}
	
	public void viewList() {
		System.out.println("==================" + "\n" + 
				   "     Records    " + "\n" +
				   "==================" + "\n" + 
				   "Date     Weight    Diff" + "\n" + 
				   "-----------------------");
		
		String output = ""; 
		
		output = list1.get(0) + "     " + list2.get(0) + "        " + "0" + "\n";

		for(int i = 1; i < list2.size(); i++ )
			output = output + list1.get(i) + "     " + list2.get(i) + "        " + (list2.get(i)-list2.get(i-1)) + "\n"; // how to use a enhanced for loop here??
		
		System.out.println(output);
		System.out.println("Net Weight Loss/Gain = " + (list2.get(list2.size()-1) - list2.get(0))); 
		
		//for(int x : list2) {
			//System.out.print(list1.get(x) + "    ");
			//System.out.println(list2.get(x));		
		}
	}
	
	


	

