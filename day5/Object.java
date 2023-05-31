package day5;

public class Object {
	//SAMPLE METHOD......
	public void name() {          //here name is a method name:
		System.out.println("Hello Students");
	}
	public void age() {          
		System.out.println("Students age is 19");
	}
		public void mobileno() {          
			System.out.println("9554664840");
	
		}
	
	
	 //MAIN METHOD:
	public static void main(String args[]) {
		
		//CREATION OF OBJECT:        //class name ,variable,keyword, class name()
		Object o=new Object();    //O is a "REFERENCE VARIABLE...
		o.name();
		o.age();
		o.mobileno();
		
	}
	

}
