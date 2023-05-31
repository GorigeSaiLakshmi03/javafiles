package day5;
import java.util.Scanner;
public class Exconst {
	//employee name salary address
	private String employee;
	private String address;
	private int salary;
	
	//CONSTRUCTOR....
	public Exconst(String a,String b,int c) {
		employee=a;
		address=b;
		salary=c;
		
	}
	public String nam() {
		return employee;
	}
	public String addr() {
		return address;
	}
	public int getsal() {
		return salary;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String a=sc.next();
		String b=sc.next();
		int c=sc.nextInt();
		Exconst con=new Exconst(a,b,c);
		
		/*String name=con.nam();
		String  ad=con.addr();
		int sa=con.getsal();
		System.out.println(name);
		System.out.println(ad);
		System.out.println(sa);*/
		System.out.println("My name is "+con.employee+ " address is "+con.address+ " and  salary is "+con.salary);
		
		
	
		
	}
	

}
