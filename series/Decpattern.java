package series;

import java.util.Scanner;
public class Decpattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
