package aulaJava4OrientaçãoObjeto;


/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class cliente {
	public int idade;
	public String nome;
	public String endereco;
	public String sexo;
	public boolean recheio;
	
	//metodo construtor
	public  cliente(int i, String n, String residencia, String s)
	{
		this.idade=i;
		this.nome=n;
		this.endereco=residencia;
		this.sexo=s;
		
	}
	public void recheio()
	{
		System.out.println("O cliente quer borda recheada ?");
			if(recheio==true) {
				System.out.println("Com recheio");
			}else {
				System.out.println("sem recheio");
			}
	}
	public void estado()
	{
		System.out.println("idade: "+this.idade);
		System.out.println("nome: "+this.nome);
		System.out.println("sexo "+this.sexo);
		System.out.println("endereco"+this.endereco);
	}
	
	
}
