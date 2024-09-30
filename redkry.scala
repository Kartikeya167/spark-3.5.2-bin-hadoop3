object redkey{
    def display(){
        var item=sc.parallelize(Seq(("apple",2),("orange",3),("apple",5),("mango",4)))
        var rdata= item.reduceByKey( 4 )
        rdata.take(rdata.count.toInt)foreach(println)
    }
}
