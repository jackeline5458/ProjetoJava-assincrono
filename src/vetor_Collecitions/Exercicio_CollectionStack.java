package vetor_Collecitions;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_CollectionStack {

	public static void main(String[] args) {
		 Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcao = -1;

	        while (opcao != 0) {

	            System.out.println("\n===== MENU BIBLIOTECA =====");
	            System.out.println("1 - Adicionar livro na pilha");
	            System.out.println("2 - Listar livros da pilha");
	            System.out.println("3 - Retirar livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.print("Digite uma opção: ");

	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {

	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = scanner.nextLine();
	                    pilhaLivros.push(livro);

	                    System.out.println("\nPilha:");
	                    for (String l : pilhaLivros) {
	                        System.out.println(l);
	                    }

	                    System.out.println("\nLivro adicionado!");
	                    break;

	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia!");
	                    } else {
	                        System.out.println("Lista de Livros na Pilha:");
	                        for (String l : pilhaLivros) {
	                            System.out.println(l);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia!");
	                    } else {
	                        String removido = pilhaLivros.pop(); 

	                        System.out.println("\nPilha:");
	                        for (String l : pilhaLivros) {
	                            System.out.println(l);
	                        }

	                        System.out.println("\nUm livro foi retirado da pilha: " + removido);
	                    }
	                    break;

	                case 0:
	                    System.out.println("Programa Finalizado!");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }

	}

}
