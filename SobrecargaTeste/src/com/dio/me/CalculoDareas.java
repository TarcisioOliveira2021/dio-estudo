package com.dio.me;
/*
 * @author Tarcisio de Oliveira
 * @since 1.0
 */
public class CalculoDareas {
	
	//Sobrecarga do método calculoArea
	public static void calculoArea(double lado) {
		System.out.println("A area do quadrilatero é :" + lado * lado);
	}
	
	public static void calculoArea(double lado1, double lado2) {
		System.out.println("A area do retangulo é :" + lado1 * lado2);
	}
	
	public static void calculoArea(double baseMaior, double baseMenor, double hip) {
		System.out.println("A area do retangulo é :" + ((baseMaior + baseMenor)* hip) /2 );
	}
}
