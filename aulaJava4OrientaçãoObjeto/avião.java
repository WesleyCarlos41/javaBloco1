package aulaJava4Orienta��oObjeto;


/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/


public class avi�o {
	 public int tamanho;
	 public double peso;
	 public int capacidade;
	 public int velocidadeDeVoo;
	 
	 public  avi�o(int t, double p, int passageiro,int velocidade)
	 {
		 this.tamanho=t;
		 this.peso=p;
		 this.capacidade=passageiro;
		 this.velocidadeDeVoo=velocidade;
		 
	 }
	 public void estado()
	 {
		 System.out.println("Tamanho do avi�o = "+this.tamanho+" metro");
		 System.out.println("peso "+this.peso+" KG");
		 System.out.println("Capacidade maxima de passageiros "+this.capacidade);
		 System.out.println("Velocidade maxima de voo �: "+velocidadeDeVoo+" KM");
	 }
}
