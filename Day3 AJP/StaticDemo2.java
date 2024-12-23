class StaticExample2{
	int num;
    static int value;

    static{
		System.out.println("Static Block");
	}
	public static void message(){
		System.out.println("Static Method");
	}
    public void access(){
        System.out.println("num"+num+",Static value ="+value);
    }
	
}
public class StaticDemo2 {
public static void main(String args[]){
	StaticExample2.message();
    StaticExample2 ex =new StaticExample2();
    ex.num=30;
    ex.access();
    
}
}