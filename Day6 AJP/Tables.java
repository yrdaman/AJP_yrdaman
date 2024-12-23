package Day6_AJP;

import java.util.Scanner;

public class Tables {
	
	static void printTable() {
		int i,n=1;
		Scanner sc =new Scanner(System.in);
		i=sc.nextInt();
		
		while(n<=10) {
			System.out.println(i+"X"+n+"= "+i*n);
			n++;
		}
	}
	public static void main(String[] args) {
		printTable();

	}

}
