trait Dept{
    var dname:String="Sales"
}
trait Emp{
    var ename:String="mithudon"
    var salary:Int=50000

}



class Increment extends Dept with Emp{
    var increamt:Int=4000
    def display(){
        print(dname+""+ename+"+New Salary = "+ (salary+increamt))
    }
}

object Empincre{
    def show(){
        var e = new Increment()
        e.display()
    }
}