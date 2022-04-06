package aulaJava3VetorEMatriz;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mat[][]=new int [3][3], soma=0, somaDiagonal=0;
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Informe um número : ");
				mat[l][c]=ler.nextInt();
				soma = mat[l][c]+ soma;
				somaDiagonal = mat[0][0]+mat[1][1]+mat[2][2];
			}
		}
			System.out.println("A soma da matriz é: "+soma);
			System.out.println("A soma da diagonal da matriz é: "+somaDiagonal);

	}

}
