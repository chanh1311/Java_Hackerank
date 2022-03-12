package javacoban;

import java.util.Scanner;

public class test_Scanner {

	public static void main(String[] args) {
		// vay la ham scanner co the doc cung dong or khác dong //
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next();
		int myInt = scanner.nextInt();
		scanner.close();

		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);

	}

}
