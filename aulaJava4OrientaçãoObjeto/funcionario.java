package aulaJava4OrientaçãoObjeto;

public class funcionario {
	public String nome;
	public String setor;
	public String funcao;
	public double salario;
	
	public funcionario(String n, String s, String f, double sal)
	{
		this.nome=n;
		this.setor=s;
		this.funcao=f;
		this.salario=sal;
	}
	public void estado()
	{
		System.out.println("nome: "+this.nome);
		System.out.println("Setor "+this.setor);
		System.out.println("Funcao "+this.funcao);
		System.out.println("Você recebe "+this.salario+" Reais");
	}
}
