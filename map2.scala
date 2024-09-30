object filtereg {
    def display() {
        
        val arr = sc.parallelize(Array(12, 13, 14, 15, 16, 17))

        // Filter the even numbers
        val evennums = arr.filter(num => num % 2 == 0)

        // Collect and print the even numbers
        evennums.collect().foreach(println)
    }
}
