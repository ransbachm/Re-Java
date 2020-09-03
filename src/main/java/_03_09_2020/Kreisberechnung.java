package _03_09_2020;

import java.util.Scanner;

public class Kreisberechnung {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double PI = 3.1416d;
		
		System.out.print("Radius in cm eingeben: ");
		double radius = scan.nextDouble();
		
		double durchmesser = radius * 2d;
		double fläche = (radius * radius) * PI;
		double umfang = 2 * PI * radius;
		
		System.out.println("Durchmesser : " + durchmesser);
		System.out.println("Kreisfläche :" + fläche);
		System.out.println("Kreisumfang : " + umfang);
		
	}

}
