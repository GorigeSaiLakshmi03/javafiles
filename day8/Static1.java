package day8;

public class Static1 {
	 String name;
	 int rollno;
	 String clgnam="CBIT";
	 Static1(String name,int rollno,String clgnam){
		 this.name=name;
		 this.rollno=rollno;
		 this.clgnam=clgnam;
	 }
	//method 
	public void display() {
		System.out.println("my name is "+name);
		System.out.println("my rollnum is "+rollno);
		System.out.println("my college name is "+clgnam);
	}
	public static void main(String[] args) {
		Static1 st=new Static1("sai",431,"cbit");
		Static1 st1=new Static1 ("nani",242,"cbit");
		st.display();
		st1.display();
		
		
		
	}

}
