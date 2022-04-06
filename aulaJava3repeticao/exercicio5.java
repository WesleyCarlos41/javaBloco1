package aulaJava3repeticao;

import java.util.Scanner;

public class exercicio5 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
			int numero,soma=0;
			
			do { 
				System.out.println("digite um numero ");
				numero = ler.nextInt();
				soma=numero+soma;
				
			} while (numero !=0);
			System.out.println("A soma dos números digitado foi de: "+soma);
		}
}
