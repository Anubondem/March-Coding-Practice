
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
    // initializing variables
    int number;
    double numberd;
    String se;
    
    // reading input
    number = scan.nextInt();  
    numberd = scan.nextDouble();  
    se = scan.nextLine();
      
    //displaying ouput
    System.out.println(number + i);  
    
    System.out.println(numberd + d); 
    
    System.out.println(s + se); 
        scan.close();
    }
}