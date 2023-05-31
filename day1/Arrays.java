package day1;

import java.util.Scanner;
import java.util.Arrays;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;*/
		/*System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();*/
		
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values in array index");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
			
		
	}
	

}
