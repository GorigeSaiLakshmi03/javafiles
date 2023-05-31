package series;

import java.util.Scanner;
public class Evenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(100/i);
				
			}
			else
			{
				 System.out.println(100*i);
			}		   
		}
		
	}

}
