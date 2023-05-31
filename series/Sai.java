package series;
import java.util.Scanner;
public class Sai {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("N");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("A");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("N");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("I");
			}
			System.out.println();
		}
		
	}

}
