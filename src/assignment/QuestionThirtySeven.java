package assignment;

//Q37. Perform the addition of two arrays. 

public class QuestionThirtySeven {

	 public static void main(String[] args) {  
	          
	               
	          int a[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}  };
	                            
	          int b[][] = { {4, 5, 6}, {2, 7, 8}, {3, 1, 9}  }; 
                        
               
           int rows = a[0].length;  
	        int cols = a[0].length;  
	          
	            
	        int sum[][] = new int[rows][cols];  
	          
	          
	        for(int i = 0; i < rows; i++){  
	        for(int j = 0; j < cols; j++){  
	        sum[i][j] = a[i][j] + b[i][j];  
	            }  
	        }  
	          
	        System.out.println("Adding two arrays: ");  
	        for(int i = 0; i < rows; i++){  
	        for(int j = 0; j < cols; j++){  
	        System.out.print(sum[i][j] + " " );  
	            }  
	        System.out.println();  
	}  
	}  
	}  
