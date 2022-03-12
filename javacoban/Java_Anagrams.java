package javacoban;

import java.util.Arrays;
import java.util.Scanner;

//public class Java_Anagrams {
//	
//	static boolean inAnagram(String a, String b) {			// Phuong thuc cua class //
//		// chuyen 2 chuoi thanh chu thuong //
//		a = a.toLowerCase();
//		b = b.toLowerCase();
//		int sum = 0;
//		// truong hop khac do dai //
//		if(a.length() != b.length()) {
//			return false;
//		}
//		for(char x = 'a'; x < 'z'; x++) {
//			for(int i = 0; i < b.length();i++) {
//				if(a.charAt(i) == x) 
//					sum++;
//				if(b.charAt(i) == x)
//					sum--;	
//			}
//			// Xet tung ki tu //
//			if(sum != 0) return false;
//		}
//		
//		
//		// Vong for so sanh gia tri ki tu voi tung phan tu //
//		return true;
//		
//	}
//
//	public static void main(String[] args) {
//		// nhap 2 chuoi //
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		String b = sc.next();
//		
//		if(inAnagram(a, b)) System.out.println("Anagrams");
//		else System.out.println("Not Anagrams");
//		
//		
//		sc.close();
//		
//
//	}
//
//}
			// cach 2 //
public class Java_Anagrams {
	// Chuyen string sang chu thuong, dua ve mang ki tu, sap xep mang ki tu,so sanh do dai, so sanh //
	static boolean inAnagram(String a, String b) {	
		// chuyen ve chu thuong //
		char aa[] = a.toLowerCase().toCharArray(); // String to Char(Array) //
        char bb[] = b.toLowerCase().toCharArray();	// String to Char(Array) //
        // Kiem tra TH khac length //
        if(a.length() != b.length()){
            return false;
        // Sap xep 2 arr, sau do so sanh //
        }else{
            Arrays.sort(aa);
            Arrays.sort(bb);
            return Arrays.equals(aa, bb); // Arrays equals 2 tham so arr kieu char //
        }
	}
	public static void main(String[] args) {
		// Nhap du lieu //
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		// Goi ham neu bang thi hien thi theo dinh dang //
		if(inAnagram(a, b)) System.out.println("Anagrams");
		else System.out.println("Not Anagrams");
		
		// Dong //
		sc.close();
		
	}
}
	
