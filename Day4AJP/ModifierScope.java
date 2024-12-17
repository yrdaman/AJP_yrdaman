package Day4AJP;

public class ModifierScope{
    public static void main(String args[])
    {
    Car c =new Car();
    c.capacity=4;
    c.name="M3GT4";
    c.speed=320;
    //c.milllage=20;
    c.setMillage(20);
    System.out.println("CAr DEtails: "+c.name+c.capacity+c.speed+c.setMillage);
    }
    }
