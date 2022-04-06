package aulaJava4OrientaçãoObjeto;


/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class avião {
	 public int tamanho;
	 public double peso;
	 public int capacidade;
	 public int velocidadeDeVoo;
	 
	 public  avião(int t, double p, int passageiro,int velocidade)
	 {
		 this.tamanho=t;
		 this.peso=p;
		 this.capacidade=passageiro;
		 this.velocidadeDeVoo=velocidade;
		 
	 }
	 public void estado()
	 {
		 System.out.println("Tamanho do avião = "+this.tamanho+" metro");
		 System.out.println("peso "+this.peso+" KG");
		 System.out.println("Capacidade maxima de passageiros "+this.capacidade);
		 System.out.println("Velocidade maxima de voo é: "+velocidadeDeVoo+" KM");
	 }
}
