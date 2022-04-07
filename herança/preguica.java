package herança;

public class preguica extends animal {
		private boolean subirArvore;

		public boolean isSubirArvore() {
			return subirArvore;
		}

		public void setSubirArvore(boolean subirArvore) {
			this.subirArvore = subirArvore;
		}
	
	public void dormir()
	{
		if(subirArvore==true)
		{
			System.out.println("Bixo preguiça esta dormindo");
		}else {
			System.out.println("Bixo preguiça esta acordado");
		}
	}
}
