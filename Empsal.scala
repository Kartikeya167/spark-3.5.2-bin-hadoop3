class Dept{
    var dname:String="Sales"
}

class Emp extends Dept{
    var ename:String="mithu_don"
    var salary:Int=50000
}

class EmpIncrement extends Emp{
    var increamt:Int=4000
    def display(){
        print(dname+""+ename+"+New Salary = "+ (salary+increamt))
    }
}

object Empsal{
    def show(){
        var e = new EmpIncrement()
        e.display()
    }
}