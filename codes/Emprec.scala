class Emp(
    var ename:String,
    var salary:Int
)
{
    def show(){
        print(ename+" "+salary)
    }
}
object Emprec{
    def callfun(){
        var e= new Emp("Anita",56000)
        e.show()
    }
}