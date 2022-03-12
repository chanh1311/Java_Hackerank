package javacoban;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
//	      Scanner sc=new Scanner(System.in);
//	        System.out.println("================================");
//	        for(int i=0;i<3;i++)
//	        {
//	            String s1=sc.next();
//	            int x=sc.nextInt();
//	            System.out.printf("%-15s%03d%n", s1, x); 		// -15s can trai du 15 ki tu, 03d du chieu dai la 3 so nguyen neu khong thi them so 0 vao,%n xuong hang//
//	        }
//	        System.out.println("================================");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("**********************************");
		  for(int i = 0 ; i < 3; i++) {
			  String s = sc.next();
			  int x = sc.nextInt();
			  System.out.printf("%-5s-%05d%n",s,x);
			  
		  }
		  System.out.println("**********************************");
	}



}

