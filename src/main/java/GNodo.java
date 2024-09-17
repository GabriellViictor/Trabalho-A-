import java.util.LinkedList;

public class GNodo {
	long id;
	double lat;
	double lon;
	boolean ativo = false;
	
	LinkedList<Aresta> listaArestas = new LinkedList<>();
}


class Node {
	int x, y;  // Coordenadas do nó (posição no grid)
	int gCost, hCost, fCost; // Custos G, H e F
	// gCost é o custo para ir do ponto inicial até este nó
	// hCost é a heurística da distância restante até o nó de destino
	// fCost é a soma de gCost e hCost -> o algoritmo sempre prioriza o nó com menor fCost na lista de não visitados
	Node parent; // O nó anterior, usado para reconstruir o caminho

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void calculateCosts(Node target) {
		// target é o nó de destino
		// Cálculo da heurística (distância Manhattan para o nó de destino)
		this.hCost = Math.abs(x - target.x) + Math.abs(y - target.y);
		// Cálculo do custo total F = G + H
		this.fCost = gCost + hCost;
	}
}