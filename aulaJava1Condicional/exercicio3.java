package aulaJava1Condicional;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade  ;
		
		System.out.println("Qual a sua idade");
		idade = ler.nextInt();
		
			if (idade < 10) {
				System.out.println("Só aceitamos idades apartir de 10 anos");
			}
			else if(idade  <=14) {
				System.out.println("Infantil");
			}else if (idade <=17) {
				System.out.println("Juvenil");
			}else if (idade <= 25){
				System.out.println("adulto");
			}else {
				System.out.println("Só aceitamos idades até 25 anos");
			}
		
		}

	}


