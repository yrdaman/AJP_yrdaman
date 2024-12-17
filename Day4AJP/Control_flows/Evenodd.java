package Day4AJP.Control_flows;

import java.util.Scanner;

public class Evenodd {
   void check(int num){
    if(num%2==0)
    {
        System.out.println("Even number");
    }
    else{
        System.out.println("ODDDD number");
    }
   }
    public static void main(String[] args) {
        //int num=40;
        //Evenodd edd=new Evenodd();
        //edd.check(num);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check Even or ODd");
        int num=scanner.nextInt();
        Evenodd edd=new Evenodd();
        edd.check(num);
        
    }
}
