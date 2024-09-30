object cogroupeg{
    def display(){
        val data1= sc.parallelize(Array(("A",1),("B",2),("C",3)))
        val data2= sc.parallelize(Array(("A",4),("B",5),("D",7)))
        val cgrp= data1.cogroup(data2).collect.foreach(println)
    }
}
// (A,(CompactBuffer(1),CompactBuffer(4)))
// (B,(CompactBuffer(2),CompactBuffer(5)))
// (C,(CompactBuffer(3),CompactBuffer()))
// (D,(CompactBuffer(),CompactBuffer(7)))