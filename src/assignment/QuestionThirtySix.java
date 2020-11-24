package assignment;

//36. Write a function to find duplicate elements in an array.


public class QuestionThirtySix {

	public static void main(String[] args) {
		
		
		
        int [] arr = new int [] {2, 3, 5, 6, 5, 7, 8};   
          
        System.out.println("The repeated elements are: ");  
        
        
        for(int i = 0; i < arr.length; i++) {  
         for(int j = i + 1; j < arr.length; j++) {  
           if(arr[i] == arr[j])  
            System.out.println(arr[j]);  
            }  
                 
        }  
        
        }    }  
