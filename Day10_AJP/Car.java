package Day10_AJP;

public class Car extends Vechile {
    int capacity;
    int airbags;
    public Car() {
    	super(180,"abs",10);
    }
    
	public Car(int speed, String name, int millage,int capacity,int airbags) {
		super(speed, name, millage);
		this.capacity=capacity;
		this.airbags=airbags;
	}
	void carName() {
		System.out.println("Car Name : "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
