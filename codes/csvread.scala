
object readproduct{
    def display(){
        var p=spark.read.csv("Automobile.csv")
        print(p.show())
    }
}