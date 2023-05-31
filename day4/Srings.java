package day4;

public class Srings {
	public static void main(String[] args) {
		String s1="cbit";
		String s2="cbit";
		String s3=new String("cbit");
		if(s1==s3)
		{
			System.out.println("both are same");

		}
		else {
			System.out.println("both are not same");
		}
		if(s1.equals(s3))
		{
			System.out.println("both equal(equal oper)");
		}
		else {
			System.out.println("both are nott equal(equal oper)");
		}
		if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("both equal(equalsIgnoreCase)");
			
		}
		else {
			System.out.println("both not equal(equalsIgnoreCase");
		}
		if(s1.compareTo(s3)>0) {
			System.out.println("greater(compareTo)");
	}
	else if(s1.compareTo(s3)<0)
	{
		System.out.println("lesser(compareTo)");

	}
	else {
		System.out.println("both equal(compareTo)");
	}
		System.out.println(s1.concat(s3));
		String s4=s1.concat(s3);
		System.out.println(s4);	
}
}
