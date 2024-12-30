package labs;

class Addition{
	// Method to add two numbers
	void add(int a,int b) {
		System.out.println("Sum of a,b ="+(a+b));
	}
	//	Metjod to add 3 numbers 
	void add(int a,int b,int c) {
		System.out.println("Sum of a,b,c ="+(a+b+c));
	}
	//	Metjod to add 4numbers 
	void add(int a,int b,int c,int d) {
		System.out.println("Sum of a,b,c,d ="+(a+b+c+d));
	}
}

public class OverloadAdd extends Addition {
public static void main(String[] args) {
Addition a=new Addition();

a.add(2, 4);
a.add(3, 4, 5);
a.add(4,5,6,7);

}
}
