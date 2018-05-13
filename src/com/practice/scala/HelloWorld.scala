package com.practice.scala

object HelloWorld {

  val name: String = "Madhav"
  println(name)

  var firstName: String = "Madhav";
  var lastName: String = "Pandey";

  var (id: Int, age: Int) = Pair(340091, 26);

  def main(args: Array[String]) {
    var message = "Hello World!";
    println(message);
    println(firstName + " " + lastName);
    println(id);
  }

}