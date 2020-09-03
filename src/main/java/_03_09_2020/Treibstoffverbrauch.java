package _03_09_2020;

import java.util.Scanner;

public class Treibstoffverbrauch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Anzahl LKWs: ");
		double anzLKW = scan.nextDouble();
		System.out.println("Anzahl Tage: ");
		double tage = scan.nextDouble();
		
		double verbrauch = anzLKW * tage * (35d * 4.5d);
		System.out.println("Zu erwartender Verbrauch: " + verbrauch);
	}

}
