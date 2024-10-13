import java.util.*;
class first
{ 
    public void one()
    {
        System.out.println("First level");
    }
}

class second extends first
{
    public void two()
    {
        System.out.println("Second level");
    }
}
class third extends second
{
    public void three()
    {
        System.out.println("third level");
    }
}
public class main
{
    public static void main(String args[])
    {
        third obj = new third();
        obj.one();
        obj.two();
        obj.three();
    }
}


