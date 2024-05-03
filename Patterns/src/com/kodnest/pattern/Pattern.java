package com.kodnest.pattern;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[][] n = findPattern(num);
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

	public static int[][] findPattern(int n) {
		int[][] num = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(((i+j)%2==0) || (i==j)) {
					num[i][j] = 1;
				}
				else {
					num[i][j] = 0;
				}
			}
		}
		return num;
	}
}