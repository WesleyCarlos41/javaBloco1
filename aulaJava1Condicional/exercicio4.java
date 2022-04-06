package aulaJava1Condicional;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 double numero;
		
			System.out.println("Informe um número");
			numero = ler.nextDouble();
				if(numero % 2 == 0 ) {
					System.out.println("O número é PAR");
					double raiz = Math.sqrt(numero);
					System.out.println("A raiz quadrada é: "+ raiz);
				}else {
					System.out.println("Este numero é ÍMPAR");
					System.out.println("O resultado do número ao quadrado é: "+numero*numero);
				}
		
		}

	}


