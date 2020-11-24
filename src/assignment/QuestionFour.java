package assignment;

//Q.4.: Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100

//importing java scanner utility

import java.util.Scanner;

//initializing class with standard syntax

public class QuestionFour
{
    public static void main(String args[]) 
    {
        
        // declaring the object and initializing with predefined standard input object
        Scanner input = new Scanner(System.in);
        
        //declaring variable P for input principal amount
        System.out.print("Enter the Principal : ");
        float P = input.nextFloat();
        
        //declaring variable R for input interest amount
        System.out.print("Enter the Rate of interest : ");
        float R = input.nextFloat();
        
        //declaring variable T for input time period
        System.out.print("Enter the Time period : ");
        float T= input.nextFloat();
        
        //closing scanner input to help garbage collection
        input.close();
        
        //implementing simple interest formula
        float interest_amount =  (P * T * R) / 100;
        System.out.print("Simple Interest amount in " + T + " years time is: " +interest_amount);
    }
}