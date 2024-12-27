package labs;

import java.util.Scanner;

public class StrongNumber {
	static int Fact(int n) {
		int fac=1;
		
			while(n!=0) {
				fac*=n;
				n--;
				}
			return fac;
	}
	public static void main(String[] args) {
		/*1.Strong Number Strong number is a special number whose sum of factorial of digits is equal to the original number. 
		For example: 145 is a strong number. Since, 1! + 4! + 5! = 145*/
		int x,sum=0,real,rem=0;
		System.out.print("Strong Number \n Enter the Number to find the it's Strong or Not :");
		Scanner sc= new Scanner(System.in);//taking input from the user
		x=sc.nextInt();
		real=x;//Making a Copy of the input value
		while (x!=0) {
			rem=x%10;		//Taking out the last digit from the input
			sum+=Fact(rem);	//finding the Factorial of the taken digit and adding the factorial of num to sum
			x=x/10;         //cutting out last element from the input
			}
		if(real==sum) {
			System.out.println("\n Number \""+real+"\" Strong Number");
		}
		else {
			System.out.println("\n Number \""+real+"\" is Not a Strong Number");
		}
        sc.close();	
		}
       	
	}


