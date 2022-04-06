package aulaJava1Condicional;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			int n1, n2, n3;
			
			System.out.println("Digite um numero");
			n1 = ler.nextInt();
			System.out.println("Digite um numero");
			n2 = ler.nextInt();
			System.out.println("Digite um numero");
			n3 = ler.nextInt();
			 
			if(n1>n2 || n1>n3) {
				System.out.println(n1 + " é maior numero");
			}else if (n2>n3){
				System.out.println(n2 + " é maior numero");
			}else {
				System.out.println(n3 + " é maior numero");
			}
				

		}

	}


