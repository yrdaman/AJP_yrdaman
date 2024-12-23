package Day6_AJP;

import java.util.Scanner;

public class Dowhile {
	 static  void sumofEven(int range) {
		 int num=0,sum=0;
		 
		 do {
			 if(num%2==0) {
				 sum+=num;}
				 num++;
			 
		 }while(num<=range);
		 System.out.println("Sum of Even Number in range :"+range+" = "+sum);
		 
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		sumofEven(sc.nextInt());
	}

}
