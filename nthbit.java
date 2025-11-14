package demo;

import java.util.Scanner;//importing scanner class

public class nthbit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating scanner object
		
		System.out.println("Enter number:");
		int num=sc.nextInt();	//reading an integer number
		
		System.out.println("Enter n:");
		int n=sc.nextInt();	// reading the bit position n
		
		//right shift number by the n position and performing AND by 1 
		int bitstatus=(num>>n)&1;
		
		if(bitstatus==1) {
			//if bit status is 1 then bit is set(1) else bit is not(0)
			System.out.println(n+" bit of "+num+" is set(1)");
		}
		else {
			System.out.println(n+" bit of "+num+" is not(0)");
		}
		sc.close();
	}
}
