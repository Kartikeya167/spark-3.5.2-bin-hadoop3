object sumEVEN1to50{
    def main(){
        var i=1
        var sum=0
        while(i<=50){
            if(i%2==0){
                sum=sum+i
            }
            i=i+1
        }
        print(sum)
    }
}