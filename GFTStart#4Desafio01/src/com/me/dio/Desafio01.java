package com.me.dio;

import java.util.Scanner;
/*
 * @author Tarcisio de Oliveira
 */
public class Desafio01 {
	public static void main(String[] args) {
		double b;
		double a;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = sc.nextDouble();
		
		//calcula a média entre os dois valores.
		media = (a + b /2 );
		System.out.printf("Media = %.1f", media);
		sc.close();
	}
}
