package day5;
import java.util.Scanner;
public class Parametersrt {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Parametersrt sum=new Parametersrt();
	System.out.println("enter the a value:");
	int a=sc.nextInt();
	System.out.println("enter the b value:");
	int b=sc.nextInt();
	int res=sum.add(a, b);
	System.out.println(res);
	
	
}
}
