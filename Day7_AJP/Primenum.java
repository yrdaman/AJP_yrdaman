package Day7_AJP;

import java.util.Scanner;
// some issue with the code
public class Primenum {
	static void isPrime(int target) {
		
		boolean value =true;
		for(int num=2;num>target/2;num++) {
			if(target%num==0) {
				value=false;
			}
		}
		if(value) {
			System.out.println(target+"is not Prime");
		}
		else{
			System.out.println(target+"is  Prime");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter no :");
		
		Scanner sc = new Scanner(System.in);
		isPrime(sc.nextInt());
		sc.close();

	}

}
