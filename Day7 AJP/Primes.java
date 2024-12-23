package Day7_AJP;

import java.util.Scanner;

public class Primes {
	static void allPrimes() {
		int range;
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		boolean flag=true;
		for(int i=1;i<=range;i++) {
			if(range%i==0) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPrimes();
	}

}
