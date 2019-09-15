/**
*Searching file using regular expression
*author Kailash Pathak
*@version 1.0 
* Programming Project One
* CS3222-Compiler Construction
* Spring 2019
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Regex {
static  void  isValidIP(String ipAddr){
         
        Pattern ptn = Pattern.compile("(((\\d{3})|(\\d{2}))[.]){3}((\\d{3})|(\\d{2}))");
      
 Matcher mtch = ptn.matcher(ipAddr);
        if( mtch.find()){


        System.out.println(mtch.group(0));
}
}
static void isValidUser(String ipUser){
Pattern ptn1 = Pattern.compile("user (([a-z]+|[A-Z]+|[0-9]+)+)");
Matcher mtch1 = ptn1.matcher(ipUser);
 if( mtch1.find()){


        System.out.println(mtch1.group(0));

}
}
}


   

