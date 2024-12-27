package Day5_AJP;

import java.util.Scanner;

public class Results {
	int sub1,sub2,sub3,sub4;
	void findResult() {
		if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 ) {
			int total,avg,g;
			total=sub1+sub2+sub3+sub4;
			avg=total/4;
			if(avg>=80) {
				g='a';
			}
			else if(avg>=70){
				g='b';
			}
			else if(avg>=60){
				g='c';
			}
			else if(avg>=50){
				g='d';
			}
			else if(avg>=35){
				g='e';
			}
			else {
				g='f';
			}
			switch(g) {
			case 'a':
				System.out.println("Distinction");
				break;
			case 'b':
				System.out.println("pass");
				break;
			case 'c':
				System.out.println("pass");
				break;
			case 'd':
				System.out.println("pass");
				break;
			case 'e':
				System.out.println("Border-pass");
				break;
			case 'f':
				System.out.println("Take TC");
				break;
			default:
				System.out.println("Something Went wrong Try again");
			}
			System.out.println("Total Marks : "+total+"\n Average : "+avg+"\n grade : "+ g);
			
		}
		else {
			System.out.println("Failed");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 4 subject marks here: ");
		
		Scanner sc =new Scanner(System.in);
		Results r=new Results();
		r.sub1=sc.nextInt();
		r.sub2=sc.nextInt();
		r.sub3=sc.nextInt();
		r.sub4=sc.nextInt();
		r.findResult();
		sc.close();
	}

}
