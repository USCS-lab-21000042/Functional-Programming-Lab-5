object test extends App{
    def checknumber(x:Int,d:Int=1):Unit={
        if(x==d ) println(s"${x} is an Odd number")
        else if(x<d) println(s"${x} is an Even number")
        else checknumber(x,d+2)
    }
    checknumber(5)
}