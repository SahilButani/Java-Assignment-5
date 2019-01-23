import java.util.regex.*;
public class Regex{
    public static void main(String args[]){

        Pattern p = Pattern.compile("^[A-Z].*[.]$");//. regex to check if a string begins with a capital letter and ends with a period.
        
        /**
         *Following are the 5 test cases to check the regex.
         */
        Matcher m1 = p.matcher("Sahil.");
        Matcher m2 = p.matcher("butani.");
        Matcher m3 = p.matcher("Zemoso");
        Matcher m4 = p.matcher(".@^*^%##");
        Matcher m5 = p.matcher("S.");
       
        
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        boolean b3 = m3.matches();
        boolean b4 = m4.matches();
        boolean b5 = m5.matches();

        System.out.println(b1); 
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
}}

/**
 *OUTPUT:
        true
        false
        false
        false
        true
 */
