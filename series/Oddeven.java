package series;

import java.util.Scanner;
public class Oddeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			for(int i=5;i<=10;i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			for(int j=1;j<=5;j++) {
				System.out.println(j);
			}
		}
	}

}
