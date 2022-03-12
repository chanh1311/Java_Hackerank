package javacoban;

import java.util.Scanner;

public class myCode {
// nhung gi khai bao static la deu danh cho class chu khong phai obj //
static Scanner input = new Scanner(System.in);
static boolean flag = true;
static int B = input.nextInt();
static int H = input.nextInt();
// khoi nay luon chay //
static{
	try {
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
            // muon dua ra 1 ngoai len checked thi can co try catch hoac throw ben ngoai //
        }
	}catch(Exception e) {
    	 System.out.println(e);
     }
}




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

