class StaticExample{
	static{
		System.out.println("Static Block");
	}
	public static void message(){
		System.out.println("Static Method");
	}
	
}
public class StaticDemo{
public static void main(String args[]){
	StaticExample.message();
}
}