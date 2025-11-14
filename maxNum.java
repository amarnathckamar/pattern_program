package demo;

import java.util.Scanner;//importing scanner class

public class maxNum {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);//creating scanner object
		 
		 System.out.println("Enter first number:");
		 int num1=sc.nextInt();//reading first number from the user
		 
		 System.out.println("Enter second number:");
		 int num2=sc.nextInt();//reading second number from the user
		 
		 if(num1>num2) {
			 //if the first number is grater then second number
			 System.out.println(num1+" is greater than "+num2);
		 }
		 else {
			 //if the second number is greater than first number
			 System.out.println(num2+" is greater than "+num1);
		 }
		 sc.close();
	}
	

}
