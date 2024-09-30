object dh8{
    def display(){
        var doctors=spark.read.csv("doctors.csv").toDF("dno","dname","salary","qual")
        var hospitals=spark.read.csv("hospitals.csv").toDF("hno","hname","city")
        var dochosp=spark.read.csv("hospitaldoctor.csv").toDF("hospno","drno")
        var res=hospitals.select("hno","hname","city").join(dochosp.select("hospno","drno"),col("hno")===col("hospno"),joinType="left_outer").show()
    }
}