package day2;
import java.util.Scanner;
public class Diagonaladd{
	public static void main(String[] args) {
		System.out.println("enter the size of matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int sum1=0;
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.println("enter the value for index["+i+"]["+j+"]");
						arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array element");
					for(int i=0;i<arr.length;i++)
					{
						for(int j=0;j<arr[i].length;j++)
						{

								System.out.print(arr[i][j]+" ");
					    }
							System.out.println();
						
					}
					for(int i=0;i<arr.length;i++)
					{
						for(int j=0;j<arr[i].length;j++)
						{
							if(i==j)
							{
								sum=sum+arr[i][j];
							}
							else {
								sum1=sum1+arr[i][j];
							}
						}
					}
						/*System.out.println(arr[0][0]);
						System.out.println(arr[1][1]);
						System.out.println(arr[2][2]);
						int arr1=arr[0][0]+arr[1][1]+arr[2][2];
						System.out.println(arr1);*/
					System.out.println("the sum is" +sum+ " " +sum1);
										
						
	}
}
								


								
		
		
		

		


