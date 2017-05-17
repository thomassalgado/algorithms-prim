class Edge {
	
	String vertex1
	String vertex2
	Integer weight

	String toString(){
		return 'Edge ' + vertex1 + ' ' + vertex2 + ' weight ' + weight
	}

	boolean equals(edge){
		if(!edge) {
			return false
		}
		if(!this.vertex1.equals(edge.vertex1) && !this.vertex1.equals(edge.vertex2)) {
			return false
		}
		if(!this.vertex2.equals(edge.vertex1) && !this.vertex2.equals(edge.vertex2)) {
			return false
		}
		if(!this.weight.equals(edge.weight)) {
			return false
		}
		return true
	}

	boolean joins(vertex){
		return vertex.equals(vertex1) || vertex.equals(vertex2)
	}

}