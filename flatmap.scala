object flatmap{
    def display(){
        val wordlist=sc.parallelize(Seq("Pune is in mh ","surat is in gujarat"))
        val words=wordlist.flatMap(_.split(""))
        words.take(words.count.toInt)foreach(println)
    }
}