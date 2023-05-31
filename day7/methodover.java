package day7;
class madam{
	public void teach() {
		System.out.println("I am a Teacher");
	}
}

class mathsmam extends madam{
	//create a method:
	public void teach() {
		super.teach();
		System.out.println("I am a Maths teacher");
	}
	
}
public class methodover {
public static void main(String[] args) {
	mathsmam sc=new mathsmam();
	sc.teach();
}
	
	

}
