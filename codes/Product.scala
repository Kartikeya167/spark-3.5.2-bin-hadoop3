object ProdOrder{
    def display(){
        var product=spark.read.csv("products.csv").toDF("pno","category","pname","price")
        var porder=spark.read.csv("order.csv").toDF("orderno","prno","qty")
        var res=product.select("pno","pname").join(porder.select("prno","orderno"),col("pno")===col("prno")).orderBy("pname").show()
    }
}







// object product{
//     def display(){
//         var product=spark.read.csv("./product.csv").toDF
//         ("pno","category","pname","price")
//         var porder=spark.read.csv("./order.csv").toDF
//         ("orderno","perno","qty")
//         var res=product.select("pno","pname")
//         .join (porder.select("pno","orderno"),col
//         ("pno")===col("pno"))
//         .orderBy("pname")
//         .show()
//     }
// }