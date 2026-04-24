package lacoRepeticaoAssincrono;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo:");
		int numero1 = ler.nextInt();

		System.out.println("Digite o último número do intervalo: :");
		int numero2 = ler.nextInt();

		if (numero2 <= numero1  ) {
			System.out.println("INTERVALO INVÁLIDO!");
			return;
		}
			for(int i = numero1; i<= numero2; i++){
				if(i % 3== 0 && i % 5== 0) {
					System.out.println(i + " é múltiplo de 3 e 5 ");
				}
			}
			
			
	}

}