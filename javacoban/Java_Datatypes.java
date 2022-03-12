package javacoban;

import java.util.Scanner;

public class Java_Datatypes {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		// for nhap //
//		int T = sc.nextInt();
//		for(int i = 0 ; i < T ; i++) {
//			try {
//				//Nhap so kiem tra //
//				long n = sc.nextLong();
//				// Kiem tra dieu kien //
//				System.out.println(n + " can be fitted in:");
//				if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
//					System.out.println("* byte\n* short\n* int\n* long");
//				else if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
//					System.out.println("* short\n* int\n* long");
//				else if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
//					System.out.println("* int\n* long");
//				else
//					System.out.println("* long");
//			 }catch(Exception e) {
//				 	  // Co dong nay de doc bo du lieu //
//					System.out.println(sc.next() + " can't be fitted anywhere.");
//			 }
//		}
//		
//		// Dong //
//		sc.close();
		
		// Nhap du lieu kiem tra //
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			try {
				double x = sc.nextDouble();
				// Kiem tra dieu kien //
				if(x > Byte.MIN_VALUE && x < Byte.MAX_VALUE) System.out.println("* byte\n* short\n* int\n* long");
				else if(x > Short.MIN_VALUE && x < Short.MAX_VALUE) System.out.println("* short\n* int\n* long");
				else if(x > Integer.MIN_VALUE && x < Integer.MAX_VALUE) System.out.println("* int\n* long");
				else System.out.println("* long");
		
				
			}catch(Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
			
	
	
		}
	
		
	}	
}
		


// c2 //
/*so sanh bang ep kieu
 			if(x == (byte)x)System.out.println("* byte");
            if(x == (short)x)System.out.println("* short");
            if(x == (int)x)System.out.println("* int");
            if(x == (long)x)System.out.println("* long");
*/

