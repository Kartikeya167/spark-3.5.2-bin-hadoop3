object ProdOrder{
    def display(){
        var product = spark.read.csv("product.csv").toDF
        ("name","mpg","cylinders","horsepower","weight","acceleration","model_year","origin")
        product.show()
        var res=product.select("name","mpg")
        .agg(min("mpg"))
        .show()


        
    }
}