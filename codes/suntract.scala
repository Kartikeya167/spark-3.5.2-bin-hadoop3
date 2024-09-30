object subtracteg{
    def display(){
        var a1 =sc.parallelize(Array(10,20,30,40))
        var a2= sc.parallelize(Array(11,21,20,41,30))
        var a= a1.subtract(a2)
        a.take(a.count.toInt) foreach(println)
    }
}