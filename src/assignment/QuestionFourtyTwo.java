package assignment;

import java.util.Scanner;

public class QuestionFourtyTwo {

	 public static void main(String[] args) { 
	
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter your text to be evaluated: ");
    
		 String x1 = input.nextLine();
                        
		 int a ; 
            
        //Converts the string into lowercase    
        x1 = x1.toLowerCase();    
            
        //Split the string into words using built-in function    
        String words[] = x1.split(" ");    
            
        System.out.println("Duplicate words in the given text is : ");     
        for(int i = 0; i < words.length; i++) { 
        	
        	a = 1; 
        	    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    a++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(a > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
    }    
}    