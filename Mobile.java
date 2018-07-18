import java.util.regex.*;
import java.io.*;
class Mobile
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("output.txt");
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        BufferedReader br = new BufferedReader (new FileReader("input.txt"));
        String line = br.readLine();
        while(line != null)
        {
            Matcher m = p.matcher(line); 
            while (m.find())
            {              
                pw.println(m.group());
            }
 
            line = br.readLine();
        }
        pw.flush();
    }
}
