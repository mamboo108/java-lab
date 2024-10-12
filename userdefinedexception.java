import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class userdef{
    public static void checkelig(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException ("Age is less than 18 cant vote");
            
        }
        else{
            System.out.println("eligibile to vote");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        try
        {
            checkelig(age);
        }
        catch(InvalidAgeException e){
            System.out.println("caught the exception "+e.getMessage());
        }
    }
}
