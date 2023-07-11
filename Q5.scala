object test extends App{
    def checknumber(x:Int,d:Int=1):Boolean={
        if(x==d ) false
        else if(x<d) true
        else checknumber(x,d+2)
    }
    
    def totalofeven( x:Int):Int={
        if(checknumber(x) && x>1){
            
            x-2+totalofeven(x-2)
        }
        else if(x>1 && !checknumber(x)) {
            
            (x-1)+totalofeven(x-1)
        }
        else 0
    }
    println(s"total of even number is ${totalofeven(11)}")
}