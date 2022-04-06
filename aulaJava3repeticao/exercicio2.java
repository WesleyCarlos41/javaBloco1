package aulaJava3repeticao;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
			int n1;
			for (int i = 0; i <10; i++) {
				System.out.println("\nInforme um numero ");
				n1=ler.nextInt();
				if(n1 % 2 ==0) {
					System.out.println("Este numero é par ");
				}else {
					System.out.println("Este numero é ímpar" );
			}
			}

		}
}
