package validator

import com.knoldus.db.UserReadDto
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class UserValidatorTest extends FunSuite with MockitoSugar{

  val mockUserValidator = mock[UserValidator]
  val userImplObj = new UserImpl(mockUserValidator)
  val userReadDtoObject = new UserReadDto()

  test("Should return true as user one is valid"){
    when(mockUserValidator.userIsValid(userReadDtoObject.userOne)).thenReturn(true)
    assert(userImplObj.createUser(userReadDtoObject.userOne) != None)
  }

  test("Should return true as user two is valid"){
    when(mockUserValidator.userIsValid(userReadDtoObject.userTwo)).thenReturn(true)
    assert(userImplObj.createUser(userReadDtoObject.userTwo) != None)
  }
}