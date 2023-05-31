package day8;

public class Staticmethod {
	String name;
	 int rollno;
	 static String clgnam="CBIT";
	 Staticmethod(String name,int rollno){
		 this.name=name;
		 this.rollno=rollno;
		 //this.clgnam=clgnam;
	 }	 
	 //STATIC MRTHOD:
		 public static void change(){
			  clgnam="SRIT";
			 
		 }
	 
	//method 
	public void display() {
		System.out.println("my name is "+name);
		System.out.println("my rollnum is "+rollno);
		System.out.println("my college name is "+clgnam);
	}
	public static void main(String[] args) {
		Staticmethod st=new Staticmethod("sai",431);
		//Staticmethod st1=new Staticmethod ("nani",242);
		change();
		st.display();
	

		
}
}