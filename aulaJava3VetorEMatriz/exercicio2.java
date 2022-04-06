package aulaJava3VetorEMatriz;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vet[]= new double [10], media=0, maiorPontuacao=0,contador=0;
		
		
		for (int i = 0; i < 10; i++) {
				vet[i]= Math.floor(Math.random()*6+1);
				System.out.println(vet[i]);
				
				media=vet[i]+media;
				
				if(vet[i]>maiorPontuacao)
					maiorPontuacao = vet[i];
				else if (vet[i]==maiorPontuacao)
					contador++;
		}
		System.out.println("A maior pontuação saiu " +contador+ " vezes");
		System.out.println("A media de numeros sorteado é :" +media/10);
	}
	
}
