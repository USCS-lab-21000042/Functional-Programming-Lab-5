object test extends App{
    def checknumber(x:Int,d:Int=1):Unit={
        if(x==d ) println("Odd number")
        else if(x<d) println("Even number")
        else checknumber(x,d+2)
    }
    checknumber(5)
}