package demo;

import java.util.Scanner;

abstract class shape{
	abstract void area();
}

class Squre extends shape{
	int length;
	Squre(int length){
		this.length=length;
	}
	
	void area(){
		int result=length*length;
		System.out.println("Area of the squre is :"+result);
	}

}

class Rectangle extends shape{
	int length,breadth;
	Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		int result=length*breadth;
		System.out.println("Area of the rectangle is :"+result);
	}
}
public class shapeArea {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choice area:");
		System.out.println("1:rectangle");
		System.out.println("2:squre");
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter length and breadth:");
				int length=sc.nextInt();
				int breadth=sc.nextInt();
				Rectangle r=new Rectangle(length,breadth);
				r.area();
				break;
			case 2:
				System.out.println("Enter length and breadth:");
				int length1=sc.nextInt();
				Squre a=new Squre(length1);
				a.area();
				break;
		}
		
	}
}
