package com.me.dio;
/*
 * @author: Tarcisio de Oliveira.
 */
public class OperadoresCondicional {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		//Verificando Operações - &&
		System.out.println("b1 && b2 = ( espera-se FALSE ) Resultado = "+ (b1 && b2));
		System.out.println("b1 && b3 = ( espera-se TRUE ) Resultado = "+ (b1 && b3));

		//Verificando Operações - ||
		System.out.println("b1 || b2 = ( espera-se TRUE ) Resultado = "+ (b1 || b2));		
		System.out.println("b1 || b2 = ( espera-se TRUE ) Resultado = "+ (b1 || b2));

		//Verificando Operações - ^
		System.out.println("b1 ^ b3  = ( espera-se FALSE ) Resultado = "+ (b1 ^ b3));
		System.out.println("b4 ^ b1  = ( espera-se TRUE ) Resultado = "+ (b4 ^ b1));
		


	}

}
