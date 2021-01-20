import org.scalatest.FunSuite
import com.knoldus.MathFunctionsImpl

class MathFunctionsImplTest extends FunSuite {

  val mathFunctionsImplObject = new MathFunctionsImpl()

  //===============Palindrome Testcases=====================
  //========================================================

  test("Should return true as 121 is palindrome"){
    assert(mathFunctionsImplObject.checkPalindrome(121) === true)
  }

  test("Should return true as 1 is palindrome"){
    assert(mathFunctionsImplObject.checkPalindrome(1) === true)
  }

  test("Should return true as 0 is palindrome"){
    assert(mathFunctionsImplObject.checkPalindrome(0) === true)
  }

  test("Should not return true as negative numbers are not palindromes"){
    assert(!mathFunctionsImplObject.checkPalindrome(-1) === true)
  }

  //===============Factorial Testcases======================
  //========================================================

  test("Factorial of 0 should be 1"){
    assert(mathFunctionsImplObject.calculateFactorial(0) === 1)
  }

  test("Factorial of a negative number is not defined, hence return -1"){
    assert(mathFunctionsImplObject.calculateFactorial(-1) === -1)
  }

  test("Factorial of 1 should be 1"){
    assert(mathFunctionsImplObject.calculateFactorial(0) === 1)
  }
}
