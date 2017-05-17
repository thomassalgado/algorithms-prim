class Graph {
    List<String> vertexes = new ArrayList()
    List<Edge> edges = new ArrayList()

    Graph() {
   		vertexes = new ArrayList()
    	edges = new ArrayList()
    }

    def addVertex(vertex){
    	vertexes.add(vertex)
    }

    def addEdge(vertex1, vertex2, weight){
    	if (!vertexes.contains(vertex1) || !vertexes.contains(vertex2)) {
    		throw new IllegalArgumentException("Invalid edge $vertex1, $vertex2 !!!");
    	} else {
    		Edge edge = new Edge()
    		edge.weight = weight
    		edge.vertex1 = vertex1
    		edge.vertex2 = vertex2
    		edges.add(edge)
    	}
    }

    String toString(){
		return 'Vertexes\n' + vertexes + '\nEdges\n' + edges
	}
}