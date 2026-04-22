package sessaoassincrona;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
			System.out.println("digite nota 1.");
			float nota1= ler.nextFloat();
			System.out.println("digite nota 2.");
			float nota2= ler.nextFloat();
			System.out.println("digite nota 3.");
			float nota3= ler.nextFloat();
			System.out.println("digite nota 4.");
			float nota4= ler.nextFloat();
			
			float calcularMedia =  (nota1+nota2+nota3+nota4)/4;
			
			System.out.println("Média final: " + calcularMedia);
			
	 
			
			

	}

}

