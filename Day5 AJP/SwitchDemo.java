package ajp;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		num=sc.next();
		switch(num) {
		case "a" :
			System.out.println("Choosen value a");
			break;
		case "b" :
			System.out.println("Choosen value b");
			break;
		case "c" :
			System.out.println("Choosen value c");
			break;
		case "d" :
			System.out.println("Choosen value d");
			break;
		case "e" :
			System.out.println("Choosen value e");
			break;
		default:
			System.out.println("Invalid Char");
		} 
	}

}
