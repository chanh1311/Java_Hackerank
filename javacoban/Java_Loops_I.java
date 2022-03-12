package javacoban;
//
//import java.util.Scanner;
//
//public class Java_Loops_I {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 1; i <= 10;i++) {
//			System.out.printf("%d x %d = %d\n",n,i,n*i);
//		}
//	}
//
//}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


// day la mot cach doc tu ban phim khac //
public class Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
		for(int i = 1; i <= 10;i++) {
		System.out.printf("%d x %d = %d\n",N,i,N*i);
	}
        bufferedReader.close();
    }
}

