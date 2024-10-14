abstract class Shape
{
     void numberofsides()
     {
         System.out.println("This line will not get displayed");
     }
}

class rectangle extends Shape
{
    void numberofsides()
    {
        System.out.println("NUmber of side 4");
    }
}
class triangle extends Shape
{
    void numberofsides()
    {
        System.out.println("NUmber of side 3");
    }
}

class hexagon extends Shape
{
    void numberofsides()
    {
        System.out.println("NUmber of side 6");
    }
}
public class Main
{
    public static void main(String args[])
    {
        Shape rec= new rectangle();
        Shape tri= new triangle();
        Shape hex= new hexagon();
        rec.numberofsides();
        tri.numberofsides();
        hex.numberofsides();
    }
}


