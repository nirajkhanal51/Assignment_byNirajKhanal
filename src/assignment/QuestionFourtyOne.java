package assignment;

import java.util.Scanner;

//Q.41.Write a program to find the duplicate letter in a word.


public class QuestionFourtyOne {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in); 
	    System.out.println("Enter your word to be evaluated: ");
	    
	    String x1 = input.next();
	        
	    char[] xarr = x1.toCharArray();
	    
	    System.out.println(xarr);
	    
	    System.out.println("Duplicate letters in your word are: ");
	    
	    	    
	    for (int i = 0; i < x1.length(); i++) {
	    
	    for (int j = i + 1; j < x1.length(); j++) {
	    	
	      if (xarr[i] == xarr[j]) {
	       System.out.println(xarr[i]);
	       
	       
	      } } } 
	     }
	    }
	   
	  