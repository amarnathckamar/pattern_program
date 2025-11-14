package demo;

import java.util.Scanner;//import scanner class

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//creating scanner object
		System.out.println("Enter year:");
		
		int year=sc.nextInt();//retrieving year from the user
		
		//check if year divisible by 4 then
		if(year%4==0) {
			
			//check if the year divisible by 100
			if(year%100==0) {
				
				if(year%400==0) {
					//check is the year divisible by 400
					System.out.println(" Leap year");
				}
				else {
					//if not divisible by 400 then is not a leap year
					System.out.println(" Common year");
				}
				
			}else {
				//if divisible by 4 not divisible by 100 then is leap year
				System.out.println(" Leap year");
			}
			
		}
		else {
			//if not divisible by 4 then not a leap year
			System.out.println(" Common year");
		}
		sc.close();
	}
}
