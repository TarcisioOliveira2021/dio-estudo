package com.dio.me;

public class Main {
	public static void main(String[] args) {
		double calculoQ = Calculo.calcularArea(13d);
		System.out.println("O calculo da area do quadrado é : "+calculoQ);
		
		double calculoR = Calculo.calcularArea(13d,12d);
		System.out.println("O calculo da area do retangulo é : "+calculoR);
		
		double calculoT = Calculo.calcularArea(13d,12d,6d);
		System.out.println("O calculo da area do triangulo é : "+calculoT);
	}
}
