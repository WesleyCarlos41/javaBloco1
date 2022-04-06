package aulaJava1Condicional;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("informe 3 numeros");
		n1=ler.nextInt();	
		n2=ler.nextInt();	
		n3=ler.nextInt();
		if(n1<n2) {
			if(n2<n3) {
				System.out.println(n1 +"\n"+n2 +"\n" + n3);
			}
			else if(n1<n3) {
				System.out.println(n1 +"\n"+n3 +"\n" + n2);
			}else {
				System.out.println(n3 +"\n"+n1 +"\n" + n2);
			}
			}
		else if(n2<n3) {
			if(n1<n3) {
				System.out.println(n2 +"\n"+n1 +"\n" + n3);
			}else {
				System.out.println(n2 +"\n"+n3 +"\n" + n1);
			}
		}else {
			System.out.println(n3 +"\n"+n2 +"\n" + n1);
		}
		}

}
