package LacosCondicionais;

import java.util.Scanner;

public class lacosCondicionais5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Código do produto:");
		int codigo = ler.nextInt();

		System.out.println("Quantidade:");
		int quantidade = ler.nextInt();

		String produto = "";
		float preco = 0;
		float total;

		switch(codigo) {

		case 1:
			produto = "Cachorro Quente";
			preco = 10;
			break;

		case 2:
			produto = "X-Salada";
			preco = 15;
			break;

		case 3:
			produto = "X-Bacon";
			preco = 18;
			break;

		case 4:
			produto = "Bauru";
			preco = 12;
			break;

		case 5:
			produto = "Refrigerante";
			preco = 8;
			break;

		case 6:
			produto = "Suco de laranja";
			preco = 13;
			break;

		default:
			System.out.println("Código inválido");
			return;
		}

		total = quantidade * preco;

		System.out.println("Produto: " + produto);
		System.out.println("Valor total: R$ " + total);


	}

}
