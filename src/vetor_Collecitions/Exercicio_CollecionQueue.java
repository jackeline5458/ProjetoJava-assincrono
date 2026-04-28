package vetor_Collecitions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_CollecionQueue {

	public static void main(String[] args) {

		Queue<String> filaClientes = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("\n===== MENU BANCO =====");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar clientes na fila");
			System.out.println("3 - Chamar próximo cliente");
			System.out.println("0 - Sair");
			System.out.print("Digite a opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome do cliente: ");
				String cliente = scanner.nextLine();
				filaClientes.add(cliente);
				System.out.println(cliente + " foi adicionado à fila.");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String c : filaClientes) {
						System.out.println("- " + c);
					}
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia. Não há clientes para chamar.");
				} else {
					String atendido = filaClientes.poll();
					System.out.println("Cliente chamado: " + atendido);
				}
				break;

			case 0:
				System.out.println("Programa encerrado.");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		}
	}

}
