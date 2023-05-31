package day1;

import java.util.Scanner;
import java.util.Arrays;	
public class Arraylist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int arr[]=new int[5];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
			
		}
		System.out.println(Arrays.asList(arr));*/
		
		//binary search.....with in the range
		int arr[]=new int[5]; 
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+",");
		}
		System.out.println(Arrays.asList(arr));
		int key=20;
		System.out.println(Arrays.binarySearch(arr,key));
		System.out.println(Arrays.binarySearch(arr, 1,5,key));
		//array sorting...to print the array elements in a form of array.
		System.out.println(Arrays.toString(arr));

	}

}
