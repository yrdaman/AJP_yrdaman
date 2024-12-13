

class Rectangle{
    //instance variables,instance methods
    int length,breadth;
    int Area(){
        length=10;
        breadth=5;
        return length*breadth;
    }
    int Perimeter(int l,int b){
        length=l;
        breadth=b;
        int area=2*(l+b);
        System.out.println(area);
        return area;
    }
}
    public class Rectanglearea {
    public static void main(String[] args) {
        Rectangle RecArea= new Rectangle();
        int drum=RecArea.Perimeter(10, 5);
        System.out.println(drum);

    }
}
