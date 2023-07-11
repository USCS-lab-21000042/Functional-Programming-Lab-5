object test extends App{
    def fabo(x:Int,predecessor:Int=0 ,successor:Int=1,loop:Int=1):Int={
        if(x>loop) predecessor+successor+fabo(x,successor,predecessor+successor,loop+1)
        else 0
    }
    println(s"Total of Fibonacci number  is :${fabo(10)}")
}