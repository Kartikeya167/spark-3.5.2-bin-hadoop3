object funcall{
    def main(a:Int=70,b:Int=80):Int={
        var sum:Int=0
        sum=a+b
        return sum
    }
    def callme(){
        print(main(100,200))   /* print(main()) */
    }
}