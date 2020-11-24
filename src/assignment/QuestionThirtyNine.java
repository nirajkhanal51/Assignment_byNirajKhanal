package assignment;

//Q.39. Write a program to display a name in short form

public class QuestionThirtyNine {

	public static void main(String[] args) {
		
		String x1 = "Ram Kishor Singh"; 
		
		char [] namearr = x1.toCharArray();
		
		
		
		//System.out.println(namearr[0].concat(namearr[4]) + "Singh");
		
		System.out.println(namearr[0]+". " + namearr[4]+ ". " + x1.substring(11));

	}

}
