class Shape{
    var len: Int = 0
    var bre: Int = 0
}

class ReactAr extends Shape {
    var height: Int = 0

    def area(): Unit = {
        len = 4
        bre = 6
        height = 1 // Assuming height is needed and setting it to 1
        println("Area of rectangle = " + (len * bre * height))
    }
}

class ReactVol extends Shape {
    var height: Int = 10

    def vol(): Unit = {
        len = 5
        bre = 7
        println("Volume of rectangle = " + (len * bre * height))
    }
}

object RObj {
    def show(){
        val r1 = new ReactAr()
        r1.area()
        
        val r2 = new ReactVol()
        r2.vol()
    }
}


RObj.show()


// Write a class dept with dname and dhead write one more class which is inherited from dpt and has its data meembers as ename and salary also defone two methods aceept and display in emp class to aceept and display all four variable data also write an object which create instance of emp class and invoke aceept and display methods 