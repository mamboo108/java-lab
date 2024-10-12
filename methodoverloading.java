import java.util.*;
class Shape
{
    void area(int r)
    {
        double circle = 3.148*r*r;
        System.out.println("The area of a circle: " +circle);
        
    }
    void area(int l, int b)
    {
        int rectangle=l*b;
        System.out.println("The area of the rectanagnle: "+rectangle);
    }
    void area(float b,float h)
    {
        float triangle=0.5f*(b*h);
        System.out.println("The area of the triangle="+triangle);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Shape obj= new Shape();
        obj.area(10);
        obj.area(10,20);
        obj.area(10.5f,20.5f);
    }
    
}
