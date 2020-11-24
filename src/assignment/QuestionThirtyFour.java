package assignment;

//34. Write a program to reverse the element of an array.

public class QuestionThirtyFour {

			public static void main(String[] args) {  
	          
				findReverse(); 
	          
	        }  
	    
			public static void findReverse() {
				
				int [] arr = new int [] {33, 34, 35, 36, 37};  //declaring and initializing array
		        System.out.println("Let's take a look at original array: ");  
		        for (int i = 0; i < arr.length; i++) {  
		            System.out.print(arr[i] + " ");  
		        }  
		        System.out.println();  
		        System.out.println("The array in reverse order looks like:  ");  
		          
		        for (int i = arr.length-1; i >= 0; i--) {  //using loop to get reverse order
		            System.out.print(arr[i] + " ");
				
				
				
			}
			
			}  
	}  