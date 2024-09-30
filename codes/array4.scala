import org.apache.spark.graphx.GraphLoader
object followers{
    def display(){
        val graph=GraphLoader.edgeListFile(sc,"./followers.txt")
        val ranks=graph.pageRank(0.001).vertices
        ranks.collect.foreach(a=>println(a))
    }
}
// ARRAY