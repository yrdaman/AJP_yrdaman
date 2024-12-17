package Day4AJP.Control_flows;

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
        int num=40;
        Evenodd edd=new Evenodd();
        edd.check(num);
    }
}
