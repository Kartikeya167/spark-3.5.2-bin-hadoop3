val data1 = sc.parallelize(List(2, 3, 4, 6, 8, 10))
val data2 = sc.parallelize(List(1, 3, 5, 7, 9))
val udata = data1.union(data2)
udata.collect().foreach(println)
