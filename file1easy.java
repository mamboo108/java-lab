import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
class create
{
    public static void main(String args[])
    {
        try{
        FileWriter fw = new FileWriter("Sample.txt");
        String newline= System.lineSeparator();
        fw.write("This is line 1"+newline);
        fw.write("This is line 2"+newline);
        fw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        try
        {
            FileReader fr = new FileReader("Sample.txt");
            BufferedReader buffer= new BufferedReader(fr);
            String line;
            int linenum=1;
             while ((line = buffer.readLine()) != null)
            {
                System.out.println(linenum + " "+line);
                linenum++;
            }
            buffer.close();    
                
        }
        catch(IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }   
}
