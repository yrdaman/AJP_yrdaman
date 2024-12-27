package labs;

import java.util.Scanner;

public class CheckLepnor {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter Year to check it's Leap year or not : ");
		Scanner sc =new Scanner(System.in);
		year=sc.nextInt();// taking input form user
		//leap year condition
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
		sc.close();

	}
	public static void main() {System.out.println( " is NOT a Leap Year.");}
}
