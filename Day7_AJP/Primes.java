package Day7_AJP;

import java.util.Scanner;
// some issue with the code
public class Primes {
	static void allPrimes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range: ");
		int range = sc.nextInt();
		
		System.out.println("Factors of " + range + " are:");
		for (int i = 1; i <= range; i++) {
			if (range % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPrimes();
	}

}
