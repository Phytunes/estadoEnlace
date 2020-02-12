/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;



/**
 *
 * @author redes
 */
public class estadoEnlace {

	static final int V = 4;
        private int tamaño;

    public estadoEnlace(int tamaño) {
        this.tamaño = tamaño;
    }
        
        

   
        
	int minDistance(int dist[], Boolean sptSet[]) 
	{ 
		
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < tamaño; v++) 
			if (sptSet[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 

	
	void printSolution(int dist[], int r) 
	{ 
                System.out.println("Router" + r
                        ); 
		System.out.println("Vertice \t Distancia a Vertice "
                        ); 
		for (int i = 0; i < tamaño; i++) 
			System.out.println(i + " \t\t " + dist[i]   ); 
                System.out.println("***********************************");
	} 

	
	void dijkstra(int graph[][], int src) 
	{ 
		int dist[] = new int[tamaño]; 
		Boolean sptSet[] = new Boolean[tamaño]; 

		
		for (int i = 0; i < tamaño; i++) { 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		
		dist[src] = 0; 

		for (int count = 0; count < tamaño - 1; count++) { 
			
			int u = minDistance(dist, sptSet); 

			
			sptSet[u] = true; 

			
			for (int v = 0; v < tamaño; v++) 

				
				if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 

		
		printSolution(dist, src); 
	} 

	
	public static void main(String[] args) 
	{ 
		
                int matriz[][] = new int[4][4];
		int graph[][] = new int[][] { {0, 4, 0, 0}, 
                                              { 4, 0, 8, 0}, 
                                              { 0, 8, 0, 7}, 
                                              { 0, 0, 7, 0}};

		 
		
	}
    
}
