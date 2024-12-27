package labs;
//lab1
	import java.util.Scanner;
	
	public class Swapping {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1,num2;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 Numbers to Swap : ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Before Swapping :\n num1 = "+num1+"\n num2 = "+num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			System.out.println("Before Swapping :\n num1 = "+num1+"\n num2 = "+num2);
            sc.close();
		}
	
	}
