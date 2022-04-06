package aulaJava3repeticao;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero,contador=0,soma=0,media;
		
			do {
				System.out.println("Informe um numero inteiro: ");
				numero= ler.nextInt();
				if(numero % 3 == 0)
					soma = numero+soma;
				else if(numero % 3 == 0);
					contador++;
				media=soma/contador;
				
			} while (numero!=0);
			
			System.out.println("A media dos numeros multiplos de 3 é: "+media);
		}
}
