import org.apache.spark.sql.DataFrame
object emprecs{
    def display(){
        val sqlcontext = new 
        org.apache.spark.sql.SQLContext(sc)
        val rec =sqlcontext.read.json("emprecs.json")
        rec.show()
        rec.printSchema
        rec.select("empname","age").show()
        rec.select(rec("age")>22).show()
        rec.filter(rec("age")>22).show()
    }
}