import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Generates a list of n distinct, random numbers and uses that to assign the secret person
 * @author savanna
 *
 */
public class RandomNumbers {
	    public static int[] randomNum(int amount) {
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i=0; i<amount; i++) {
	            list.add(new Integer(i));
	        }
	        int[] randomArray = new int[amount];
	        Collections.shuffle(list);
	        for (int i=0; i<amount; i++) {
	            randomArray[i] = list.get(i);
	        }
	        return randomArray;
	    }

	    public static void main(String[] args){
	    	String[] people = {"Kristina","Shannon", "Sienna", "Savanna", "Will", "Shane", "Tori", "Matt", "Marc", "Nick", "Levi", "Katherine", "Hannah", "Farzana", "Erika", "Carli", "Aria", "Joe F", "Amy", "Joe S", "Abhisek", "Alisha"};
	    	int amount = people.length;
	    	int[] randomAssignments = randomNum(amount);
	    	boolean gotThemselves = false; 
	    	for (int i=0; i<randomAssignments.length; i++)
	        {
	        	if(i == randomAssignments[i]){
	        		System.out.println("array index equals element, run again");
		            //I want to make sure nobody gets themselves!
	        		gotThemselves = true;
	        	}
	        }
	    	//For generating a list for table
	    	if (gotThemselves == false) {
	    			for (int i = 0; i<amount ; i++){
	    				System.out.println("" + people[randomAssignments[i]]);
	    			}
	    	}
	    	//For user input
	    	/*Scanner sc = new Scanner(System.in);
	    	while(true){
	    		System.out.println("Enter your name");
	    		String inputText = sc.nextLine();
	    		for (int i = 0; i < people.length; i++){
	    			if (people[i].equals(inputText)){
	    				int index = randomAssignments[i];
	    				System.out.println("Your person's initials are: " + people[index]);
	    				
	    				}
	    			}
	    		}*/
	    	}
	}
