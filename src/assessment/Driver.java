package assessment;
import java.util.Scanner;
/**
 * <h1>PPA assignment 11 </h1> <br>
 * Computer Science <br>
 * Year 1 
 * <p>
 * This class is a driver class
 * @author Anton Pashov(k1631446), Wonjoon Seol (k1631098)
 */
public class Driver {
	
	public static void main(String[] args){
		Banker mrPoe = new Banker("Mr Poe", 5);
		
		Person josephine = new Person("Josephine", 5);
		Person olaf = new Person("Olaf", -10);
		Person sir = new Person("Sir", 0);
		Person monty = new Person("Uncle Monty", 10);
	
		// Person and their distance is added to the list
		mrPoe.addList(josephine, 100);
		mrPoe.addList(olaf, 10);
		mrPoe.addList(sir, 20);
		mrPoe.addList(monty, 20);
			
		Scanner in = new Scanner(System.in);
		while(true){//infinite loop
			System.out.println("Do you want to add more relatives? Type 'y'for yes, and 'n' for no.");
			
			String nextString=in.next();
			
			if(nextString.equals("n")){//if the user enters "n" the loop ends
				in.close();
				break;
			} else {
				if(nextString.equals("y")){//if he enters "y" he is asked to specify name, friendliness and distance
					System.out.println("Type name of person: ");
					String name = in.next();
					
					System.out.println("Enter friendliness");
					int friendliness = in.nextInt();

					System.out.println("Enter distance");
					int distance = in.nextInt();
				
					mrPoe.addList(new Person(name, friendliness), distance);//Person with the specified characteristics is added to the Banker's list
				} else {
					System.out.println("Invalid entry");//asking for new input, if the user doesn't what is required
				}
			}
		}
		
		System.out.println(mrPoe);
		Person relative; 				// Initialise local variable to store selected relative
		
		// do while loop so that the loop is run at least once
		do {
			relative = mrPoe.selectRelative(); 							//mr.Poe selects geographically closest relative
			System.out.println("Children are being moved to live with " + relative.getName());
			
				// same condition is used here again so that "Mr. Poe's search continues.." is not printed on the last loop.
				// this is consistent with Dr. Martin's method shown in assignment 7
				if (relative.getFriendliness() < mrPoe.getFriendliness()){
					mrPoe.removePersonFromList(relative);
					System.out.println("A guardian being unfriendly");
					System.out.println("Mr. Poe's search continues..");
				}
		} while(relative.getFriendliness() < mrPoe.getFriendliness());	
		//mr.Poe compares friendliness and see whether it is strictly less than his friendliness
		
		System.out.println("Mr.Poe is happy that he found the right relative and the children lived happily thereafter..");
	} 
}