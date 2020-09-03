package _03_09_2020;

import java.util.Scanner;

public class Temperaturrechner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Wert der Fahrenheit-Skala eingeben: ");
		
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32d) * (5d/9d);
		
		System.out.printf("%f Grad Fahrenheit sind %f Grad Celsius%n", fahrenheit, celsius);
	}

}
