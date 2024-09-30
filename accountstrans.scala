object readsqldata2{
    def main(){
        val mytable=spark.read.format("jdbc").option("url","jdbc:mysql://localhost:3306/sem5").option("driver","com.mysql.cj.jdbc.Driver").option("dbtable","acctrants").option("user","root").option("password","kartikeya").option("useSSL","false").load()

        mytable.createOrReplaceTempView("acctrants")   /* need to create temporary view to fire queries */

        val bal_recs=spark.sql("select * from acctrants where amount>5000")
        bal_recs.write.format("jdbc")
        .option("url","jdbc:mysql://localhost:3306/sem5").option("driver","com.mysql.cj.jdbc.Driver").option("dbtable","acctrants").option("user","root").option("password","kartikeya").option("useSSL","false").mode("overwrite").save()

        
    }
}