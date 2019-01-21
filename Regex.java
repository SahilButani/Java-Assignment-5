import java.util.regex.*;
public class Regex{
    public static void main(String args[]){

        Pattern p = Pattern.compile("^[A-Z].*[.]$");//. regex to check if a string begins with a capital letter and ends with a period.
        Matcher m = p.matcher("Sahil.");
        boolean b = m.matches();



        System.out.println(b);
    }}  
