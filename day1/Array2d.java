package day1;
import java.util.Scanner;
import java.util.Arrays;
public class Array2d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int arr2[][]= {{1,2},{3,4}};
		System.out.println(arr2[1][0]);*/
		/*int arr2[][]=new int[2][2];
		System.out.println(arr2[1][0]);
		int arr3[][=new int[3]]3];*/
		/*for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.println("enter the value for index["+i+"]["+j+"]");
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+",");
			}
		}
		System.out.println();*/
		int arr3[][]=new int[3][3];
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
					System.out.println("enter the value for index["+i+"]["+j+"]");
					arr3[i][j]=sc.nextInt();
			}
		}
				for(int i=0;i<arr3.length;i++)
				{
					for(int j=0;j<arr3[i].length;j++)
					{

							System.out.print(arr3[i][j]+",");
						}
						System.out.println();
					}
				
			}
		
			
		
	}


