package assignment;


import java.lang.*;
import java.io.*;
import java.util.*;

//Q. Fourty. Write a program to reverse the string.
public class QuestionFourty {

	/* Method 1. 
	     
	 public static void main(String[] args) {
		
			
		StringBuilder myWord = new StringBuilder("NIRAJ");
		
		myWord.reverse();
		System.out.println(myWord);
		
		
		
	}

}*/


 
 
/* Method 2. 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your word to be reversed: ");
    	
    	String x1 = input.nextLine();
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = x1.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(new String(result));
    }
} 
*/
	
	//Methtod 3. 
	/*public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your word to be reversed: ");
        String x = input.nextLine();
 
        StringBuilder x1 = new StringBuilder();
 
        // append a string into StringBuilder x1
        x1.append(x);
 
        // reverse StringBuilder x1
        x1 = x1.reverse();
 
        // print reversed String
        System.out.println(x1);
    }
}*/
	
	//Method 4.
	
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your word to be reversed: ");
		
		String x1 = input.nextLine();
 
        // conversion from String object to StringBuffer
        StringBuffer x2 = new StringBuffer(x1);
        // To reverse the string
        x2.reverse();
        System.out.println(x2);
    }
}
