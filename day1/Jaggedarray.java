package day1;
import java.util.Scanner;
import java.util.Arrays;
public class Jaggedarray {
	public static void main(String[] args) {

		/*arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[1];
		arr[0][0]=4;
		arr[0][1]=2;
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		arr[2][0]=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
 
			}
			System.out.println();
		}*/
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[3][];
		arr[0]=new int[a];
		arr[1]=new int[b];
		arr[2]=new int[c];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the index for ["+i+"] ["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
