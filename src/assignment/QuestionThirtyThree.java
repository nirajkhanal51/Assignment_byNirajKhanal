package assignment;

import java.util.Scanner;

//33. Write a Program to display numbers in ascending order in array.

public class QuestionThirtyThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		
        int [] arr = new int [] {4, 6, 1, 3, 9};     
        int num = 0;    
            
        System.out.println("The elements in original order of array: ");    
        
        for (int i = 0; i < arr.length; i++)      
        { System.out.print(arr[i] + " ");  }  
            
            
            
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   num = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = num;    
               }     
            }     
        }    
          
        System.out.println();    
            
         
        System.out.println("The elements of the array sorted in ascending order: "); //printing the array sorted in ascending order   
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    

		
		
}



	


