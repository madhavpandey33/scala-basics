package com.practice.scala

class Calculator(val dx: Int, val dy: Int) {

  val x = dx;
  val y = dy;

  def sum(): Unit = {
    println(x + y);
  }

  def multiply(): Unit = {
    println(x * y);
  }

}