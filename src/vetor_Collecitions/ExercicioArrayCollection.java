package vetor_Collecitions;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioArrayCollection {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		
		cores.add("azul");
		cores.add("amarelo");
		cores.add("roxo");
		cores.add("rosa");
		cores.add("cinza");
		cores.add("marrom");
		
		for (int i = 0; i < cores.size(); i++){
			System.out.println(cores.get(i));
			
		}
		
		Collections.sort(cores);
		System.out.println("cores que foram adicionadas ordenadas em ordem crescente.\r\n" + "");
		
		for (int i = 0; i < cores.size(); i++){
		    System.out.println(cores.get(i));
		}
	

	}

}
