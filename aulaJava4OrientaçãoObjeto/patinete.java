package aulaJava4Orienta��oObjeto;

/*Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class patinete {

	public double tamanho;
	public double peso;
	public double preco;
	
	public patinete(double t, double p, double v)
	{
		this.tamanho=t;
		this.peso=p;
		this.preco=v;
	}
	public void estado()
	{
		System.out.println("tamanho "+this.tamanho+" M");
		System.out.println("peso "+this.peso+" KG");
		System.out.println("pre�o "+this.preco+" Reais");
	}

}
