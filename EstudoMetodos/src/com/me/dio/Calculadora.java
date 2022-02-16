package com.me.dio;

public class Calculadora {

	public static void soma(double x,double y) {
		double res = x + y;
		System.out.println("A soma dos numeros: "+x+"+"+y+" é "+res);
	}
	
	public static void subtrair(double x,double y) {
		double res = x - y;
		System.out.println("A subtração dos numeros: "+x+"+"+y+" é "+res);
	}
	
	public static void multiplicacao(double x,double y) {
		double res = x * y;
		System.out.println("A multiplicacao dos numeros: "+x+"+"+y+" é "+res);
	}
	
	public static void divisao(double x,double y) {
		double res = x / y;
		System.out.println("A divisao dos numeros: "+x+"+"+y+" é "+res);
	}
}
