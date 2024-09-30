class Dept{
    var dname: String= ""
    var dhead: String= ""
}

class emp extends from Dept{
    var ename: String=""
    var salary: Int= 0


    def aceept {
        print("enter your input")

        dname= scala.io.StdIn.readLine()
        dhead= scala.io.Std.In.readLine()
        ename= scala.io.Std.In.readLine()
        salary= scala.io.Std.In.readInt()
    }

    def display{
        print(dname)
        print(dhead)
        print(ename)
        print(salary)
    }

    
    object empobj{
        def show(){
            var e=new emp()
            e.dept()
            e.display()
        }
    }
}
empobj.show()