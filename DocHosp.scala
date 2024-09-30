class hospital{
    var hname:String="Kem"
}
class doctor extends hospital{
    var dname:String="Geetika"
    def display(){
        print(hname+""+dname)

    }
}
object DocHosp{
    def main(){
        var d=new doctor()
        d.display()
    }
}