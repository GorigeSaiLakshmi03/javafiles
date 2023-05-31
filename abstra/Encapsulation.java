package abstra;
import java.util.Scanner;
 class cbit{
	 private String name;
	 private int age;
	 
 //FOR SETTING VALUE METHOD WITH PARAMETERS.....
	 //FOR GETTERS VALUE METHOD EITH RETURN TYPE....
	 //SETTERS:......
	 public void setnam(String name) {
		 this.name=name;
	 }
	 public void setage(int age) {
		 this.age= age;
	 }
	 // GETTING A VALUE:...
	 public int getage() {
		 return age;
	 }
	 public String getnam() {
		 return name;
	 }
	 
	  } 
public class Encapsulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		cat ca=new cat();
		ca.sound();
		cbit cb=new cbit();
		System.out.println("Enter the name:");
		String n=sc.next();
		System.out.println("Enter the age");
        int a=sc.nextInt();
        cb.setnam(n);
        cb.setage(a);
        System.out.println("My name is "+cb.getnam()+" and  my age is "+cb.getage());
		}
}
