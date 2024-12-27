package Day10_AJP;

public class Bus extends Vechile {
	int fuel;
	String type;
	
	public Bus(int speed, String name, int millage,String type,int fuel) {
		super(speed, name, millage);
		this.type=type;
		this.fuel=fuel;
		// TODO Auto-generated constructor stub
	}
	void busType(){
		System.out.println(name+"Bus Type : "+type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
