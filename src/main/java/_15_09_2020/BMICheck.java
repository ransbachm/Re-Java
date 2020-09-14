package _15_09_2020;

import java.util.Scanner;

public class BMICheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gewicht in kg, Größe in m, Alter eingeben.");
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		double age = scan.nextInt();
		
		String res;
		
		double bmi = weight / (height * height);
		
		int offset;
		
		if(age < 25) offset = 5;
		else if(age > 64) offset = 0;
		else offset = 3;
		
		if(bmi < 24 - offset) res = "Unter";
		else if(bmi > 29 - offset) res = "Über";
		else res = "Normal";
		
		System.out.println(bmi + " " + res);

	}

}
