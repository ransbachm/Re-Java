package _03_09_2020;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int div = a/b;
		int rest = a%b;
		
		System.out.println("Division : " + div);
		System.out.println("Rest : " + rest);
		
	}

}
