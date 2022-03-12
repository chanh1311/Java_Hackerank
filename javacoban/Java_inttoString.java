package javacoban;
// chuyen so thanh chuoi //
import java.util.*;
import java.security.*;
public class Java_inttoString {
 public static void main(String[] args) {

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
   String s = n +"" ;
   //String s = Integer.toString(n);
   //String s = String.valueOf(n);
   if(n == Integer.parseInt(s)) {
	   System.out.println("Good job");
   }else {
	   System.out.println("Wrong answer");
   }

  }catch(Exception e) {
	   System.out.println("Dau vao khong hop le!");
   }
}
  
}
 
