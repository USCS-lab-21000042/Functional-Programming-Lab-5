object test extends App{
    def prime(n: Int, x: Int = 2): Boolean = {
    if (n < 2) false
    else if (n == 2) true
    else if (n % x == 0) false
    else if (x * x > n) true
    else prime(n, x + 1)
  }

    println(prime(11))
    
}