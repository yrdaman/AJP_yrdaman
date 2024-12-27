package Day9_ajp;
//Mutli level Inheritance 
//A-->B-->C
//A is super class of B and B is super class of C

class A{
	A(){
		System.out.println("A CLASS CONSTRUCTOR");
	}
	void Call(){
		System.out.println("A CLASS Call Method");
	}	
	}

class B extends A{
	B(){
		System.out.println("C CLASS CONSTRUCTOR");
	}
	void msg(){
		System.out.println("B CLASS MSG Method");
	}
	
}
public class  C extends B {
	C(){
		System.out.println("C CLASS CONSTRUCTOR");
	}
	void whatsapp(){
		System.out.println("C CLASS Whats app Method");
	}
	public static void main(String[] args) {
		C c=new C();
		c.Call();
		c.msg();
		c.whatsapp();

	}

}