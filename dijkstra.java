import java.util.*;

public class DijkstraSearch<Vertex> extends Search<Vertex> {
    private Set<Vertex> unsettledNodes;
    private Map<Vertex, Double> distances;
    private WeightedGraph<Vertex> graph;

    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        unsettledNodes = new HashSet<>();
        distances = new HashMap<>();
        this.graph = graph;
        dijkstra();
    }

    public void dijkstra() {
        distances.put(source, 0D);
        unsettledNodes.add(source);

        while (unsettledNodes.size() > 0) {
            Vertex node = getVertexWithMinimumWeight(unsettledNodes);
            marked.add(node);
            unsettledNodes.remove(node);
            for (Vertex target : graph.adjacencyList(node)) {
                if (getShortestDistance(target) > getShortestDistance(node)
                        + getDistance(node, target)) {
            }
        }
    }

    private double getDistance(Vertex node, Vertex target) {
        }


    private Vertex getVertexWithMinimumWeight(Set<Vertex> vertices) {
      return null;
    }

    private double getShortestDistance(Vertex destination) {
    }
}
