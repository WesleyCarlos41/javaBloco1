package aulaJava4Orienta��oObjeto;

/*Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class paciente {
		public String nome;
		public String plano;
		public String doenca;

		public paciente(String n, String p, String d)
		{
			this.nome=n;
			this.plano=p;
			this.doenca=d;
		}

		public void estado()
		{
			System.out.println("nome: "+ this.nome);
			System.out.println("plano: "+this.plano);
			System.out.println("doen�a: "+this.doenca);
		}
}
