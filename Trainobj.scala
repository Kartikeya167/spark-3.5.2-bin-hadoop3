class Train(
    var tno: Int,
    var tname:String)
{
    var triantype:String=""
    def display()
{

print(tno+""+tname+""+triantype)
}
def this(tno:Int,tname:String,triantype:String){
    this(tno,tname)
    this.triantype=triantype
}
}
object Trainobj{
    def show(){
        var t=new Train(1280," Pragati "," Express ")
        t.display()
    }
}