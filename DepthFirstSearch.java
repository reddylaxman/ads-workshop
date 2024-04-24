import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
    private int V; // Number of vertices
    private List<List<Integer>> adjList; // Adjacency list to store the graph
    private boolean[] visited; // Array to keep track of visited vertices
    // Constructor to initialize the graph

    public DepthFirstSearch(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        this.visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    // DFS traversal from a given source vertex
    public void dfs(int source) {
        // Mark all the vertices as not visited
        Arrays.fill(visited, false);
        // Call the recursive helper function
        dfsUtil(source);
    }

    // Recursive utility function for DFS traversal
    private void dfsUtil(int vertex) {
        // Mark the current vertex as visited
        visited[vertex] = true;
        System.out.print(vertex + " ");
        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        DepthFirstSearch graph = new DepthFirstSearch(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        System.out.println("Depth-First Search starting from vertex 0:");
        graph.dfs(0);
    }

}

/*
 * output:
 * Depth-First Search starting from vertex 0:
 * 0 1 3 4 2 5 6
 */
