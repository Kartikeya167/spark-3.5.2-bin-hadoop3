object parquetData{
    det display(){
        val df=spark.read.parquet("MT cars.parquet")
        df.show()
    }
}