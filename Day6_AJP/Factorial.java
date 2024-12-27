package Day6_AJP;

import java.util.Scanner;

public class Factorial {
	 	 static void Fact() {
	 		 int i=1,n,o;
	 		 
	 		 
			Scanner sc =new Scanner(System.in);
	 		 n=sc.nextInt();
	 		 o=n;
	 			while(n!=0) {
	 				i*=n;
	 				n--;
	 			}
	 			System.out.println("Factorial of "+o+" "+i);
				 sc.close();
	 	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact();


}

}
