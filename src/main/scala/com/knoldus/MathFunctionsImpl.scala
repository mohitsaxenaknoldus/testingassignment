package com.knoldus

class MathFunctionsImpl extends MathFunctions {

  override def checkPalindrome(num: Int): Boolean = {

    val numToString = num.toString

    if(numToString.equals(numToString.reverse))
      return true
    else
      return false
  }

  override def calculateFactorial(num: Int): Int = {

    if(num < 0)
      return -1

    var fact = 1

    for(i <- 1 to num)
    {
      fact = fact * i;
    }

    return fact
  }
}
