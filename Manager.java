import java.util.Scanner;

public class Manager {
	
	static final Scanner sc = new Scanner(System.in);
	public static void menu() {
		
		
		Diet diet = new Diet();
		
		int choice = 0; 
		while (choice >=0 && choice <= 4) {
			System.out.print("==================" + "\n" + 
							   "     Main Menu    " + "\n" +
							   "==================" + "\n\n" + 
							   "1. Add Record\n" + 
							   "2. View Record\n" + 
							   "3. View All Records\n" + 
							   "4. Exit\n" + 
							   "Selection --> ");
			
			if(sc.hasNextInt()) {
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				diet.addEntry(sc);
				break;
				
			case 2: 
				diet.getEntry(sc); 
				break;
				
			case 3: 
				diet.viewList();
				break;
				
			case 4: 
				System.out.println("Program Ended");
				break;
				
			default: 
				System.out.println("Error in selected choice");
				break;
					
			}
			}
		
		}
		sc.close();
	}
	
	public static void main(String args[]) {
		
		menu();
	}
	
	
}
