package javacoban;



import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Java_Currency_Formatter {
    
	public static void main(String[] args) {
		// Input //
	    Scanner scanner = new Scanner(System.in);
	    double payment = scanner.nextDouble();
	    scanner.close();
	    
	    // format //
	    String us= NumberFormat
	            .getCurrencyInstance(Locale.US)
	            .format(payment);
	    String india= NumberFormat
	            .getCurrencyInstance(new Locale("en", "in"))
	            .format(payment);        

	    String china= NumberFormat
	            .getCurrencyInstance(Locale.CHINA)
	            .format(payment);

	    String france= NumberFormat
	            .getCurrencyInstance(Locale.FRANCE)
	            .format(payment);
	    
	    // Hien thi //
	    System.out.println("US: " + us);
	    System.out.println("India: " + india);
	    System.out.println("China: " + china);
	    System.out.println("France: " + france);
	}
	    
}
