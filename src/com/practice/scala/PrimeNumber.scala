package com.practice.scala

import scala.collection.mutable.ListBuffer

object PrimeNumber {

  var primes: ListBuffer[Boolean] = ListBuffer.fill(10)(true);
  /*
	 * Made use of Stream functionality and have taken first 10 prime numbers
	 */
  val primeNumber: Stream[Int] = 2 #:: Stream.from(3).filter(r => primeNumber.takeWhile { i => i * i <= r }.forall { k => r % k > 0 }).take(10);

  def main(args: Array[String]): Unit = {
    println("Is 5 is a prime number?")
    println(isPrime(5));
    println("Get first 10 prime numbers");
    primeNumber.foreach(println);
  }

  def generatePrimeNumber(upto: Int): ListBuffer[Int] = {
    var primeNumbers: ListBuffer[Int] = new ListBuffer();
    for (i <- 1 to upto by +1) {
      var counter = 0;
      for (j <- i to 1 by -1) {
        if (i % j == 0) {
          counter += 1;
        }
      }
      if (counter == 2) {
        primeNumbers += i;
      }
    }
    return primeNumbers;
  }

  def checkPrimeNumbers() {

    primes.update(0, false);
    primes.update(1, false);

    for (i <- 2 to primes.length - 1 by 1) {
      if (primes(i)) {
        for (j <- i to primes.length - 1 by 1) {
          if (i * j <= primes.length - 1) {
            primes.update(i * j, false);
          }
        }
      }
    }
  }

  def isPrime(index: Int): Boolean = {
    checkPrimeNumbers();
    return primes(index);
  }

}