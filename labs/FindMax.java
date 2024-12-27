package labs;
//lab1
import java.util.Scanner;

public class FindMax {

	class Swapping{


		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Finding max of two elements
		System.out.println("FIND MAX ELEMENT \n Give inputs :");
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println((num1>num2)?num1:num2);
		//swapping without third variable
        sc.close();	
	}

	
}
