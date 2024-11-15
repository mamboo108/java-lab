import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        String data=sc.nextLine();
        
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<data.length();i++)
        {
            char ch=data.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                stack.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']')
            {
                if(stack.isEmpty())
                {
                    System.out.println("NOT BALANCED");
                    return;
                }
                char last=stack.pop();
                if((ch==')'&&last!='('||(ch=='}'&&last!='{')||(ch==']'&&last!='[')))
                {
                    System.out.println("NOT BALANCED");
                    return;
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("BALANCED EXPRESSION");
            
        }
        else
        {
            System.out.println("NOT BALANCED");
        }
    }
}
