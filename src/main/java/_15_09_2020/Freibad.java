package _15_09_2020;

import java.util.Scanner;

public class Freibad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		System.out.println("Der Eintritt kostet " + calcPrice(age));
	}
	
	private static double calcPrice(int age) {
		double stdPrice = 5d;
		
		if(age < 3) return 0;
		if(age <= 12 || age > 65) return stdPrice / 2;
		return stdPrice;
	}

}
