        sdata.take(sdata.count.toInt)foreach(println)
        println()
        print("sorting in descending order..")
        sdata=item.sortByKey(false)
        sdata.take(sdata.count.toInt) foreach(println)
    }
}