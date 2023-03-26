package Vetores;

public class ExercicioTesteMesa {

	public static void main(String[] args) {
		
		int [] v = new int[6];
		int [] w = new int[6];
		
		v[0] = 2;
		
		for(int d = 1; d<4; d++) {
			v[d] = v[d-1] * 2;
		}
		
		for(int d = 0; d<4; d++) {
			w[d] = v[d] * 10;
		}
                                  
	}
   
		
}
	
