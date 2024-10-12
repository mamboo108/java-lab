import java.util.*;
class exception{
    public static int divide(int a, int b)
    {
        return a/b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value A: ");
        int a = sc.nextInt();
        System.out.println("Enter value B: ");
        int b = sc.nextInt();
        try
        {
           int result=divide(a,b);
           System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero not possible");
            
        }
        finally
        {
            System.out.println("Program over");
        }
    }
}
