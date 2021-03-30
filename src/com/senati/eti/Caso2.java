package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.model.Calculadora2;

public class Caso2 {
			public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		
			
			System.out.print("Número 1: ");
			float n1 = sc.nextFloat();
			
			System.out.print("Número 2: ");
			float n2 = sc.nextFloat();
			
			Calculadora2 calc = new Calculadora2(n1, n2);


			System.out.println("* * NUMEROS INGRESADOS * *");
			System.out.println("--------------------------");
			System.out.println("Primer número...: " + calc.getNumero1());
			System.out.println("Segundo número..: " + calc.getNumero2());
			System.out.println("\nResultados");
			System.out.println("-----------");
			
			System.out.println("1. Suma.....................: " + calc.Operar(1));
			System.out.println("2. Resta....................: " + calc.Operar(2));
			System.out.println("3. Producto.................: " + calc.Operar(3));
			System.out.println("4. Division.................: " + calc.Operar(4));
			System.out.println("5. Resto Entero.............: " + calc.Operar(5));
			System.out.println("6. Promedio.................: " + calc.Operar(6));
			System.out.println("7. Suma de cuadrados........: " + calc.Operar(7));
			System.out.println("8. Diferencia porcentual....: " + calc.Operar(8));
			System.out.println("9. Mayor....................: " + calc.Operar(9));
			System.out.println("10. Menor....................: " + calc.Operar(10));

			
			

	}

}
