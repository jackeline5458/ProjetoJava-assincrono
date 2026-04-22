package sessaoassincrona;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número 1:");
        float n1 = ler.nextFloat();

        System.out.println("Digite o número 2:");
        float n2 = ler.nextFloat();

        System.out.println("Digite o número 3:");
        float n3 = ler.nextFloat();

        System.out.println("Digite o número 4:");
        float n4 = ler.nextFloat();

        float diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + diferenca);
    }


	}


