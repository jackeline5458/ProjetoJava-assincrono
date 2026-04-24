package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionais6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Nome do colaborador:");
		String nome = ler.nextLine();

		System.out.println("Código do cargo:");
		int cargo = ler.nextInt();

		System.out.println("Salário:");
		float salario = ler.nextFloat();

		String cargoNome = "";
		float reajuste = 0;

		switch(cargo) {

		case 1:
			cargoNome = "Gerente";
			reajuste = 0.10f;
			break;

		case 2:
			cargoNome = "Vendedor";
			reajuste = 0.07f;
			break;

		case 3:
			cargoNome = "Supervisor";
			reajuste = 0.09f;
			break;

		case 4:
			cargoNome = "Motorista";
			reajuste = 0.06f;
			break;

		case 5:
			cargoNome = "Estoquista";
			reajuste = 0.05f;
			break;

		case 6:
			cargoNome = "Técnico de TI";
			reajuste = 0.08f;
			break;

		default:
			System.out.println("Cargo inválido");
			return;
		}

		float novoSalario = salario + (salario * reajuste);

		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargoNome);
		System.out.println("Novo salário: R$ " + novoSalario);

	}

}
