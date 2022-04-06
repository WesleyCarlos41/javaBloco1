package aulaJava4OrientaçãoObjeto;

/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/ 


public class conta {

	public int numero;
	public String tipo;
	public double valor;
	
	public conta(int n, String t, double v)
	{
		this.numero=n;
		this.tipo=t;
		this.valor=v;
		
	}
	public void estado()
	{
		System.out.println("Numero da conta: "+this.numero);
		System.out.println("Tipo da conta: "+this.tipo);
		System.out.println("Valor em conta "+this.valor+" Reais");
	}
	
}
