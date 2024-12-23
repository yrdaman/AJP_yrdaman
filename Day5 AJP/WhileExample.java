package ajp;

public class WhileExample {
	static int sum(int limit) {
		int sum=0;
		int num=1;
		// call sum of numbers till limit
		while(num<=limit) {
			sum+=num;
			num++;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("sum of first 50 numbers"+sum(5));

	}

}
