package herança;

public class cachorro extends animal {
		private boolean deveCorrer;
		
		public boolean isDeveCorrer() {
			return deveCorrer;
		}

		public void setDeveCorrer(boolean deveCorrer) {
			this.deveCorrer = deveCorrer;
		}

		public void correr()	
		{
		
			if(deveCorrer == true)
			{
				System.out.println("Cachorro corre");
			}else {
				System.out.println("Cachorro fica parado");
			}
		}
		
		
}
