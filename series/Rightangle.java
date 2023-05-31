package series;

import java.util.Scanner;

public class Rightangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("right angled");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		//right angle...if you give the space in the star place the o/p is like this and with out space the o/p is right angle..
		
		
	

}
}