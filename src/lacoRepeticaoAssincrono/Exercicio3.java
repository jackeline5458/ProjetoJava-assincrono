package lacoRepeticaoAssincrono;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade = 0 ,idadeMenor = 0, idadeMaior = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade:");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				idadeMenor++;
			} else if (idade > 50) {
				idadeMaior++;
			}

			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);
		}
	}
