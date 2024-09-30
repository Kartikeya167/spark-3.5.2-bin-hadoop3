object mapeg{
    def display(){
        var arr = sc.parallelize(Array(2,5,8,10,87))
        val sqnums=arr.map(x=>x*x)
        sqnums.take(sqnums.count.toInt) foreach(println)
    }
}