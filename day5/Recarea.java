package day5;

import java.util.Scanner;

public class Recarea {
	/*public static void main(String[] args) {
	int width=5;
	int height=10;
	int area=width*height;
	System.out.println("Area of rectangle="+area);*/
	

	//METHOD:
	
	/*public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the length:");
      int l= sc.nextInt();      
      System.out.println("Enter the bredth:");
      int b=sc.nextInt();
      int a=l*b;
      System.out.println("Area of Rectangle is: " + a);      
   }
     static double area(double a)
    {
	return (a);	*/
	
	//CONSTRUCTOR:
	private double area;
	
	public Recarea(double a) {
		area=a;
		
	}
	public double area() {
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
		System.out.println("enter width");
		int w=sc.nextInt();
		int a=l*w;
		Recarea s=new Recarea(a);
		System.out.println(s.area);		
	}
}

	
