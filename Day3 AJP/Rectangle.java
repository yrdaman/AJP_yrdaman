public class Rectangle{
    int length,breadth;
    int area(int l,int b){
        length=l;
        breadth=b;
        return length*breadth;
    }
    int perimeter(int l,int b){
        length=l;
        breadth=b;
        int p=2*(length+breadth);
        return p;
    }
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        int area =r.area(10,20);
        int peri =r.perimeter(10,20);
        System.out.println("area="+area+"\nperimeter = "+peri);
    }
}
