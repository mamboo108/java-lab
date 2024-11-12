import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw1=new FileWriter("file1.txt");
            String newline=System.lineSeparator();
            fw1.write("Antony"+newline);
            fw1.write("George"+newline);
            fw1.close();
        
        
        
            FileWriter fw2=new FileWriter("file2.txt");
            String newline2=System.lineSeparator();
            fw2.write("George"+newline2);
            fw2.write("Mampilly"+newline2);
            fw2.close();
        
        
           String a1[]=new String[10];
           String a2[]=new String[10];
           int index1=0;
           int index2=0;
           BufferedReader bf1=new BufferedReader(new FileReader("file1.txt"));
           BufferedReader bf2=new BufferedReader(new FileReader("file2.txt"));
           String line;
           while((line=bf1.readLine())!=null)
           {
            a1[index1]=line.trim();
            index1++;
           }
           bf1.close();
           while((line=bf2.readLine())!=null)
           {
            a2[index2]=line.trim();
            index2++;
           }
           bf2.close();
         FileWriter fw3=new FileWriter("dupli.txt");
         for(int i=0;i<index1;i++)
         {
            for(int j=0;j<index2;j++)
            {
                if(a1[i].equals(a2[j]))
                {
                    fw3.write(a1[i]+newline);
                }
            }
         }
        fw3.close();
       }
        catch(IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
     }
        
    }
