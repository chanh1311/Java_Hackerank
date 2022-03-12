package javacoban;

import java.util.Scanner;

public class if_else {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n%2 != 0) {
			System.out.println("Weird");
		}else {
			if(n > 1 && n < 6 )
				System.out.println("Not Weird");
			else if(n > 5 && n < 21){
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}
	}

}
