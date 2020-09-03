package _03_09_2020;

import java.util.Scanner;

public class Huenerhof {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anzahl der Hühner eingeben: ");
		double anzahlHuener = scan.nextDouble();
		System.out.print("Anzahl der Tage eingeben: ");
		double anzahlTage = scan.nextDouble();
		
		double mengeFutter = anzahlHuener * anzahlTage * 0.130d; // 130 gramm
		double anzahlEier = (anzahlHuener * 5.6d) / 7 * anzahlTage;
		
		System.out.printf("%n%.2f Hüner legen in %.2f Tagen %.2f Eier.%n", anzahlHuener, anzahlTage, anzahlEier);
		System.out.printf("Die %.2f Hüner brauchen während dieser Zeit %.2f kg Futter.%n", anzahlHuener, mengeFutter);
	}

}
