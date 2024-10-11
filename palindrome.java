import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String reversestr="";
        int strlen = str.length();
        for(int i=(strlen-1);i>=0;--i)
        
        {
            reversestr=reversestr+str.charAt(i);
            
        }
        if(str.equals(reversestr))
        {
            System.out.println(str+" Is a palindrome");
        }
        else
        {
            System.out.println(str+" Not a palindrome");
        }
        
    }
}
