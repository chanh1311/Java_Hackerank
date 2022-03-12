package javacoban;

import java.util.Scanner;

public class testScanner {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){			// vong lap vo han
            String IP = in.nextLine();
            System.out.println(IP);	// co the truy cap lop ben trong mà khong can doi tuong khi co tu khoa stacic //
        }

    }
}