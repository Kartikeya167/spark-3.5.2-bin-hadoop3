object displayprod{
    def find(){
        var product =spark.read.csv("product.csv").toDF("name","mpg","cylinders","displacement","horsepower","weight","acceleration","model_year","origin")
        product.show()
    }
}