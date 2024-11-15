import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of emelents to push");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            
            int ele=sc.nextInt();
            stack.push(ele);
        }
        System.out.println("AFTER PUSHING"+stack);
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("\nStack after popping all elements: " + stack);
    }
}
