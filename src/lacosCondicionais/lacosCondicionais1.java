package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionais1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o numero A");
		int A = ler.nextInt();
		System.out.println("digite o numero B");
		int B= ler.nextInt();
		System.out.println("digite o numero C");
		int C = ler.nextInt();
		
		if (A + B > C) {
			System.out.println("soma de A + B maior que C");
		} else if (A + B < C) {
			System.out.println("soma de A + B menor que C");
		}else if (A + B == C) {
			System.out.println("soma de A + B igual C");
			}
		}
		

		}
