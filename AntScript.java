
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
	public static void main(String[] args) throws FileNotFoundException{
//creating file instance to refer  text file
try{
System.out.println("Enter the file name  you want to process :");
Scanner scnr= new Scanner(System.in);
File file = new File (scnr.nextLine());
scnr = new Scanner(file);
while (scnr.hasNextLine()){
String line = scnr.nextLine();
regex.isValidIP(line);
}
scnr.close();
}
catch (Exception ex){
ex.printStackTrace();
}
}
}

