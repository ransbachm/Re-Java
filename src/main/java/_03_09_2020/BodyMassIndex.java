package _03_09_2020;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wilkommen beim BMI-Rechner");
		System.out.println("***************************");
		System.out.println("K�rpergewicht in kg eingeben: ");
		double gewicht = scan.nextDouble();
		System.out.println("K�rpergr��e in m eingeben: ");
		double groesse = scan.nextDouble();
		
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("Der BMI betr�gt %f%n", bmi);
	}

}
