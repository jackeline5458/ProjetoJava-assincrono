package vetor_Collecitions;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		int vetorInteiros[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("digite o numero");
		int numero = leia.nextInt();

		for (int indice = 0; indice < 11; indice++) {
			if (numero == vetorInteiros[indice]) {
				System.out.println(" O número " + numero + " está localizado na posição:" + indice);
				encontrado = true; 
				break;
			} 
		}if (! encontrado) {
			System.out.println(" O número " + numero +" não foi encontrado!");
		}

	}

}
