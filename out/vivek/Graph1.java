package out.vivek;

import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        // For undirected graph, also add:
        // adj.get(v).add(u);
    }

    void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj.get(u)) {
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
    }
}

public class Graph1 {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        // example edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs();
    }
}
