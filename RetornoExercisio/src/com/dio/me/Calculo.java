package com.dio.me;

public class Calculo {

	public static double calcularArea(double lado){
		return lado*lado;
	}
	
	public static double calcularArea(double lado1,double lado2){
		return lado1*lado2;
	}
	
	public static double calcularArea(double baseMaior,double baseMenor, double hip){
		return ((baseMaior * baseMenor)*hip)/2;
	}
}
