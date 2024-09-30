object dh5{
    def display(){
        var doctors=spark.read.csv("doctors.csv").toDF("dno","dname","salary","qual")
        var hospitals=spark.read.csv("hospitals.csv").toDF("hno","hname","city")
        var dochosp=spark.read.csv("hospitaldoctor.csv").toDF("hospno","drno")
        //var res=hospitals.select("hno","hname","city").join(dochosp.select("hospno","drno"),col("hno")===col("hospno")).join(doctors.select("dno","dname","salary","qual"),col("drno")===col("dno")).filter(col("hname")==="Deenanath").show()
    var r=doctors.show()
    }
}

// object dh5{
//     def display(){
//         var doctors=spark.read.csv("./doctors.csv").toDF("dno","dname","salary","qual")
//         var hospitals= spark.read.csv("./hospitals.csv").toDF("hno","hname","city")
//         var dochosp=spark.read.csv("hospitaldoctor.csv").toDF("hospno","drno")
//         var es=hospitals.select("hno","hname","city")join(dochosp.select("hospno","drno"),col("hno")===col("hospno"))
//         .join(doctors.select
//         ("dno","dname","salary","qual"),col("drno")===col
//         ("dno"))
//         .filter(col("hname")==="Deenanth")
//         .show()
//     }
// }