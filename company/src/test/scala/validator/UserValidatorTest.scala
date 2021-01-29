package validator

import com.knoldus.db.UserReadDto
import com.knoldus.validator.UserValidator
import org.scalatest.FunSuite

class UserValidatorTest extends FunSuite {

  val userValidatorObject = new UserValidator()
  val userReadDtoObject = new UserReadDto()

  test("Should return true if user is valid"){
    assert(userValidatorObject.userIsValid(userReadDtoObject.userOne) === true)
  }
}