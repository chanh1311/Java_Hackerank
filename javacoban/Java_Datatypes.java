package javacoban;

import java.util.Scanner;

public class Java_Datatypes {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			try {
				long x = sc.nextLong();
				System.out.printf("%d can be fitted in:%n",x);
				// Kiem tra dieu kien //
				if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte\n* short\n* int\n* long");
				else if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short\n* int\n* long");
				else if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int\n* long");
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

