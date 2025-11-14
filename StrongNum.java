package demo;

import java.util.Scanner;

public class StrongNum {
	
	//method for calculating factorial
	int Numfact(int num) {
		if(num==1||num==0) {
			
			//if the number is 1 or 0 then return the same number
			return num;
			
		}else {
			
			//recursive call for the factorial
			return num*Numfact(num-1);
		}
	}
	
	//method for calculating the sum of factorial
	int SumDigit(int num){
		int temp=num,rem=0,sum=0,fact=0;
		while(temp!=0) {
			//finding remainder
			rem=temp%10;
			
			//calling Numfact method for calculating factorial of remainder
			fact=Numfact(rem);
			
			//sum of factorial
			sum=sum+fact;
			
			//updating the temp
			temp=temp/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in); //creating object for scanner
		 StrongNum sn=new StrongNum();//creating object for class strongNum
		 
		 System.out.println("Enter a number:");
		 int num=sc.nextInt(); //retrieving the number from the user
		 
		 int result=sn.SumDigit(num);//calling the method for getting the sum of the factorial
		 
		
		 if(num==result) {
			 System.out.println(num+" is a strong number"); //if the number is equal to the result returned from the method then print strong number
			 
		 }
		 else {
			 System.out.println(num+" is not a strong number");//else print the not a strong number
		 }
		 sc.close();
	}
}
