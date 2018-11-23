import java.util.Scanner;

public class P20181 {
	public static final int MAX_DISTANCIA = 999;
	private Scanner elScanner;
	private int[][] matrizPesos;
	public P20181() {
		elScanner= new Scanner(System.in);
		int cantidadCasos = elScanner.nextInt();
		for (int i = 0; i < cantidadCasos; i++) {
			int cantidadPersonas = elScanner.nextInt();
			int k=elScanner.nextInt();
			matrizPesos= new int[cantidadPersonas][cantidadPersonas];
			for (int j = 0; j < matrizPesos.length; j++) {
				for (int m = 0; m < matrizPesos.length; m++) {
					int actual=elScanner.nextInt();
					if(actual==0&&j!=m) {
						matrizPesos[j][m]=this.MAX_DISTANCIA;
					}
					else {
						matrizPesos[j][m]=actual;
					}
				}
			}
			correrFloydWarshall();
			int[] respuesta= new int[cantidadPersonas];
			for (int h = 0; h < matrizPesos.length; h++) {
				for (int g = 0; g < respuesta.length; g++) {
					int resp= matrizPesos[h][g]==this.MAX_DISTANCIA?-1:matrizPesos[h][g];
					System.out.print(resp+" ");
					if(matrizPesos[h][g]<=k&&matrizPesos[h][g]!=-1&&matrizPesos[h][g]!=0) {
						respuesta[h]++;
					}
				}
				System.out.print("\n");
			}
			for (int p = 0; p < respuesta.length; p++) {
				System.out.print(respuesta[p]+" ");
			}
			System.out.print("\n");
		}	
	}
	private void correrFloydWarshall() {
		for (int i = 0; i < matrizPesos.length; i++) {
			for (int j = 0; j < matrizPesos.length; j++) {
				for (int k = 0; k < matrizPesos.length; k++) {
					matrizPesos[j][k]= matrizPesos[j][k]>matrizPesos[j][i]+matrizPesos[i][k]?matrizPesos[j][i]+matrizPesos[i][k]:matrizPesos[j][k];
				}
			}
		}	
	}
	public static void main(String[] args) {
		P20181 s= new P20181();
	}
	
	
	

}
