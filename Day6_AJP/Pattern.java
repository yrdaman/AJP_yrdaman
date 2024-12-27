package Day6_AJP;

import java.util.Scanner;

public class Pattern {
	 static void patterns(int num) {
		 int i=1;
		 while(i<=num) {
			 int j=1;
			 while(j<=i-1) {
				 System.out.print(j);
				 j+=1;
			 }
			 System.out.println(i);
			 i+=1;
		 }
	 }
	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		
		Scanner sc =new Scanner(System.in);
		patterns(sc.nextInt());
		sc.close();
	}

}
