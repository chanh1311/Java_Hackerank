package javacoban;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Java_Regex_IP {

	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNextLine()){			// vong lap vo han
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));	// co the truy cap lop ben trong mà khong can doi tuong khi co tu khoa stacic //
	        }

	}
}
	//Write your code here
	 class MyRegex{			// nam trong 1 class khac nen can co tu khoa static //
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255; // khong co tu khoa static //
	}
	// \\d{1,2} catches any one or two digit number
	// (0|1)\\d{2} catches any three digit number starting with 0 or 1.
	// 2[0-4]\\d catches numbers between 200 and 249.
	// 25[0-5] catches numbers between 250 and 255.121.234.12.12

