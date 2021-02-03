import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
public class CitiesRunner
{
    public static void main( String args[] ) 
    {
        String data = "";
        try
        {
            Scanner scan = new Scanner(new File("CityData.dat"));
            while(scan.hasNextLine()){
                data+=scan.nextLine()+ "/n";
            }
            scan.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        try
        {
            // THIS IS WHERE YOU OPEN THE STREAM TO WRITE TO THE FILE
            // When you write to the file, you will over-write what was there
            // (i.e. make a new copy)
            // In the FileWriter code you write, the second parameter is false, not true.
            // Set it to false to overwrite
            FileWriter a =new FileWriter("output.dat", false);
            // Open a Stream to a file that you can write to
            // FileWriter code: 
            
            // BufferedWriter code:
            BufferedWriter b = new BufferedWriter(a);
            // PrintWriter code:
            PrintWriter c = new PrintWriter(b, false);
            
            // Create an array called numbers by splitting data with the .split() method
            String[] nums = data.split("/n");
            // For each string in the array...
                // Parse the string into an int
                // Create a Prime object and pass that int as a parameter into the Prime class
                // Use the .toString() method and write to the file
            for(String num: nums){
                int n = Integer.parseInt(num);
                Cities p = new Cities(n);
                c.println(p.toString());
            }
          
            // Close the stream
            c.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
}
