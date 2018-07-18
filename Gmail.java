import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Gmail{
public static void main(String[] args)
{
Pattern compile=Pattern.compile("[a-z]*[.]com[.][a-z]*[.][a-z]*");
Matcher matcher=compile.matcher("gmail.com.co.in");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
