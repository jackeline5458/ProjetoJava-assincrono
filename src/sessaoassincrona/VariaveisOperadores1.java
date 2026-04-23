package sessaoassincrona;

import java.util.Scanner;

public class VariaveisOperadores1 {

	public static void main(String[] args) {
	 	
	 Scanner leia= new Scanner(System.in);
	 
	 System.out.println("digite o salario");
	 float salario = leia.nextFloat();
	 System.out.println("digite o abono");
	 float abono = leia.nextFloat();
	
	 float novoSalario = salario + abono; 
	 
	 System.out.println("seu novo salario é de: " +novoSalario);



	}

}
