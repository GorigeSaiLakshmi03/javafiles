package day4;
import java.util.Arrays;
public class Operationsonstrings {
	public static void main(String[] args) {
		String str1="Sai";
		String str2="Sai nani";
		int num=str1.length();             //length
		System.out.println(num);
		System.out.println(str2.replace('n','*'));   //replace
		int index=str1.indexOf("i");
		System.out.println("the index of i is "+index);
		String up=str1.toUpperCase();                   //upper case
		System.out.println(up);
		String low=str1.toLowerCase();//lower case
		System.out.println(low);
		String sub=str2.substring(2,5);//sub string
		System.out.println(sub);
		System.out.println(str2.charAt(5));//char at
		
		System.out.println(str2.toString());
		System.out.print(str2);
		String str3[]=new String[3];
		str3[0]="sai";
		str3[1]="lakshmi";
		str3[2]="nani";
		System.out.println(Arrays.toString(str3));
		if(str1.equals(str2))
		{
			System.out.println("both are same");
			
		}
		else {
			System.out.println("both are not same");
		}
		
		//to charArray()
		char[] ch=str2.toCharArray();
		System.out.println(ch[5]);
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			
		}
		
		

		
		
		
		
		
	}

}
