import java.util.*;
abstract class Shape
{
    abstract void numberofsides();
}
class rectangle extends Shape
{
    void numberofsides(){
    System.out.println("The number of sides of a rectangle=4");
    }
}
class triangle extends Shape
{
   void numberofsides(){
   System.out.println("The number of sides of a triangle=3");
   }
    
}
class hexagon extends Shape
{
    void numberofsides(){
    System.out.println("The number of sides of a hexagon=6");
    }
}
public class poly
{
    public static void main(String args[])
    {
        Shape rec= new rectangle();
        Shape tri=new triangle();
        Shape hex= new hexagon();
        rec.numberofsides();
        tri.numberofsides();
        hex.numberofsides();
    }
}
