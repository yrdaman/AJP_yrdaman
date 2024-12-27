package Day6_AJP;

import java.util.Scanner;

public class Planidrome {
	static void palindrome(int original) {
		int rem,reverse=0,temp;
		
		
		temp=original;
		while(original>0) {
			rem=original%10;
			reverse=reverse*10+rem;
			original=original/10;
		
		}
		if(temp==reverse){
			System.out.println("its Paindrome Given Val:"+temp+" rev Value"+reverse);
		}
		else {
			System.out.println("its Not a Paindrome "+temp+reverse);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int original=sc.nextInt();
		palindrome(original);
		sc.close();
	}

}
