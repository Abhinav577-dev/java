import java.util.*;

class StronglyConnected {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Topological Sort
    public static void topSort(ArrayList<Edge> graph[],
                               int curr,
                               boolean vis[],
                               Stack<Integer> s) {

        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    // DFS
    public static void dfs(ArrayList<Edge> graph[],
                           int curr,
                           boolean vis[]) {

        vis[curr] = true;

        System.out.print(curr + " ");

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // Kosaraju Algorithm
    public static void kosRaju(ArrayList<Edge> graph[], int V) {

        // STEP 1 : Topological Sort
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // STEP 2 : Transpose Graph
        ArrayList<Edge> transpose[] = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
            vis[i] = false;
        }

        for(int i = 0; i < V; i++) {
            for(int j = 0; j < graph[i].size(); j++) {

                Edge e = graph[i].get(j);

                // Reverse edge
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // STEP 3 : DFS according to stack order
        while(!s.isEmpty()) {

            int curr = s.pop();

            if(!vis[curr]) {
                System.out.print("SCC -> ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        kosRaju(graph, V);
    }
}