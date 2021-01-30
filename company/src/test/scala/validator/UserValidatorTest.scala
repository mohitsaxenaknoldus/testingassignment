package validator

import com.knoldus.validator.UserValidator
import com.knoldus.models.User
import org.scalatest.FunSuite

class UserValidatorTest extends FunSuite {

  val userValidatorObject = new UserValidator()

  val testUserOne = new User("Virat", "Kohli", 29, "Knoldus", "viratkohli@gmail.com")
  val testUserTwo = new User("Rohit", "Sharma", 28, "Samsung", "rohitsharma@yahoo.in")

  test("Should return true as testUserOne is valid"){
    assert(userValidatorObject.userIsValid(testUserOne) === true)
  }

  test("Should return true as testUserTwo is not valid"){
    assert(!userValidatorObject.userIsValid(testUserTwo) === true)
  }
}