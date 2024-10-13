import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

class ReadFileWithLineNumbers {
    public static void main(String[] args) {
           try {
            // Writing to the file
            FileWriter fw = new FileWriter("sample.txt");
            String newline = System.lineSeparator();// This ensures compatibility across OS
            fw.write("Hello line 1" + newline);  // Add newline after each line
            fw.write("Hi line 2" + newline);     // Add newline
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
            e.printStackTrace();
        }

        try {
            // Create a FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Display line number and content
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            // Close the BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
