package sessaoassincrona;

import java.util.Scanner;

public class VariaveisOperadores3 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        System.out.println("Digite o salário bruto:");
	        float salarioBruto = ler.nextFloat();

	        System.out.println("Digite o adicional noturno:");
	        float adicionalNoturno = ler.nextFloat();

	        System.out.println("Digite as horas extras:");
	        float horasExtras = ler.nextFloat();

	        System.out.println("Digite os descontos:");
	        float descontos = ler.nextFloat();

	        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

	        System.out.println("Salário Líquido: " + salarioLiquido);


	}

}
