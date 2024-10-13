import java.util.*;
class Freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        System.out.println("Enter the character to search: ");
        char c= sc.next().charAt(0);
        int count=0;
        int strlen=str.length();
        for(int i=0;i<strlen;i++)
        {
            if(c==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("The frequency count of "+ c +" is "+ count);
    }
}
