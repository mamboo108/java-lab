import java.util.*;
class Arr
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("\nThe elements are");
        for(int i=0;i<num;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
