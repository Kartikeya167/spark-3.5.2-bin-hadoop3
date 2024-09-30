class Sum{
    def add(a:Int,b:Int){
        println("sum of 2 integer",a+b)
    }
    def add(a:Int,b:Int,c:Int){
        println("Sum of 3 integer", a+b+c)
    }
}
object Sumobj{
    def display(){
        var s=new Sum()
        s.add(67,1,1)
        s.add(68,1)
    }
}
