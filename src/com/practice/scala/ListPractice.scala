package com.practice.scala

object ListMethods {

  def main(args: Array[String]): Unit = {
    var numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8);
    println("The squares of the number list are:")
    getSquares(numbers).foreach(println);
    println("\n The filtered number list are:");
    getFilteredNumberList(numbers).foreach(println);
    
    var studentNames :List[String] =  List("Austin", "Amenda", "Alice","Derrick", "Dean", "Evan");
    println("\n The filtered names are:");
    filterNames(studentNames).foreach(println);
  }

  /*
   * Returns the list of square of the input list
   */
  def getSquares(numbers: List[Int]): List[Int] = {
    var squaredNumber = numbers.map((i: Int) => i * i);
    return squaredNumber;
  }

  /*
   * Returns a list of number greater than 4
   */
  def getFilteredNumberList(num: List[Int]): List[Int] = {
    var filteredList = num.filter(i => i > 4);
    return filteredList;

  }
  
  /*
   * Returns a list of names starting with A
   */
  def filterNames(namesList:List[String]):List[String] ={
    var filteredNameList :List[String] = namesList.filter(p => p.toLowerCase().startsWith("a"));
    return filteredNameList;
  }

}