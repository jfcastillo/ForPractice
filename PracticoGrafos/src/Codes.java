
public class Codes {
	/**
	 * Codes for Matrix
	 */
//	public void dfs(K keyNode) {
//
//		boolean visited[] = new boolean[matrix.length];
//
//		visited[index.get(keyNode)] = true;
//		Stack<K> stack = new Stack<K>();
//		stack.add(keyNode);
//
//		while (!stack.isEmpty()) {
//			K key = stack.pop();
//
//			for (int j = 0; j < matrix.length; j++) {
//				if (matrix[index.get(key)][j] != Integer.MAX_VALUE) {
//					K keyNeighbor = keys.get(j);
//					if (!visited[j]) {
//						stack.add(keyNeighbor);
//					}
//				}
//			}
//			visited[index.get(key)] = true;
//		}
//
//	}
//
//	@Override
//	public void bfs(K keyNode) {
//		boolean visited[] = new boolean[matrix.length];
//
//		visited[index.get(keyNode)] = true;
//		Queue<K> queue = new LinkedList<K>();
//		queue.add(keyNode);
//		while (!queue.isEmpty()) {
//			K key = queue.remove();
//
//			for (int j = 0; j < matrix.length; j++) {
//				if (matrix[index.get(key)][j] != Integer.MAX_VALUE) {
//					K keyNeighbor = keys.get(j);
//					if (!visited[j]) {
//						queue.add(keyNeighbor);
//					}
//				}
//			}
//			visited[index.get(key)] = true;
//		}
//
//	}
//
//	@Override
//	public int[] dijsktra(K keyNode) {
//		boolean visited[] = new boolean[matrix.length]; // Estructura auxiliar para marcar los nodos visitados
//		int[] distance = new int[matrix.length]; // Estructura auxiliar para llevar las distancias a cada nodo
//		Node prev[] = new Node[matrix.length]; // Estructura auxiliar para almacenar las rutas
//
//		PriorityQueue<K> pq = new PriorityQueue<K>();
//
//		pq.add(keyNode);// se inserta a la cola el nodo Inicial.
//
//		distance = matrix[index.get(keyNode)].clone();
//
//		prev[index.get(keyNode)] = super.getNodes().get(keyNode);
//
//		while (pq.size() > 0) {
//			K keyNodeActual = pq.poll();
//			int i = index.get(keyNodeActual);
//			if (!visited[i]) {
//				visited[i] = true;
//				for (int j = 0; j < matrix.length; j++) {
//					if (matrix[i][j] != Integer.MAX_VALUE && !visited[j]) {
//						if(distance[j] >= distance[i]+matrix[i][j]) {
//							distance[j] = distance[i]+matrix[i][j];
//							prev[j] = super.getNodes().get(keys.get(i));
//						}
//						pq.add(keys.get(j));							
//					}
//				}
//
//			}
//		}
//
//		return distance;
//	}
}
