         //METHOD OVER LOADING:
package day6;
public class Para {
	public void pa(String a) {
		System.out.println(a);
	}
   public void pa(int b) {
	   System.out.println(b);
   }
   public void pa(String c,int d) {
	   System.out.println("name is"+c+"age is"+d);
   }
   public void pa(int e,String f) {
	   System.out.println("the value"+e+"the string is "+ f);
   }
   public static void main(String[] args) {
	   Para sc=new Para();
	   sc.pa("12");
	   sc.pa("kavya");
	   
	   
	   
	   
   }
}
