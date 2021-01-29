package request

import com.knoldus.db.UserReadDto
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.scalatest.FunSuite

class UserImplTest extends FunSuite {

  val userValidatorObj = new UserValidator()
  val userImplObj = new UserImpl(userValidatorObj)
  val userReadDtoObj = new UserReadDto()

  test("Should return Some if User One is created"){
    assert(userImplObj.createUser(userReadDtoObj.userOne) != None)
  }

  test("Should return Some if User Two is created"){
    assert(userImplObj.createUser(userReadDtoObj.userTwo) != None)
  }
}
