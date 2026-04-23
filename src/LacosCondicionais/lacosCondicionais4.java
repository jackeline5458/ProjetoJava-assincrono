package LacosCondicionais;

import java.util.Scanner;

public class lacosCondicionais4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = ler.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");
			
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
			
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
			
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("O número " + numero + " é ímpar e negativo!");
		}
		
		}
	}

