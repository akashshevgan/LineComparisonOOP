package linecomparisonOOP;

import java.util.Scanner;

public class LinecomparisonOOP {
	
	static Scanner sc = new Scanner (System.in);

	public static double line() {

		System.out.println ("Enter the Values of line =");
		double x1 = sc.nextDouble ();
		double x2 = sc.nextDouble ();
		double y1 = sc.nextDouble ();
		double y2 = sc.nextDouble ();
		double length = Math.sqrt((Math.pow((x2 - x1) , 2)) + (Math.pow((y2 - y1) , 2)) );
		System.out.println ("Length of Line is = " 	+ length);
		return length;

	}
	
	public static void main (String[] args) {

		System.out.println ("Welcome to Line Comparison using object oriented programing");
		line();
	}
}
