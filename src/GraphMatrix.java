public class GraphMatrix {
    private int V;
    private int[][] adjMatrix;


    public GraphMatrix(int vertices


    ) {
        this.V = vertices;
        adjMatrix = new int[V][V];
    }


    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }


    public void removeEdge(int u, int v) {
        adjMatrix[u][v] = 0;
        adjMatrix[v][u] = 0;
    }


    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        g.printGraph();

        System.out.println("\nAfter removing edge 1 - 2:");
        g.removeEdge(1, 2);
        g.printGraph();
    }
}

