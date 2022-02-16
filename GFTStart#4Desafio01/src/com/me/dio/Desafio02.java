package com.me.dio;

import java.util.Scanner;

public class Desafio02 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n;
		System.out.print("Digite o valor: ");
		n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}

}
