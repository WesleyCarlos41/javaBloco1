package aulaJava1Condicional;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 double numero;
		
			System.out.println("Informe um n�mero");
			numero = ler.nextDouble();
				if(numero % 2 == 0 ) {
					System.out.println("O n�mero � PAR");
					double raiz = Math.sqrt(numero);
					System.out.println("A raiz quadrada �: "+ raiz);
				}else {
					System.out.println("Este numero � �MPAR");
					System.out.println("O resultado do n�mero ao quadrado �: "+numero*numero);
				}
		
		}

	}


