object test extends App{
    def tot(x:Int):Int={
        if (x==1) 1
        else x+tot(x-1)
    }

    println(tot(10))
}