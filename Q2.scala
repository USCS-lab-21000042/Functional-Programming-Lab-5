object test extends App{
  // def GCD(x:Int,y:Int):Int={
  //   if y==0 a 
  //   else GCD(y,x%y)
  // }

  def printnumbers(n:Int,x:Int=2):Unit={
    if(prime(x) && x<n ){
      println(x)
      printnumbers(n,x+1)
    }
    else if(x<n) printnumbers(n,x+1)

  }


  def prime(n: Int, x: Int = 2): Boolean = {
    if (n < 2) false
    else if (n == 2) true
    else if (n % x == 0) false
    else if (x * x > n) true
    else prime(n, x + 1)
  }
  printnumbers(10)


























  //   def prime(n: Int, x: Int = 2): Boolean = {
  //   if (n < 2) false
  //   else if (n == 2) true
  //   else if (n % x == 0) false
  //   else if (x * x > n) true
  //   else prime(n, x + 1)
  // }
  //   // var x=prime(10)
  //   // if(x==x){
  //   //     printprime(10)
  //   // }

  //   def printprime(n:Int,y:Int=2):Int={
  //       if(x%y!=0) y
  //       if(x<y) printprime(n,y+1)
  //   }
  //   println(printprime(10))

}