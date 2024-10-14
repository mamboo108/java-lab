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
        String newline = System.lineSeparator();
        fw.write("Hi my name is antony"+newline);
        fw.write("Hi my name is george"+newline);
        fw.close();
        }
        catch(IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
        try
        {
            FileReader fr = new FileReader("Sample.txt");
            BufferedReader bf = new BufferedReader(fr);
            String line;
            int linenum=0;
            int charcount=0;
            int wordcount=0;
            while((line=bf.readLine())!=null)
            {
                charcount+=line.length();
                linenum++;
                String[] words = line.split("\\s+");
                wordcount += words.length;
            }
            System.out.println("Number of lines : "+ linenum);
            System.out.println("Number of characters: "+charcount);
            System.out.println("Number of words: "+wordcount);
            bf.close();
        }
        catch(IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }    
    
    }
}
