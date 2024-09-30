// val arr= sc.parallelize(List(10,20,30,50))
// val dis= arr. distinct()
// dis.collect

object distinctef{
    def display(){
        var a = sc.parallelize(Array(10,20,45,67,20,40,30,40))
        var d= a.distinct()
        d.take(d.count.toInt)foreach(println)
    }
}