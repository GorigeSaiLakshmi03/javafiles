package series;

import java.util.Scanner;
public class Perfectnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%2==0)
			{
				sum=sum+i;	
			}
		}
		if(n==sum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}		
	}
}
