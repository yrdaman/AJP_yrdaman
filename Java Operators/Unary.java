
public class Unary{
    //unary operators are -,+,--,++
public static void main(String args[]){
int num=25;
System.out.println(num);
//post increment
int num2=num++;
System.out.println(num+ "  " +num2);
//pre increment
num2=++num;
System.out.println(num+ "  " +num2);


//character
char ch='a';
char ch2=ch++;
System.out.println(ch +"  "+ch2);
}
}