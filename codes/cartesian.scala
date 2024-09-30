val data1=sc.parallelize(List(2,4,5,7,10))
val data2=sc.parallelize(List(1,2,5,7,8))
val cdata =data1.cartesian(data2)
cdata.collect