class Prim {
	
	def prim(Graph graph) {

		Graph minGraph = new Graph()
		
		minGraph.vertexes.add(graph.vertexes[0])

		while(minGraph.vertexes.size < graph.vertexes.size) {
			def edge = findMinVertex(graph.edges, minGraph.vertexes)			
			
			if(!edge){
				/*
				 * There are disconected vertexes
				 */
				break
			}

			minGraph.edges.add(edge)
			if(!minGraph.vertexes.contains(edge.vertex1)) {
				minGraph.vertexes.add(edge.vertex1)
			} else if(!minGraph.vertexes.contains(edge.vertex2)) {
				minGraph.vertexes.add(edge.vertex2)
			}
		}

		return minGraph
	}

	def findMinVertex(edges, vertexes) {
		def minEdge = null
		
		for(def vertex : vertexes) {
			for(def edge : edges) {
				if(edge.joins(vertex) && newPoint(edge, vertexes)) {
					if(!minEdge){
						minEdge = edge
					} else {
						if(edge.weight < minEdge.weight){
							minEdge = edge
						}
					}
				}
			}
		}

		return minEdge
	}

	boolean newPoint(edge, vertexes){
		if(!vertexes.contains(edge.vertex1) || !vertexes.contains(edge.vertex2)) {
			return true
		} else {
			return false
		}
	}
}