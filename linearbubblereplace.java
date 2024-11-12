import java.util.*;
public class Main
{
    public static int linear(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                System.out.println("Element found "+target+"at"+i);
            }
        }
        return -1;
    }
    public static void bubble(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void display(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
    public static void character()
    {
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the character to replace: ");
        char oldchar=sc.next().charAt(0);
        System.out.println("Enter the new character: ");
        char newchar=sc.next().charAt(0);
        String newstr=str.replace(oldchar,newchar);
        System.out.println(newstr);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elments");
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        System.out.println("Linear Search");
        System.out.println("Enter the target");
        int target =sc.nextInt();
        linear(a,target);
        System.out.println("bubble sort");
        bubble(a,n);
        display(a,n);
        character();
        sc.close();
    }
}
