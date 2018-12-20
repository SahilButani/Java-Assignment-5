import java.util.regex.*;
public class Regex{
    public static void main(String args[]){

        Pattern p = Pattern.compile("^[A-Z].*[.]$");//. represents single character
        Matcher m = p.matcher("Sahil.");
        boolean b = m.matches();



        System.out.println(b);
    }}  
