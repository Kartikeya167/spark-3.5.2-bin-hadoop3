class Try(
    var ename:String,
    var salary:Int
){
    def show(){
        print(ename+salary)
    }

object call{
    def hi(){
        var e= new Try("lala",80000)
        e.show()
    }
}
}