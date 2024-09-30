object readsqldata0t
    def main(){
        var dbcon=spark.read.format("jdbc")
        .option("url","jdbc:mysql://localhost:3306/sem5")
        .option("driver","com.mysql.cj.jdbc.Driver")
        .option("dbtable","customer")
        .option("user","root")
        .option("password","kartikeya")
        .option("useSSL","false").load()
        dbcon.show()
    }
}