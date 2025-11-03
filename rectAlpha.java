package demo;

import java.util.Scanner;

public class rectAlpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int n=sc.nextInt();
		char a='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print(a++);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
