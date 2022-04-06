package aulaJava3VetorEMatriz;

public class exercicio3 {
	public static void main(String[] args) {
		double n1[][]= new double [4][6], n2[][]=new double [4][6];
		double m1[][]= new double [4][6], m2[][]=new double [4][6];
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				n1[l][c]=Math.floor(Math.random()*10);
				System.out.print("["+n1[l][c]+"]");
				
			}
			System.out.println();
		}
				System.out.println("\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				n2[l][c]=Math.floor(Math.random()*10);
				System.out.print("["+n2[l][c]+"]");
				
			}
			System.out.println();
		}
				System.out.println("\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				m1[l][c]=n1[l][c]+n2[l][c];
				System.out.print("["+m1[l][c]+"]");
				
			}
			System.out.println();
		}
				System.out.println("\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				m2[l][c]=n1[l][c]-n2[l][c];
				System.out.print("["+m2[l][c]+"]");
				
			}
			System.out.println();
		}
		
	}
}
