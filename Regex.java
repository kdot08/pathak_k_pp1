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
import java.util.HashMap;
import java.util.Map; 
public class Regex {
	static HashMap<String, Integer> ip = new HashMap<String, Integer>();
	static HashMap<String, Integer> users = new HashMap<String, Integer>();
static  void  isValidIP(String ipAddr){
  
        Pattern ptn = Pattern.compile("(((\\d{3})|(\\d{2}))[.]){3}((\\d{3})|(\\d{2}))");
  
 Matcher mtch = ptn.matcher(ipAddr);
        if(mtch.find()) {
				if(ip.containsKey(mtch.group(0))) {
					int count = ip.get(mtch.group(0));
					ip.put(mtch.group(0), count + 1);
				} else {
					ip.put(mtch.group(0), 1);
				}
			}
}
static void isValidUser(String ipUser){
Pattern ptn1 = Pattern.compile("user (([a-z]+|[A-Z]+|[0-9]+)+)");
Matcher mtch1 = ptn1.matcher(ipUser);
 if(mtch1.find()) {
			String buffer = mtch1.group(0).substring(5);
			
				if(users.containsKey(buffer)) {
					int count = users.get(buffer);
					users.put(buffer, count + 1);
				} else {
					users.put(buffer, 1);
				}
			}
}
static int mapSize(HashMap<String, Integer> map) {
		return map.size();
	}

	static void traverseMap(HashMap<String, Integer> map) {
		for (String i : map.keySet() ) {
			System.out.println(i + " :" + map.get(i)); 
		}
	}
}


   

