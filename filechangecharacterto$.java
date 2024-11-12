import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw1=new FileWriter("File1.txt");
            String newline=System.lineSeparator();
            fw1.write("Antony"+newline);
            fw1.close();
            
            BufferedReader bf = new BufferedReader(new FileReader("File1.txt"));
            String line;
            FileWriter fw2= new FileWriter("File2.txt");
            while((line=bf.readLine())!=null)
            {
               String mod=line.replaceAll("[AEIOUaeiou]","\\$");
               System.out.println(mod);
               fw2.write(mod);
            }
            
            bf.close();
            fw2.close();
            
        }
        catch(Exception e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
