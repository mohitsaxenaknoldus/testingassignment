package validator

import org.scalatest.FunSuite
import com.knoldus.validator.EmailValidator

class EmailValidatorTest extends FunSuite {

  val emailValidatorObject = new EmailValidator()
  val testEmailOne = "hello@gmail.com"
  val testEmailTwo = "hiyahoo.in"

  test("Should return true as hello@gmail.com is valid"){
    assert(emailValidatorObject.emailIdIsValid(testEmailOne) === true)
  }

  test("Should return true as hiyahoo.in is not valid"){
    assert(!emailValidatorObject.emailIdIsValid(testEmailTwo) === true)
  }
}