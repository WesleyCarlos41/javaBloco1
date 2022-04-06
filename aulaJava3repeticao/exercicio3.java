package aulaJava3repeticao;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int idade =0, contadorMaior = 0, contadorMenor =0;
			
			
				while (idade != -99) {
					System.out.println("Informe a idade");
					idade = ler.nextInt();
					
				if(idade <= 21 )
					contadorMenor++;
				else if(idade >=50) 
					contadorMaior++;
				else if (idade <=0 )
					System.out.println("Inorme a idade com numeros positivos ");
				
			}
				System.out.println("A quantidade de pessoas com menos de 21 anos são "+ contadorMenor);
				System.out.println("A quantidade de pessoas com mais de 50 anos são "+ contadorMaior);
		}

}
