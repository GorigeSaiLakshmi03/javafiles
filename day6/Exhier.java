package day6;
class one{
	//String name="teacher";
public void teach() {
	System.out.println("teacher is teaching");


	System.out.println("teacher is taking attendance");
}		
}
class math extends one{
	//String nam="maths";
	public void teach() {
		super.teach();
	System.out.println("teacher is teaching mathematics");
}
}
class science extends one{
//String name1="science";
public void teach() {
	System.out.println("teacher is teaching science");
}
}
public class Exhier  {
	public static void main(String[] args) {
		math r=new math();
		science k=new science();		
		r.teach();
		k.teach();
		
		

		/*System.out.println(r.name);
		System.out.println(r.nam);
		System.out.println(k.name1);*/
	}
}
