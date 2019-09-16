
/**
*Reading auth file and printing summary output
*@ author Kailash Pathak
* @version 1.0
* Programming Project One
* CS322 - Compiler Construction
* Spring 2019
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AntScript {
       static  Regex regex = new Regex();
	static int counter = 0;
	public static void main(String[] args){readFile(args[0]);
String userFlag = args[1];
		int flag = Integer.parseInt(userFlag);
		switch(flag) {
		case 0:
			System.out.println(counter + " lines in the log file were parsed.");
			System.out.println("There are " + regex.mapSize(regex.ip) + " unique IP addresses in the log.");
			System.out.println("There are " + regex.mapSize(regex.users) + " unique users in the log.");
			break;
		case 1:
			regex.traverseMap(regex.ip);
			System.out.println(counter + " lines in the log file were parsed.");
			System.out.println("There are " + regex.mapSize(regex.ip) + " unique IP addresses in the log.");
			System.out.println("There are " + regex.mapSize(regex.users) + " unique users in the log.");
			break;
		case 2:
			regex.traverseMap(regex.users);
			System.out.println(counter + " lines in the log file were parsed.");
			System.out.println("There are " + regex.mapSize(regex.ip) + " unique IP addresses in the log.");
			System.out.println("There are " + regex.mapSize(regex.users) + " unique users in the log.");
			break;
		default:
			System.out.println(counter + " lines in the log file were parsed.");
			System.out.println("There are " + regex.mapSize(regex.ip) + " unique IP addresses in the log.");
			System.out.println("There are " + regex.mapSize(regex.users) + " unique users in the log.");
		}
	System.out.println("finished switch");
}
static void readFile(String filename){

try{
	System.out.println("Enter the file name  you want to process :");
	Scanner scnr= new Scanner(System.in);
		File file = new File (scnr.nextLine());
	scnr = new Scanner(file);
	while (scnr.hasNextLine()){
		String line = scnr.nextLine();
		regex.isValidIP(line);
	regex.isValidUser(line);
	counter++;
		}
		scnr.close();
		
		}
catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}

