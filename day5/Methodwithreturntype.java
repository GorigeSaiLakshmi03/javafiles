package day5;
import java.util.Scanner;
public class Methodwithreturntype {
	//method creation
	public  int ret() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		/*int n1=10;
		int n2=20;*/
		int sum=n1+n2;
		return sum;
	}

	
	//main method
	public static void main(String[] args) {
		Methodwithreturntype result=new Methodwithreturntype();
		int sum1 = result.ret();
		System.out.println(sum1);
		
	}	
	
		
	}
	


