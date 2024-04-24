public class DirectedGraph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public DirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];




    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix representation of the graph");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }

}

/*
output:-
Adjacency Matrix representation of the graph
0 1 0 1 0
1 0 0 1 0
0 0 0 1 0
0 0 0 0 1
0 0 0 0 0
 */