package lacoRepeticao;

import java.util.Scanner;

public class exemplowhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int numero1, numero2, resultado;
        String continua = "";
        
        while(!continua.equalsIgnoreCase("n"))
        
        System.out.println("Digite primeiro valor: ");
        numero1 = leia.nextInt();

        System.out.println("Digite segundo valor: ");
        numero2 = leia.nextInt();

        resultado = numero1 + numero2;
        
        System.out.println("o resultado é " + resultado);
        System.out.println("deseja continuar s/n ?" );
        continua = leia.next();
        
		
	}
		   
	        

		
	}

