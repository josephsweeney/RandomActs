import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Generates a list of n distinct, random numbers. 
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
	            //I want to make sure the index is not the same as the value!
	        }
	        return randomArray;
	    }

	    public static void main(String[] args){
	    	String[] initials = {"AH", "SK", "AW", "HH", "ME", "ML", "JF", "JS", "SR", "SB", "LG", "NH", "SS", "SV", "CW" };
	    	int amount = initials.length;
	    	int[] randomAssignments = randomNum(amount);
	    	for (int i=0; i<randomAssignments.length; i++)
	        {
	        	if(i == randomAssignments[i]){
	        		System.out.println("array index equals element, run again");
	        	}
	        }
	    	Scanner sc = new Scanner(System.in);
	    	while(true){
	    		System.out.println("Enter your first and last initial (uppercase)");
	    		String inputText = sc.nextLine();
	    		for (int i = 0; i < initials.length; i++){
	    			if (initials[i].equals(inputText)){
	    				int index = randomAssignments[i];
	    				System.out.println("Your person's initials are: " + initials[index]);
	    				
	    				}
	    			}
	    		}
	    	}
	}
