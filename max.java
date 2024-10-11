import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value for B: ");
        int b = sc.nextInt();
        System.out.println("Enter the value for C: ");
        int c = sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a +" Is the largest");
        }
        if(b>a&&b>c)
        {
            System.out.println(b +" Is the largest");
        }
        else
        {
            System.out.println(c + " Is the largest");
        }
        
        
        
    }
}
