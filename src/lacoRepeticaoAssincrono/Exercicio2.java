package lacoRepeticaoAssincrono;

import java.util.Scanner;

public class Exercicio2 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int pares = 0;
			int impares = 0;

			for (int i = 1; i <= 10; i++) {

			    System.out.println("Digite o " + i + "º número");
			    int numeros = ler.nextInt();

			    if (numeros % 2 == 0) {
			        pares++;
			    } else {
			        impares++;
			    }

			}

			System.out.println("Total de números pares: " + pares);
			System.out.println("Total de números impares: " + impares);}}