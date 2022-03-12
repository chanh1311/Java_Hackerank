package javacoban;

import java.util.Scanner;

public class Java_End_of_file {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNextLine()) {
			count += 1;
			String input = sc.nextLine();
			if(input.equals("")) break;
			System.out.println(count + " " + input);
		}

	}

	
}


