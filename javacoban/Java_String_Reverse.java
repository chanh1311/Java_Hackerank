package javacoban;

import java.util.Scanner;

public class Java_String_Reverse {

	public static void main(String[] args) {
		// nhap chuoi //
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		// so sanh chuoi va hien thi ket qua //
		System.out.println( A.equals( new StringBuilder(A).reverse().toString())  // StringBuilder (tao ra chuoi co the thay doi duoc) //
			    ? "Yes" : "No" );
		
		
		sc.close();
	}

}
