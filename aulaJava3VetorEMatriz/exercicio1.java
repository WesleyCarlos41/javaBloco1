package aulaJava3VetorEMatriz;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int vet[] = new int [5], maiorNota=0;
			
			System.out.println("informe 5 notas: ");
			for (int n = 0; n < 5;n ++) {
				vet[n]=ler.nextInt();
				if(vet[n] > maiorNota) {
					maiorNota= vet[n];
				}
			}
				for (int n = 0; n < 5; n++) {
					System.out.println(vet[n]);
				}
				
			
			
			System.out.println("A maior nota é: "+maiorNota);

		}

}
