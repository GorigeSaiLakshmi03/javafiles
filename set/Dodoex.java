package set;
import java.util.Scanner;
import java.util.ArrayList;
public class Dodoex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		a.add(sc.next());
		a.add(sc.next());
		a.add(sc.next());
		a.add(sc.next());
		System.out.println("Original ArrayList:" +a);
		ArrayList <String>b=new ArrayList<String>();
		b.addAll(a);
		b.add(sc.next());
		b.add(sc.next());
		System.out.println("After Copy:" +b);
	}
	

}
