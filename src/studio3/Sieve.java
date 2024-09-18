package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean [] sieve = new boolean[n+1];
	
		for (int i = 2; i <= n; i++){
		sieve[i] = true;
		
		for (int j= i * i; j <= n; j += i) {
			sieve[i] = false;
			}
			for (int k= i * 5; k <= n; k += i) {
				sieve[i] = false;
			}
		}
		
}
		
		
		
		
	
}
