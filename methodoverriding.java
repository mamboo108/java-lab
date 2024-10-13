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
        rectangle rec= new rectangle();
        triangle tri= new triangle();
        hexagon hex= new hexagon();
        rec.numberofsides();
        tri.numberofsides();
        hex.numberofsides();
    }
}


