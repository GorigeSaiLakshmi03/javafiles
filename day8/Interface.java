package day8;

interface car{
	void price();
	void color();
	}
interface scooty{
	void aprice();
	void acolor();
}
abstract class details implements car,scooty{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("car price is 1000000");
		
	}

	/*@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("car color is black");
		
	}*/

	@Override
	public void aprice() {
		// TODO Auto-generated method stub
	System.out.println("scooty price is 90000");
		
	}

	@Override
	public void acolor() {
		// TODO Auto-generated method stub
		System.out.println("scooty color is blue");
		
	}
		
}
class dea extends details{
	public  void color() {
		System.out.println("car color is white");
	}
}
	

public class Interface {
	public static void main(String[] args) {
		/*car c=new details();
		c.color();
		c.price();
		scooty s=new details();
		s.acolor();
		s.aprice();*/
		dea d=new dea();
		d.color();
		d.price();
		d.acolor();
		d.aprice();
	}

}
