import java.util.*;
class Cal
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int prod = a*b;
        int div = a/b;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+sub);
        System.out.println("Quotient: "+div);
        System.out.println("Product: "+prod);
    }
}
