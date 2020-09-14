package _15_09_2020;

import java.util.Scanner;

public class BiggerIsBetter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vergleich:");
		
		System.out.print("Erste Zahl : ");
		int first = scan.nextInt();
		System.out.print("Zweite Zahl : ");
		int second = scan.nextInt();
		
		System.out.println("Größerer Wert: " + (first > second ? first : second));
	}

}
