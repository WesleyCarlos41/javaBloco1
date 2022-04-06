package aulaJava3repeticao;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
			int sexo,pessoas=0, idade=0, opcao=0, calma=0, nervosa=0, agressiva=0,masculino=0, 
					feminino=0, outro=0, mais40=0, menos18=0,mascAgre=0;
			
				
			while (opcao !=-1) { 
				System.out.println("qual a sua idade ? ");
				idade = ler.nextInt();
				System.out.println("Qual o seu sexo ? "+ "\n1-masculino" +"\n2-feminino"+ "\n3-outro");
				sexo = ler.nextInt();
				System.out.println("Digite 1 se você se considera uma pessoa calma: \n"
						+ "Digite 2 se você se considera uma pessoa nervosa: "
						+ "\nDigite 3 se você se considera uma pessoa agressiva:  ");	
				opcao = ler.nextInt();	
					if(sexo >=1)
						pessoas++;
					else if(sexo == 1 && opcao ==3) {
						masculino++;
					}else if(sexo ==2 && opcao ==2) {
						feminino++;
					}else if(sexo == 3 && opcao ==1) {
						outro++;
					}if (opcao ==1)
						calma++;
					else if(idade >=40 && opcao ==2) {
						mais40++;
					}else if(idade <18 && opcao ==1) {
						menos18++;
					}	
			}	
				System.out.println("A quantidade de pessoas calmas é: "+(pessoas+calma-pessoas));
				System.out.println("A quantidade de mulheres nervosa é: "+ feminino);
				System.out.println("A quantidade de homens agressivo é: "+ masculino);
				System.out.println("A qauntidade de outros calmo é: "+ outro);
				System.out.println("A quantidade de pessoas nervosa com mais de 40 é: "+mais40);
				System.out.println("A quantidade de pessoas calmas com menos de 18 é: "+menos18);
				
		}

}
