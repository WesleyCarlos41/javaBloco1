package aulaJava4OrientaçãoObjeto;

public class eletronico {
	public String aparelho;
	public String cor;
	public double valor;
	public int memoria;
	
	
	
	public eletronico(String a,String c, double v, int m )
	{
		this.aparelho=a;
		this.cor=c;
		this.valor=v;
		this.memoria=m;
		
	}
	public void estado()
	{
		System.out.println("Qual o produto ? "+this.aparelho);
		System.out.println("cor: "+this.cor);
		System.out.println("Qual o valor "+this.valor+" Reais");
		System.out.println("Capacidade da memoria "+this.memoria+" GB");
		
	}
}
