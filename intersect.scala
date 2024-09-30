var data1=sc.parallelize(List(2,4,5,7,10))
var data2=sc.parallelize(List(1,2,5,7,8))
var idata = data1.intersection(data2)
idata.collect