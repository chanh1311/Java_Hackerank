package javacoban;

import java.util.Scanner;

public class Stdin_and_StdoutII {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
	int songuyen = Integer.parseInt(input.nextLine());
	double sothuc = Double.parseDouble(input.nextLine());
	String string = input.nextLine();
	
	System.out.println("String: " + string);
	System.out.println("Double: " + sothuc);
	System.out.println("Int: " + songuyen);
	}
}
