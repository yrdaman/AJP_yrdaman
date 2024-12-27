package Day5_AJP;

import java.util.Scanner;

public class Fibbonacci {
		
		static void fibo() {
			
			Scanner sc=new Scanner(System.in);
			int num =sc.nextInt();
			
			int first=0,second=1,result=0;
			System.out.print(first+",");
			System.out.print(second);
			while(num!=1) {
				result=first+second;
				System.out.print(","+result);
				first=second;
				second=result;
				num--;
			}
			sc.close();
		}
	public static void main(String[] args) {
		fibo();

	}

}
