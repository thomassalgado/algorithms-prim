Graph graph = new Graph()

graph.addVertex("A")
graph.addVertex("B")
graph.addVertex("C")
graph.addVertex("D")
graph.addVertex("E")
graph.addVertex("F")
graph.addVertex("G")
graph.addVertex("H")
graph.addVertex("I")
graph.addVertex("J")

graph.addVertex("A1")
graph.addVertex("B1")
graph.addVertex("C1")
graph.addVertex("D1")
graph.addVertex("E1")




graph.addEdge("A", "B", 7)
graph.addEdge("A", "D", 5)
graph.addEdge("D", "B", 9)
graph.addEdge("D", "E", 15)
graph.addEdge("D", "F", 6)
graph.addEdge("B", "C", 8)
graph.addEdge("B", "E", 7)
graph.addEdge("F", "E", 8)
graph.addEdge("F", "G", 11)
graph.addEdge("C", "E", 5)
graph.addEdge("E", "G", 13)
graph.addEdge("A", "H", 11)
graph.addEdge("B", "I", 6)
graph.addEdge("C", "J", 7)
graph.addEdge("G", "H", 9)
graph.addEdge("C", "I", 3)
graph.addEdge("D", "J", 5)

//graph.addEdge("A", "A1", 9)

graph.addEdge("A1", "B1", 7)
graph.addEdge("A1", "D1", 5)
graph.addEdge("D1", "B1", 9)
graph.addEdge("D1", "E1", 15)
graph.addEdge("B1", "C1", 8)
graph.addEdge("B1", "E1", 7)
graph.addEdge("C1", "E1", 5)


Prim prim = new Prim()


def init = System.currentTimeMillis()
println prim.prim(graph)
println "Execution time ${System.currentTimeMillis() - init}"
