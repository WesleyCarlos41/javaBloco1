package herança;

import java.util.Scanner;

public class selva {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);	
		cachorro toto = new cachorro ();
		cavalo pocoto = new cavalo();
		preguica pre = new preguica();
		
		
		
		
		System.out.println("O cachorro esta pronto ? ");
		System.out.println("Digite true ou false");
		toto.setDeveCorrer(ler.nextBoolean());
		toto.correr();
		
		System.out.println("O cavalo esta pronto ? ");
		System.out.println("Digite true ou false");
		pocoto.setDeveGalopar(ler.nextBoolean());
		pocoto.velocidade1();
		
		System.out.println("A preguiça esta dormindo ou acordada");
		System.out.println("Digite true ou false");
		pre.setSubirArvore(ler.nextBoolean());
		pre.dormir();
	}

}
