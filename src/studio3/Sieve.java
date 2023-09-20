package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What number do you want to find prime numbers up to?");
		int n = scan.nextInt();
		
		boolean [] booleanA = new boolean [n+1];
		
		for (int i = 2; i <= n; i++) {
			for (int a = 0; a <= n; a++) {
				if ((a % i == 0) && (a != i)) {
					booleanA[a] = true;
				}
			}
			
		}
		
		for (int b = 2; b < n; b++) {
			if (booleanA[b] == false) {
				System.out.println(b);
			}
		}
			
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
