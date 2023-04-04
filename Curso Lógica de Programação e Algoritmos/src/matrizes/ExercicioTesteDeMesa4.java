package matrizes;

public class ExercicioTesteDeMesa4 {

	public static void main(String[] args) {
		
		int n = 3;
		int x;
		
		int [][] mat = new int [5][5];
		int [] vet = new int [5];
		
		for(int i = 0; i<n; i++) {
			x = 0;
			for(int j=0; j<n; j++) {
				mat[i][j] = i+j;
				x = x + mat[i][j];
			}
			vet[i] = x;
		}
	}

}
