import org.apache.spark.graphx.Edge
import org.apache.spark.graphx.Graph 
import org.apache.spark.graphx.lib._

object gr1{
    def display(){
        val verArray=Array(
            (1L,("Mumbai",12442373)),
            (2L,("Delhi",11034555)),
            (3L,("Bangalore",8443675)),
            (4L,("Hyderabad",6993262))
        )

        val edgeArray=Array(
            Edge(1L,2L,1394),
            Edge(1L,3L,837),
            Edge(1L,4L,623),
            Edge(2L,3L,1741),
            Edge(2L,4L,1259),
            Edge(3L,4L,497)
        )

        val verRDD=sc.parallelize(verArray)
        val edgeRDD=sc.parallelize(edgeArray)
        val graph=Graph(verRDD,edgeRDD)
        println("No of vertices are "+graph.numVertices)
        println("No of edges are "+graph.numEdges)
        println("Indegrees for the graph are ")
        graph.inDegrees.collect().foreach(a => println(a))
        println("Outdegrees for the graph are ")
        graph.outDegrees.collect().foreach(a => println(a))
        println()
        graph.vertices.collect().foreach(a => println(a))
        println()
    }
}