package day1;
import java.util.Scanner;
import java.util.Arrays;
public class Arraysort {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int arr[]=new int[5]; 
	 arr[0]=50;
	 arr[1]=30;
	 arr[2]=10;
	 arr[3]=20;
	 arr[4]=40;
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
	 Arrays.sort(arr);
	 System.out.println(Arrays.toString(arr));
	 
	
	
	}
	
}
