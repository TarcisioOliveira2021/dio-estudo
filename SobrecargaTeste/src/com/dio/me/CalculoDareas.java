package com.dio.me;
/*
 * @author Tarcisio de Oliveira
 * @since 1.0
 */
public class CalculoDareas {
	
	//Sobrecarga do m�todo calculoArea
	public static void calculoArea(double lado) {
		System.out.println("A area do quadrilatero � :" + lado * lado);
	}
	
	public static void calculoArea(double lado1, double lado2) {
		System.out.println("A area do retangulo � :" + lado1 * lado2);
	}
	
	public static void calculoArea(double baseMaior, double baseMenor, double hip) {
		System.out.println("A area do retangulo � :" + ((baseMaior + baseMenor)* hip) /2 );
	}
}
