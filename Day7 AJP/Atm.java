package Day7_AJP;

import java.util.Scanner;

public class Atm {
	static double Balance=0.00,Wdraw,deposit,ac2;
	static Scanner sc = new Scanner(System.in);
	static void atm() {
		int options;
		
		boolean flag=true;
		while(flag) {
		System.out.println("Welcome====YRDAMAN===ATM");
		System.out.println("1.WithDraw Money");
		System.out.println("2.Deposit Money");
		System.out.println("3.Balance Enquiry");
		System.out.println("4.Transfer Amount");
		System.out.println("5.Exit");
		
		
		
		options=sc.nextInt();
		switch(options) {
		case 1 :
			Withdraw();
			break;
		case 2 :
			Deposit();
			break;
		case 3 :
			TotalBalance();
			break;
		case 4 :
			System.out.println("enter To Acc Number");
			break;
		case 5 :
			System.out.println("Thanks Visit Again");
			flag=false;
			break;
		default:
			System.out.println("Invalid Try again");
			
		} 
	
	}
	
}
	 static void TotalBalance() {
		System.out.println("Your Balance ₹"+Balance+"/-");
	}
	 static void Deposit() {
			System.out.println("Enter Amount : ");
			
			deposit=sc.nextInt();
			Balance+=deposit;
			System.out.println("Amount ₹"+Balance+"/- is Succesfully Added");
		}
	 static void Withdraw() {
			System.out.println("Enter Amount : ");
			
			Wdraw=sc.nextInt();
			Balance-=Wdraw;
			System.out.println("Withdrawn Amount ₹"+Wdraw+"/-");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm();
	}

}
