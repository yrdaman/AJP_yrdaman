import java.util.Scanner;

public class Planidrome {
	static void palindrome() {
		int n,rem,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}d
		if(temp==rev){
			System.out.println("its Paindrome Given Val:"+temp+" rev Value"+rev);
		}
		else {
			System.out.println("its Not a Paindrome "+temp+rev);
		}
	}
	public static void main(String[] args) {
		palindrome();

	}

}