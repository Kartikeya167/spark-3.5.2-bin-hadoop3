import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._

object streamdata {

  def main() {

    val spark = SparkSession.builder().appName("FirstApp").master("local").getOrCreate()

    val myschema = new StructType()
      .add("dno", IntegerType, false)
      .add("dname", StringType, true)

    val df = spark.readStream.option("header", true).schema(myschema).csv("/Users/kartikeya/Documents/Sem5/spark-3.5.2-bin-hadoop3/CODES")

    df.writeStream.format("console").start().awaitTermination()
  }
}
