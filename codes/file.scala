object readfile{
    def show(){
        var data=sc.textFile("cites")
        print("how many lines you need ")
        var n = scala.io.StdIn.readInt()
        data.take (n) foreach (println) 
    }

  


}
}