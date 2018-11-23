
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20172 {

	private int[][] matrizBinaria;
	private Scanner elScanner;

	public P20172() {
		elScanner = new Scanner(System.in);
		int cantidadCasos = elScanner.nextInt();
		for (int i = 0; i < cantidadCasos; i++) {
			int cantidadComputadores = elScanner.nextInt();
			matrizBinaria = new int[cantidadComputadores][cantidadComputadores];
			for (int j = 0; j < matrizBinaria.length; j++) {
				for (int m = 0; m < matrizBinaria.length; m++) {
					matrizBinaria[j][m] = elScanner.nextInt();
				}
			}
			boolean[] visitado = new boolean[cantidadComputadores];
			Queue<Integer> q = new LinkedList<Integer>();
			int cantidadDeConexos = 0;

			Object[] faltanPorVisitar = algunoSinVisitar(visitado);
			boolean seguir = (boolean) faltanPorVisitar[0];

			while (seguir) {
				q.offer((int) faltanPorVisitar[1]);
				while (!q.isEmpty()) {
					int actual = q.poll();
					visitado[actual] = true;
					ArrayList<Integer> adyacentes = darAdyacentes(actual);
					for (int a = 0; a < adyacentes.size(); a++) {
						int aAniadir = adyacentes.get(a);
						if (visitado[aAniadir] == false) {
							q.offer(aAniadir);
							visitado[aAniadir] = true;
						}

					}

				}
				cantidadDeConexos++;
				faltanPorVisitar = algunoSinVisitar(visitado);
				seguir = (boolean) faltanPorVisitar[0];
			}
			String respuesta = cantidadDeConexos == 1 ? "CORRECTO" : "INCORRECTO " + cantidadDeConexos;
			System.out.println(respuesta);
		}

	}

	public ArrayList<Integer> darAdyacentes(int computador) {
		ArrayList<Integer> adyacentes = new ArrayList<Integer>();
		for (int i = 0; i < matrizBinaria.length; i++) {
			if (matrizBinaria[computador][i] == 1) {
				adyacentes.add(i);
			}
		}
		return adyacentes;
	}

	public Object[] algunoSinVisitar(boolean[] visitado) {
		Object[] salida = new Object[2];
		salida[0] = false;
		salida[1] = 0;
		boolean pare = false;
		for (int i = 0; i < visitado.length && !pare; i++) {
			if (visitado[i] == false) {
				salida[0] = true;
				salida[1] = i;
				pare = true;
			}
		}

		return salida;

	}

	public static void main(String[] args) {
		P20172 s = new P20172();
	}
}
