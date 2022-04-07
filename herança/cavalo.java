package herança;

public class cavalo extends animal{
	private boolean deveGalopar;

	
		public void velocidade1() 
		{
		if(deveGalopar == true)
		{
			System.out.println("Cavalo corre");
		}else {
			System.out.println("Cavalo fica parado");
		}
	}
		public boolean isDeveGalopar() {
			return deveGalopar;
		}
		public void setDeveGalopar(boolean deveGalopar) {
			this.deveGalopar = deveGalopar;
		}
		

}
